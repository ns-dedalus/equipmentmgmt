package com.dedalus.eqpmgmt.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dedalus.eqpmgmt.entity.ServicePoint;
import com.dedalus.eqpmgmt.repository.ServicePointRepository;
import com.dedalus.eqpmgmt.service.ServicePointService;

@Service
@Transactional
public class ServicePointServiceImpl implements ServicePointService {

	private ServicePointRepository servicePointRepository; 
	ServicePointServiceImpl(ServicePointRepository servicePointRepository) {
		super();
		this.servicePointRepository = servicePointRepository;
	}
	@Override
	public ServicePoint createServicePoint(ServicePoint ServicePoint) {
		return this.servicePointRepository.save(ServicePoint);
	}
	@Override
	public List<ServicePoint> findAllServicePoints() {
		return this.servicePointRepository.findAll();
	}

}
