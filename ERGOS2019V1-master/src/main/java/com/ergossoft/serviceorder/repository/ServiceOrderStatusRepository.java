/**
 * 
 */
package com.ergossoft.serviceorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ergossoft.serviceorder.model.ServiceOrderStatus;

/**
 *  
 *
 */
@Repository
public interface ServiceOrderStatusRepository extends JpaRepository<ServiceOrderStatus, Integer>{

	@Query("select s.serviceorderStatusid from ServiceOrderStatus s where s.description = :desc")
	public int getServiceStatusIdByDes(String desc);
}
