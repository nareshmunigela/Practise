package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ergossoft.serviceorder.model.Contact;
import com.ergossoft.serviceorder.model.ContactPhone;

@Repository
public interface ContactPhoneRepository extends JpaRepository<ContactPhone, Integer>{

	/*
	 * @Query("select count(*) from ContactPhone p where p.phoneNumber = :phoneNumber"
	 * ) int findByPhoneNumberExist(String phoneNumber);
	 */
	
	/*
	 * @Query("select contactPhone from ContactPhone contactPhone where contactPhone.contactId =?1 and contactPhone.isPrimary =1"
	 * ) ContactPhone getPrimaryPhoneByContactId(int contactId);
	 */
	/*
	 * @Query("select count(*) from ContactPhone p where p.phoneNumber like %?:1% "
	 * )
	 * 
	 * List<ContactPhone> findByPhoneNumber(String phoneNumber);
	 */
	//like CONCAT('%',searchkey,'%')
	
	
	@Query("SELECT t.contact FROM ContactPhone t WHERE  t.phoneNumber  like %?1%")
   
	List<Contact> findBySearchKey(@Param("searchTerm") String searchTerm);
	
 
	
	/*
	 * @Query("SELECT t FROM ContactPhone t WHERE " +
	 * "(t.phoneNumber) LIKE LOWER(CONCAT('%',:searchTerm, '%')) OR " +
	 * "(t.description) LIKE LOWER(CONCAT('%',:searchTerm, '%'))")
	 */
	
	
	/*
	 * @Query("SELECT * from ContactPhone   WHERE  phoneNumber IN (:keys)")
	 * List<ContactPhone> findBykeys(List<String> keys);
	 */
	
	/*
	 * @Query("SELECT t from ContactPhone t  WHERE  t.phoneNumber like   IN (:keys)  "
	 * ) List<ContactPhone> findBykeys(List<String> keys);
	 */
	
	/*
	 * @Query("SELECT t from ContactPhone t WHERE CONTAINS(t.phoneNumber, '8881 OR 4977',1"
	 * ) List<ContactPhone> findBykeys(List<String> keys);
	 */
	 
}
