package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ergossoft.serviceorder.model.MaterialType;

public interface MaterialTypeRepository extends JpaRepository<MaterialType, Integer> {
	
	@Query("select m from MaterialType m where m.status=true")
	List<MaterialType> getAllMaterialType();

}
