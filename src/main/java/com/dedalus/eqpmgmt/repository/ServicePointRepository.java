package com.dedalus.eqpmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dedalus.eqpmgmt.entity.ServicePoint;

@Repository
public interface ServicePointRepository extends JpaRepository<ServicePoint, Integer> {

}
