package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ergossoft.serviceorder.model.EquipmentType;
@Repository
public interface EquipmentTypeRepository extends JpaRepository<EquipmentType, Integer>{

	@Query("select e from EquipmentType e where e.status = 1")
	List<EquipmentType> getEquipmentTypes();
}
