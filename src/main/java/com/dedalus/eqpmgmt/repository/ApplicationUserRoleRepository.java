package com.dedalus.eqpmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dedalus.eqpmgmt.entity.ApplicationUserRole;

public interface ApplicationUserRoleRepository extends JpaRepository<ApplicationUserRole, Integer> {
	
}
