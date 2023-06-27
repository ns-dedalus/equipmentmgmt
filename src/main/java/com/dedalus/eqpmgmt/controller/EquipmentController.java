package com.dedalus.eqpmgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dedalus.eqpmgmt.entity.Equipment;
import com.dedalus.eqpmgmt.entity.LkStatus;
import com.dedalus.eqpmgmt.entity.LkStatusType;
import com.dedalus.eqpmgmt.entity.LkType;
import com.dedalus.eqpmgmt.entity.LkTypeGroup;
import com.dedalus.eqpmgmt.entity.ServicePoint;
import com.dedalus.eqpmgmt.service.ApplicationUserService;
import com.dedalus.eqpmgmt.service.EquipmentService;
import com.dedalus.eqpmgmt.service.LkStatusService;
import com.dedalus.eqpmgmt.service.LkStatusTypeService;
import com.dedalus.eqpmgmt.service.LkTypeGroupService;
import com.dedalus.eqpmgmt.service.LkTypeService;
import com.dedalus.eqpmgmt.service.ServicePointService;

import java.util.List;

@RestController
public class EquipmentController {

	@Autowired
	ApplicationUserService applicationUserService;
	@Autowired
	EquipmentService equipmentService;
	@Autowired
	LkStatusService statusService;
	@Autowired
	LkStatusTypeService statusTypeService;
	@Autowired
	LkTypeService typeService;
	@Autowired
	LkTypeGroupService typeGroupService;
	@Autowired
	ServicePointService servicePointService;
	
	public EquipmentController() {
		super();
		System.out.println("EquipmentController");
	}

	@GetMapping("/api/listWorkingStatuses")
	public ResponseEntity<List<LkStatus>> listWorkingStatuses() throws Exception {
		LkStatusType statusType = this.statusTypeService.findByStatusTypeName("EqWorkingStatus").orElseThrow( () -> new Exception() );
		return new ResponseEntity<List<LkStatus>>(this.statusService.findByStatusTypeId(statusType.getStatusTypeId()), HttpStatus.OK);
	}

	@GetMapping("/api/listEquipmentTypes")
	public ResponseEntity<List<LkType>> listEquipmentTypes() throws Exception {
		LkTypeGroup typeGroup = this.typeGroupService.findByTypeGroupName("EquipmentType").orElseThrow( () -> new Exception() );
		return new ResponseEntity<List<LkType>>(this.typeService.findAllByTypeGroupId(typeGroup.getTypeGroupId()), HttpStatus.OK);
	}
	
	@PostMapping("/api/equipment")
	public ResponseEntity<Equipment> createEquipment(@RequestBody Equipment equipment) {
		System.out.println("createEquipment");
		return new ResponseEntity<Equipment>(this.equipmentService.createEquipment(equipment), HttpStatus.CREATED);
	}

	@GetMapping("/api/equipment")
	public ResponseEntity<List<Equipment>> listEquipment(
			@RequestParam(value = "idStartsWith", defaultValue = "", required = false) String equipmentIdStartsWith, 
			@RequestParam(value = "sortBy", defaultValue = "EquipmentNo", required = false) String sortBy, 
			@RequestParam(value = "descending", defaultValue = "false", required = false) Boolean descOrder,
			@RequestParam(value = "pageNo", defaultValue = "0", required = false) int pageNo,
            @RequestParam(value = "pageSize", defaultValue = "10", required = false) int pageSize
			) {
		return new ResponseEntity<List<Equipment>>(this.equipmentService.findAllEquipments(equipmentIdStartsWith, sortBy, descOrder, pageNo, pageSize), HttpStatus.OK);
	}
	
	@PutMapping("/api/equipment")
	public ResponseEntity<Equipment> updateEquipment(@RequestBody Equipment equipment) {
		Equipment equipmentTobeUpdated = this.equipmentService.findByEquipmentId(equipment.getEquipmentId());
		equipmentTobeUpdated.setExpiryDate(equipment.getExpiryDate());
		equipmentTobeUpdated.setWorkingStatusId(equipment.getWorkingStatusId());
		equipmentTobeUpdated.setServicePointId(equipment.getServicePointId());
		return new ResponseEntity<Equipment>(this.equipmentService.updateEquipment(equipmentTobeUpdated), HttpStatus.CREATED);
	}
	
	@PutMapping("/api/equipmentServicePoint")
	public ResponseEntity<Equipment> updateServicePoint(@RequestBody Equipment equipment) {
		Equipment equipmentTobeUpdated = this.equipmentService.findByEquipmentId(equipment.getEquipmentId());
		equipmentTobeUpdated.setServicePointId(equipment.getServicePointId());
		return new ResponseEntity<Equipment>(this.equipmentService.updateEquipment(equipment), HttpStatus.CREATED);
	}
	
	@PutMapping("/api/equipmentStatus")
	public ResponseEntity<Equipment> updateWorkingStatus(@RequestBody Equipment equipment) {
		Equipment equipmentTobeUpdated = this.equipmentService.findByEquipmentId(equipment.getEquipmentId());
		equipmentTobeUpdated.setWorkingStatusId(equipment.getWorkingStatusId());
		return new ResponseEntity<Equipment>(this.equipmentService.updateEquipment(equipment), HttpStatus.CREATED);
	}

	@PostMapping("/api/servicepoints")
	public ResponseEntity<ServicePoint> createServicePoint(@RequestBody ServicePoint servicePoint) {
		return new ResponseEntity<ServicePoint>(this.servicePointService.createServicePoint(servicePoint), HttpStatus.CREATED);
	}

	@GetMapping("/api/servicepoints")
	public ResponseEntity<List<ServicePoint>> listServicePoint() {
		return new ResponseEntity<List<ServicePoint>>(this.servicePointService.findAllServicePoints(), HttpStatus.OK);
	}
	
	@GetMapping("/api/equipmentAvail")
	public ResponseEntity<List<Equipment>> listEquipmentAvailablity() {
		return new ResponseEntity<List<Equipment>>(this.equipmentService.findAllEquipments(), HttpStatus.OK);
	}

	@GetMapping("/api/equipmentUsage")
	public ResponseEntity<List<Equipment>> listEquipmentUsage() {
		return new ResponseEntity<List<Equipment>>(this.equipmentService.findAllEquipments(), HttpStatus.OK);
	}

	@GetMapping("/api/equipmentMovement/{equipmentId}")
	public ResponseEntity<List<Equipment>> listEquipmentMovement(@PathVariable("equipmentId") int equipmentId) {
		return new ResponseEntity<List<Equipment>>(this.equipmentService.findAllEquipments(), HttpStatus.OK);
	}

}
