package com.dedalus.eqpmgmt.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dedalus.eqpmgmt.entity.Equipment;
import com.dedalus.eqpmgmt.repository.EquipmentRepository;
import com.dedalus.eqpmgmt.service.EquipmentService;

@Service
@Transactional
public class EquipmentServiceImpl implements EquipmentService {

	private EquipmentRepository equipmentRepository; 
	EquipmentServiceImpl(EquipmentRepository equipmentRepository) {
		super();
		this.equipmentRepository = equipmentRepository;
	}
	@Override
	public Equipment createEquipment(Equipment equipment) {
		return this.equipmentRepository.save(equipment);
	}
	@Override
	public List<Equipment> findAllEquipments() {
		return this.equipmentRepository.findAll();
	}

}
