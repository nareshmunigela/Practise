package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ergossoft.serviceorder.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	@Query("select c from Customer c where c.address=?1 and c.addressUnit=?2")
	List<Customer> search_site_address(String site_address, String site_units);

	@Query("select c From Customer c where c.address like %?1% and c.status=1")
	public List<Customer> searchSiteAddress(String addressName);
	
	
	
	@Query("select c From Customer c where c.name like %?3% and c.address like %?1% and c.addressUnit like %?2%")
	public List<Customer> search_site_address_all(String site_address, String site_units, String customerName);
	
	
	
	@Query("select c From Customer c where c.name like %?1% or c.address like %?1%")
	public List<Customer> searchCustomerByKey(String searchKey);
	
	
	@Query("select c from Customer c where c.address=?1 and c.addressUnit=?2")
	List<Customer> search_billing_address(String site_address, String site_units);
	
	@Query("select count(*) from Customer") 
	public int findNumberOfCustomer();
	
	/*
	 * public List<Customer> findByAddressContaining(String addressName);
	 * 
	 * @Query("select c From Customer c where c.address like %?1% or c.name like %?1% and c.status=1"
	 * ) public List<Customer> findCustomerByAddressOrName(String searchStr);
	 * 
	 
	 */
}
