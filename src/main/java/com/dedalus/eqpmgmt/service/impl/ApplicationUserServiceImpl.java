package com.dedalus.eqpmgmt.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dedalus.eqpmgmt.entity.ApplicationUser;
import com.dedalus.eqpmgmt.repository.ApplicationUserRepository;
import com.dedalus.eqpmgmt.service.ApplicationUserService;

@Service
@Transactional
public class ApplicationUserServiceImpl implements ApplicationUserService {

	private ApplicationUserRepository ApplicationUserRepository; 
	ApplicationUserServiceImpl(ApplicationUserRepository applicationUserRepository) {
		super();
		this.ApplicationUserRepository = applicationUserRepository;
	}
	@Override
	public ApplicationUser createApplicationUser(ApplicationUser ApplicationUser) {
		return this.ApplicationUserRepository.save(ApplicationUser);
	}

}
