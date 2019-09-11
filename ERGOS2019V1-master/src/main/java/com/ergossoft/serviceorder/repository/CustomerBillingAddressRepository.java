package com.ergossoft.serviceorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ergossoft.serviceorder.model.CustomerBillingAddress;

@Repository
public interface CustomerBillingAddressRepository extends JpaRepository<CustomerBillingAddress, Integer>{

	
	 @Query("select c from CustomerBillingAddress c where  c.Address=?1 and c.Unit=?2 and c.customerId = ?3 ") 
	 CustomerBillingAddress checkCustomerAddressExistence(String address, String unit, int customerId);
}
