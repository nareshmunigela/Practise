package com.ergossoft.serviceorder.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ergossoft.serviceorder.model.Contact;
import com.ergossoft.serviceorder.model.SOSchedule;

public interface SOSCheduleRepository extends JpaRepository<SOSchedule, Integer>{

	/*
	 * @Query("select c from Contact c where c.contactId in ?1") List<Contact>
	 * findContacts(Set<Integer> contactIds);
	 */
	
}
