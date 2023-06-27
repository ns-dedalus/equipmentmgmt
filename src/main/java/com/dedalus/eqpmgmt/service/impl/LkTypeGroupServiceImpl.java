package com.dedalus.eqpmgmt.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dedalus.eqpmgmt.entity.LkTypeGroup;
import com.dedalus.eqpmgmt.repository.LkTypeGroupRepository;
import com.dedalus.eqpmgmt.service.LkTypeGroupService;

@Service
public class LkTypeGroupServiceImpl implements LkTypeGroupService {

	private LkTypeGroupRepository lkTypeGroupRepository; 
	LkTypeGroupServiceImpl(LkTypeGroupRepository lkTypeGroupRepository) {
		super();
		this.lkTypeGroupRepository = lkTypeGroupRepository;
	}
	@Override
	public Optional<LkTypeGroup> findByTypeGroupName(String typeGroupName) {
		return this.lkTypeGroupRepository.findByTypeGroupName(typeGroupName);
	}

}
