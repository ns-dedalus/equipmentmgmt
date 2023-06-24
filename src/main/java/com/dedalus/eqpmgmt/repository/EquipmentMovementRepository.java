package com.dedalus.eqpmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dedalus.eqpmgmt.entity.EquipmentMovement;

@Repository
public interface EquipmentMovementRepository extends JpaRepository<EquipmentMovement, Integer> {

}
