package com.dedalus.eqpmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dedalus.eqpmgmt.entity.ApplicationUser;
import com.dedalus.eqpmgmt.entity.EquipmentMovement;

@Repository
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Integer> {

}
