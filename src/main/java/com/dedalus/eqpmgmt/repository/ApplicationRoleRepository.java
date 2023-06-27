package com.dedalus.eqpmgmt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dedalus.eqpmgmt.entity.ApplicationRole;

public interface ApplicationRoleRepository extends JpaRepository<ApplicationRole, Integer> {
	Optional<ApplicationRole> findByApplicationRoleName(String name);
}

