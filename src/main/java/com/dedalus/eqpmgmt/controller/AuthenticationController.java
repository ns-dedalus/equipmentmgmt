package com.dedalus.eqpmgmt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dedalus.eqpmgmt.entity.ApplicationUser;
import com.dedalus.eqpmgmt.pojo.LoginRequest;
import com.dedalus.eqpmgmt.pojo.LoginResponse;
import com.dedalus.eqpmgmt.pojo.RegisterUser;
import com.dedalus.eqpmgmt.repository.ApplicationUserRepository;
import com.dedalus.eqpmgmt.security.JWTGenerator;

@RestController()
public class AuthenticationController {
	
	private AuthenticationManager authenticationManager;
    private ApplicationUserRepository userRepository;
    private PasswordEncoder passwordEncoder;
    private JWTGenerator jwtGenerator;

    public AuthenticationController(AuthenticationManager authenticationManager, ApplicationUserRepository userRepository,
    		PasswordEncoder passwordEncoder, JWTGenerator jwtGenerator) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest){
    	UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
        		loginRequest.getUsername(),
        		loginRequest.getPassword()); 
    	Authentication authentication = authenticationManager.authenticate(authToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtGenerator.generateToken(authentication);
        return new ResponseEntity<>(new LoginResponse(token), HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterUser registerUser) {
        if (userRepository.existsByUserName(registerUser.getUsername())) {
            return new ResponseEntity<>("Username is taken!", HttpStatus.BAD_REQUEST);
        }
        ApplicationUser user = new ApplicationUser();
        user.setUserName(registerUser.getUsername());
        String encryptedPassword = passwordEncoder.encode((registerUser.getPassword()));
        user.setUserPassword(encryptedPassword);
        userRepository.save(user);
        return new ResponseEntity<>("User registered success!", HttpStatus.OK);
    }
}

