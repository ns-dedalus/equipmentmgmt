package com.dedalus.eqpmgmt.service;

import java.util.List;

import com.dedalus.eqpmgmt.entity.LkStatus;

public interface LkStatusService {
	List<LkStatus> findByStatusTypeId(Integer statusTypeId);
}
