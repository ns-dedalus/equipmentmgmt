package com.dedalus.eqpmgmt.service;

import java.util.Optional;

import com.dedalus.eqpmgmt.entity.LkStatusType;
import com.dedalus.eqpmgmt.entity.LkTypeGroup;

public interface LkStatusTypeService {
	Optional<LkStatusType> findByStatusTypeName(String statusTypeName);
}
