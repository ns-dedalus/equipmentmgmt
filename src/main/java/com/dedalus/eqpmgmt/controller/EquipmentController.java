package com.dedalus.eqpmgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dedalus.eqpmgmt.entity.ApplicationUser;
import com.dedalus.eqpmgmt.entity.Equipment;
import com.dedalus.eqpmgmt.entity.Student;
import com.dedalus.eqpmgmt.service.ApplicationUserService;
import com.dedalus.eqpmgmt.service.EquipmentService;
import com.dedalus.eqpmgmt.service.StudentService;
import java.util.List;

@RestController
public class EquipmentController {

	@Autowired
	ApplicationUserService applicationUserService;
	@Autowired
	EquipmentService equipmentService;

	public EquipmentController() {
		super();
		System.out.println("EquipmentController");
		//this.equipmentService = equipmentService;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/addUser")
	public ResponseEntity<ApplicationUser> createApplicationUser(@RequestBody ApplicationUser applicationUser) {
		System.out.println("createApplicationUser");
		return new ResponseEntity<ApplicationUser>(this.applicationUserService.createApplicationUser(applicationUser), HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/api/equipments")
	public ResponseEntity<List<Equipment>> listEquipment() {
		System.out.println("listEquipment");
		return new ResponseEntity<List<Equipment>>(this.equipmentService.findAllEquipments(), HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/api/equipments")
	public ResponseEntity<Equipment> createEquipment(@RequestBody Equipment equipment) {
		System.out.println("createEquipment");
		return new ResponseEntity<Equipment>(this.equipmentService.createEquipment(equipment), HttpStatus.CREATED);
	}

}
