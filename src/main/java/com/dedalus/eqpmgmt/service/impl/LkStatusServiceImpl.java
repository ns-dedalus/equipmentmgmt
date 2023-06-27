package com.dedalus.eqpmgmt.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dedalus.eqpmgmt.entity.LkStatus;
import com.dedalus.eqpmgmt.repository.LkStatusRepository;
import com.dedalus.eqpmgmt.service.LkStatusService;

@Service
public class LkStatusServiceImpl implements LkStatusService {

	private LkStatusRepository lkStatusRepository; 
	LkStatusServiceImpl(LkStatusRepository lkStatusRepository) {
		super();
		this.lkStatusRepository = lkStatusRepository;
	}
	
	@Override
	public List<LkStatus> findByStatusTypeId(Integer statusTypeId) {
		return this.lkStatusRepository.findByStatusTypeId(statusTypeId);	
	}

}
