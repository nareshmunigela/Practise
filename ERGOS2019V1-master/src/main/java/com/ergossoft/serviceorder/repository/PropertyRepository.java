package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ergossoft.serviceorder.model.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Integer>{

	@Query("select property from Property property where property.status=true")
	public List<Property> getActiveProperties();
}
