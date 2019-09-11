package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ergossoft.serviceorder.model.ServiceOrderContact;

public interface ServiceOrderContactRepository extends JpaRepository<ServiceOrderContact, Integer>{

	/*
	 * @Query("select s from ServiceOrderContact s where s.serviceOrderId = ?1")
	 * List<ServiceOrderContact> findServiceOrderContacts(int serviceOrderId);
	 */
	
	
	@Query("select s.contactId from ServiceOrderContact s where s.serviceOrderId = ?1 and s.mappingType = ?2 and s.primary =1")
	Integer findSitePrimaryContactId(int soId, String mappingType);
	
	
	 @Query("select s from ServiceOrderContact s where s.serviceOrderId = ?1 and s.mappingType = ?2")
	 List<ServiceOrderContact> findServiceOrderContactsByType(int serviceOrderId,String CUSTOMER);
}
