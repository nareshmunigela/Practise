package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ergossoft.serviceorder.model.Equipment;
@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Integer>{

	@Query("select e from Equipment e where e.siteID=?1")
	List<Equipment> findEquipments(int siteID);
}
