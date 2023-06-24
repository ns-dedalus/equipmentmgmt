package com.dedalus.eqpmgmt.service;

import com.dedalus.eqpmgmt.entity.Equipment;
import java.util.List;

public interface EquipmentService {
	Equipment createEquipment(Equipment equipment);
	List<Equipment> findAllEquipments();
}
