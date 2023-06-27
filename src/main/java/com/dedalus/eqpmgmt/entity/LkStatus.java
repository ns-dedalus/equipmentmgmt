package com.dedalus.eqpmgmt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "LkStatus")
public class LkStatus {
	@Id
	@Column(name = "StatusId" )
    private Integer statusId;
	@Column(name = "StatusTypeId" )
    private Integer statusTypeId;
    @Column(name = "StatusName" )
    private String statusName;
    @Column(name = "StatusDisplayName" )
    private String statusDisplayName;

    public Integer getStatusTypeId() {
		return statusTypeId;
	}

	public void setStatusTypeId(Integer statusTypeId) {
		this.statusTypeId = statusTypeId;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getStatusDisplayName() {
		return statusDisplayName;
	}

	public void setStatusDisplayName(String statusDisplayName) {
		this.statusDisplayName = statusDisplayName;
	}

	@ManyToOne
    @JoinColumn(name = "StatusTypeId", insertable = false, updatable = false)
    private LkStatusType statusType;
	
	public LkStatusType getStatusType() {
		return statusType;
	}

	public void setStatusType(LkStatusType statusType) {
		this.statusType = statusType;
	}



}
