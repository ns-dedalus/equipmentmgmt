package com.dedalus.eqpmgmt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dedalus.eqpmgmt.entity.LkStatusType;
import com.dedalus.eqpmgmt.entity.LkTypeGroup;

@Repository
public interface LkTypeGroupRepository extends JpaRepository<LkTypeGroup, Integer> {
	Optional<LkTypeGroup> findByTypeGroupName(String name);
}