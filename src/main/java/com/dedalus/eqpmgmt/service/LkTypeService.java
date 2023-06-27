package com.dedalus.eqpmgmt.service;

import java.util.List;

import com.dedalus.eqpmgmt.entity.LkStatus;
import com.dedalus.eqpmgmt.entity.LkType;

public interface LkTypeService {
	LkType createLkType(LkType lkType);
	List<LkType> findAllByTypeGroupId(Integer typeGroupId);
}
