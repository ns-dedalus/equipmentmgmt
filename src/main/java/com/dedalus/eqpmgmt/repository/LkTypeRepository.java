package com.dedalus.eqpmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dedalus.eqpmgmt.entity.LkType;

@Repository
public interface LkTypeRepository extends JpaRepository<LkType, Integer> {

}
