package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ergossoft.serviceorder.model.PhoneType;
import com.ergossoft.serviceorder.model.Property;

@Repository
public interface PhoneTypeRepository extends JpaRepository<PhoneType, Integer>{

	@Query("select phoneType from PhoneType phoneType where phoneType.status=true")
	public List<PhoneType> getActivePhoneTypes();
}
