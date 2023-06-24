package com.dedalus.eqpmgmt.service.impl;

import org.springframework.stereotype.Service;

import com.dedalus.eqpmgmt.repository.LkTypeGroupRepository;
import com.dedalus.eqpmgmt.service.LkTypeGroupService;

@Service
public class LkTypeGroupServiceImpl implements LkTypeGroupService {

	private LkTypeGroupRepository lkTypeGroupRepository; 
	LkTypeGroupServiceImpl(LkTypeGroupRepository lkTypeGroupRepository) {
		super();
		this.lkTypeGroupRepository = lkTypeGroupRepository;
	}

}
