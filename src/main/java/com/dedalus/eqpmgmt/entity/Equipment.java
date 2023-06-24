package com.dedalus.eqpmgmt.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Equipment")
public class Equipment {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(name = "EquipmentId" )
    private Integer equipmentId;
    @Column(name = "EquipmentTypeId" )
    private Integer equipmentTypeId;
    @Column(name = "EquipmentNo" , nullable = false, unique = true)
    private String equipmentNo;
    @Column(name = "WorkingStatusId" )
    private Integer workingStatusId;
    @Column(name = "ServicePointId", nullable = true )
    private Integer servicePointId;
    @Column(name = "ExpiryDate" )
    private Date expiryDate;
    
    @ManyToOne
    @JoinColumn(name = "EquipmentTypeId", insertable = false, updatable = false)
    private LkType equipmentType;
    
    @ManyToOne
    @JoinColumn(name = "ServicePointId", insertable = false, updatable = false)
    private ServicePoint servicePoint;
    
    @ManyToOne
    @JoinColumn(name = "WorkingStatusId", insertable = false, updatable = false)
    private LkStatus WorkingStatus;

	public Integer getEquipmentId() {
		return equipmentId;
	}

	public void setEquipmentId(Integer equipmentId) {
		this.equipmentId = equipmentId;
	}

	public Integer getEquipmentTypeId() {
		return equipmentTypeId;
	}

	public void setEquipmentTypeId(Integer equipmentTypeId) {
		this.equipmentTypeId = equipmentTypeId;
	}

	public String getEquipmentNo() {
		return equipmentNo;
	}

	public void setEquipmentNo(String equipmentNo) {
		this.equipmentNo = equipmentNo;
	}

	public Integer getWorkingStatusId() {
		return workingStatusId;
	}

	public void setWorkingStatusId(Integer workingStatusId) {
		this.workingStatusId = workingStatusId;
	}

	public Integer getServicePointId() {
		return servicePointId;
	}

	public void setServicePointId(Integer servicePointId) {
		this.servicePointId = servicePointId;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public LkType getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(LkType equipmentType) {
		this.equipmentType = equipmentType;
	}

	public ServicePoint getServicePoint() {
		return servicePoint;
	}

	public void setServicePoint(ServicePoint servicePoint) {
		this.servicePoint = servicePoint;
	}

	public LkStatus getWorkingStatus() {
		return WorkingStatus;
	}

	public void setWorkingStatus(LkStatus workingStatus) {
		WorkingStatus = workingStatus;
	}
    
    
}