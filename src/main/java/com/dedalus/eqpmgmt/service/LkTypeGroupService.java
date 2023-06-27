package com.dedalus.eqpmgmt.service;

import java.util.Optional;

import com.dedalus.eqpmgmt.entity.LkTypeGroup;

public interface LkTypeGroupService {
	Optional<LkTypeGroup> findByTypeGroupName(String typeGroupName);
}
