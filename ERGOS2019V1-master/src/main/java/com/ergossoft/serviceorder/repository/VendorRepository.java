package com.ergossoft.serviceorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ergossoft.serviceorder.model.Vendor;
@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer> 
{
	

}
