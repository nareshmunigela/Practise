package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ergossoft.serviceorder.model.Material;

public interface MaterialRepository extends JpaRepository<Material, Integer>{
	
	@Query("select m from Material m where m.materialId=?1")
	List<Material> findMaterials(int materialId);
	
	
	@Query("select m from Material m where m.materialCode like %?1% or m.name like %?1% or m.description like %?1%"
			+ "or m.manufacturer like %?1% or m.modelNumber like %?1% ")
	List<Material> findMaterialsBySearchKey(String key);
}
