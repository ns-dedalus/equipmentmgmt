//Verified
package com.dedalus.eqpmgmt.security;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.dedalus.eqpmgmt.entity.ApplicationUser;
import com.dedalus.eqpmgmt.entity.ApplicationRole;
import com.dedalus.eqpmgmt.repository.ApplicationRoleRepository;
import com.dedalus.eqpmgmt.repository.ApplicationUserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private ApplicationUserRepository applicationUserRepository;
	@Autowired
	private ApplicationRoleRepository applicationRoleRepository;
	
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	ApplicationUser user = applicationUserRepository.findByUserName(username).orElseThrow(() -> new UsernameNotFoundException("Username not found"));
    	System.out.println(username);
    	ApplicationRole role = applicationRoleRepository.findByApplicationRoleName("User").orElseThrow(() -> new UsernameNotFoundException("Rolename not found"));
    	List<ApplicationRole> roles = Arrays.asList(role);  //user.getRoles()
    	return new User(user.getUserName(), user.getUserPassword(), mapRolesToAuthorities(roles));
    }
    
     private Collection<GrantedAuthority> mapRolesToAuthorities(List<ApplicationRole> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getApplicationRoleName())).collect(Collectors.toList());
    }
    
}
