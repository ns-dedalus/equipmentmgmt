package com.dedalus.eqpmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dedalus.eqpmgmt.entity.Equipment;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
