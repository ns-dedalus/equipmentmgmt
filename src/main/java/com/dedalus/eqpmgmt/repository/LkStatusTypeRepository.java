package com.dedalus.eqpmgmt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dedalus.eqpmgmt.entity.ApplicationRole;
import com.dedalus.eqpmgmt.entity.LkStatusType;

@Repository
public interface LkStatusTypeRepository extends JpaRepository<LkStatusType, Integer>  {
	Optional<LkStatusType> findByStatusTypeName(String name);
}
