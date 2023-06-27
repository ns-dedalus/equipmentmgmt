package com.dedalus.eqpmgmt.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dedalus.eqpmgmt.entity.LkStatusType;
import com.dedalus.eqpmgmt.repository.LkStatusTypeRepository;
import com.dedalus.eqpmgmt.service.LkStatusTypeService;

@Service
public class LkStatusTypeServiceImpl implements LkStatusTypeService {

	private LkStatusTypeRepository lkStatusTypeRepository; 
	LkStatusTypeServiceImpl(LkStatusTypeRepository lkStatusTypeRepository) {
		super();
		this.lkStatusTypeRepository = lkStatusTypeRepository;
	}
	@Override
	public Optional<LkStatusType> findByStatusTypeName(String statusTypeName) {
		return this.lkStatusTypeRepository.findByStatusTypeName(statusTypeName);
	}
}
