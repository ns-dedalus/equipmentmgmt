package com.dedalus.eqpmgmt.service.impl;

import org.springframework.stereotype.Service;

import com.dedalus.eqpmgmt.repository.EquipmentMovementRepository;
import com.dedalus.eqpmgmt.service.EquipmentMovementService;

@Service
public class EquipmentMovementServiceImpl implements EquipmentMovementService {

	private EquipmentMovementRepository equipmentMovementRepository; 
	EquipmentMovementServiceImpl(EquipmentMovementRepository equipmentMovementRepository) {
		super();
		this.equipmentMovementRepository = equipmentMovementRepository;
	}
}
