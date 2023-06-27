package com.dedalus.eqpmgmt.service;

import java.util.List;

import com.dedalus.eqpmgmt.entity.Equipment;
import com.dedalus.eqpmgmt.entity.ServicePoint;

public interface ServicePointService {
	ServicePoint createServicePoint(ServicePoint servicePoint);
	List<ServicePoint> findAllServicePoints();
}
