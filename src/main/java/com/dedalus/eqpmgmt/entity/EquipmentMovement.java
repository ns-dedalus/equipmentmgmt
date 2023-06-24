package com.dedalus.eqpmgmt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

import java.util.Date;

@Entity
@Table(name = "EquipmentMovement")
public class EquipmentMovement {

    @Id
    @Column(name = "ServicePointId" )
    private Integer equipmentMovementId;
    @Column(name = "FromServicePointId" )
    private Integer fromServicePointId;
    @Column(name = "ToServicePointId" )
    private Integer toServicePointId;
    @Column(name = "MovedAt" )
    private Date movedAt;

    @ManyToOne
    @JoinColumn(name = "EquipmentId", insertable = false, updatable = false)
    private Equipment equipment;

    @ManyToOne
    @JoinColumn(name = "FromServicePointId", insertable = false, updatable = false)
    private ServicePoint fromServicePoint;

    @ManyToOne
    @JoinColumn(name = "ToServicePointId", insertable = false, updatable = false)
    private ServicePoint toServicePoint;
}
