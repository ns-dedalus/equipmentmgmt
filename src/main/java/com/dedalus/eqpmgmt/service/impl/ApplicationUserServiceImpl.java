package com.dedalus.eqpmgmt.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dedalus.eqpmgmt.entity.ApplicationUser;
import com.dedalus.eqpmgmt.pojo.RegisterUser;
import com.dedalus.eqpmgmt.repository.ApplicationUserRepository;
import com.dedalus.eqpmgmt.service.ApplicationUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
@Transactional
public class ApplicationUserServiceImpl implements ApplicationUserService {

	private ApplicationUserRepository applicationUserRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;

	ApplicationUserServiceImpl(ApplicationUserRepository applicationUserRepository) {
		super();
		this.applicationUserRepository = applicationUserRepository;
	}

	@Override
	public ApplicationUser createApplicationUser(RegisterUser registerUser) {
		ApplicationUser user = new ApplicationUser();
		user.setUserName(registerUser.getUsername());
		user.setUserPassword(passwordEncoder.encode(registerUser.getPassword()));
		return this.applicationUserRepository.save(user);
	}

	@Override
	public ApplicationUser getApplicationUser(String userName) {
		return this.applicationUserRepository.findByUserName(userName).orElseThrow();
	}

}
