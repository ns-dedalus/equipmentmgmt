package com.dedalus.eqpmgmt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ServicePoint")
public class ServicePoint {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(name = "ServicePointId" )
    private Integer servicePointId;
    @Column(name = "ServicePointName" )
    private String servicePointName;
    
	public Integer getServicePointId() {
		return servicePointId;
	}
	public void setServicePointId(Integer servicePointId) {
		this.servicePointId = servicePointId;
	}
	public String getServicePointName() {
		return servicePointName;
	}
	public void setServicePointName(String servicePointName) {
		this.servicePointName = servicePointName;
	}


}
