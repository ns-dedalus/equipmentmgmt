package com.dedalus.eqpmgmt.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dedalus.eqpmgmt.entity.LkType;
import com.dedalus.eqpmgmt.repository.LkTypeRepository;
import com.dedalus.eqpmgmt.service.LkTypeService;

@Service
@Transactional
public class LkTypeServiceImpl implements LkTypeService {

	private LkTypeRepository lkTypeRepository; 
	LkTypeServiceImpl(LkTypeRepository lkTypeRepository) {
		super();
		this.lkTypeRepository = lkTypeRepository;
	}
	@Override
	public LkType createLkType(LkType lkType) {
		return this.lkTypeRepository.save(lkType);
	}

}
