package com.dedalus.eqpmgmt.service.impl;

import org.springframework.stereotype.Service;

import com.dedalus.eqpmgmt.repository.LkStatusTypeRepository;
import com.dedalus.eqpmgmt.service.LkStatusTypeService;

@Service
public class LkStatusTypeServiceImpl implements LkStatusTypeService {

	private LkStatusTypeRepository lkStatusTypeRepository; 
	LkStatusTypeServiceImpl(LkStatusTypeRepository lkStatusTypeRepository) {
		super();
		this.lkStatusTypeRepository = lkStatusTypeRepository;
	}
}
