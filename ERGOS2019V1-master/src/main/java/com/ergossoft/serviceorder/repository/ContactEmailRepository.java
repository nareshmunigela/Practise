package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ergossoft.serviceorder.model.Contact;
import com.ergossoft.serviceorder.model.ContactEmail;
import com.ergossoft.serviceorder.model.ContactPhone;

public interface ContactEmailRepository extends JpaRepository<ContactEmail, Integer>{

	/*
	 * @Query("select count(*) from ContactEmail e where e.email = :emailId") int
	 * findByEmailExist(String emailId);
	 */
	
	/*
	 * @Query("select contactEmail from ContactEmail contactEmail where contactEmail.contact =?1 and contactEmail.isPrimary =1"
	 * ) ContactEmail getPrimaryEmailByContactId(Contact contactId);
	 */
	
	
	/*
	 * @Query("select count(*) from ContactEmail p where p.email like %?:1% " )
	 * 
	 * List<ContactPhone> findByEmail(String email);
	 */
}