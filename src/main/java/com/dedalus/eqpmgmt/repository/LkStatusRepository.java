package com.dedalus.eqpmgmt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dedalus.eqpmgmt.entity.LkStatusType;
import com.dedalus.eqpmgmt.entity.LkStatus;

@Repository
public interface LkStatusRepository extends JpaRepository<LkStatus, Integer> {

	List<LkStatus> findByStatusTypeId(Integer statusTypeId);

}

