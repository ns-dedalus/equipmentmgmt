package com.dedalus.eqpmgmt.security;


import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.dedalus.eqpmgmt.entity.ApplicationUser;
import com.dedalus.eqpmgmt.service.ApplicationUserService;

import org.springframework.security.core.AuthenticationException;

@Component
public class PasswordAuthenticationProvider  implements AuthenticationProvider {

	private PasswordEncoder passwordEncoder;
	private UserDetailsService userDetailsService;

	public PasswordAuthenticationProvider(UserDetailsService userDetailsService, PasswordEncoder passwordEncoder) {
		System.out.println("UserNamePasswordAuthentication");
		this.userDetailsService = userDetailsService;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String userName = authentication.getName();
		String password = authentication.getCredentials().toString();
		
		UserDetails details;
		try {
			details = this.userDetailsService.loadUserByUsername(userName);	
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		String dbpassword = details.getPassword();

		boolean passwordMatches = passwordEncoder.matches(password, dbpassword);
		
		System.out.println(passwordMatches ? "Matched" : "Not matched");
	
		if (passwordMatches) {
			return new UsernamePasswordAuthenticationToken(details.getUsername(), details.getPassword()) ;	
		}
		else {
			throw new BadCredentialsException("Username/Password does not match");
		}
		
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}
}
