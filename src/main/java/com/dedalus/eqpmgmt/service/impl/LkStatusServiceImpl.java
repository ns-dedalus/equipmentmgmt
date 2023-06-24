package com.dedalus.eqpmgmt.service.impl;

import org.springframework.stereotype.Service;

import com.dedalus.eqpmgmt.repository.LkStatusRepository;
import com.dedalus.eqpmgmt.service.LkStatusService;

@Service
public class LkStatusServiceImpl implements LkStatusService {

	private LkStatusRepository lkStatusRepository; 
	LkStatusServiceImpl(LkStatusRepository lkStatusRepository) {
		super();
		this.lkStatusRepository = lkStatusRepository;
	}

}
