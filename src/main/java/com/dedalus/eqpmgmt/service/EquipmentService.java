package com.dedalus.eqpmgmt.service;

import com.dedalus.eqpmgmt.entity.Equipment;
import java.util.List;

public interface EquipmentService {
	Equipment createEquipment(Equipment equipment);
	List<Equipment> findAllEquipments();
	List<Equipment> findAllEquipments(String euipmentIdStartsWith, String sortBy, Boolean descOrder, int pageNo, int pageSize);
	Equipment updateEquipment(Equipment equipmentTobeUpdated);
	Equipment findByEquipmentId(int equipmentId);
}
