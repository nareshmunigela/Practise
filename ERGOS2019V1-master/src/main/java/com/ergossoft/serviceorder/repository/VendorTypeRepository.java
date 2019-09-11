package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ergossoft.serviceorder.model.VendorType;

public interface VendorTypeRepository extends JpaRepository<VendorType, Integer> {
	
	@Query("select v from VendorType v where v.status=true")
	List<VendorType> getAllVendorType();

}
