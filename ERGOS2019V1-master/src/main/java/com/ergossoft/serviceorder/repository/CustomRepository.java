package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ergossoft.serviceorder.model.Contact;
import com.ergossoft.serviceorder.model.ContactPhone;
import com.ergossoft.serviceorder.model.Customer;
import com.ergossoft.serviceorder.model.Site;

@Repository
public interface  CustomRepository {

	List<Integer> getContactPhonesOrEmailsByQuery(String query);
	 
	
	List<Integer> getCustomersByQuery(String query);
	
	List<Site> getSitesByQuery(String query);
	
}
