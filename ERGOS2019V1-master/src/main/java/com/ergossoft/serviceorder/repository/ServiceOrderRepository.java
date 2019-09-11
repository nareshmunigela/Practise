/**
 * 
 */
package com.ergossoft.serviceorder.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ergossoft.serviceorder.model.ServiceOrder;

@Repository
public interface ServiceOrderRepository extends JpaRepository<ServiceOrder, Integer>{

	/*
	 * @Query("select s from ServiceOrder s where s.serviceOrderNumber=?1") public
	 * ServiceOrder findServiceOrderById(String serviceOrderId);
	 * 
	 * @Query("select s.serviceOrderId from ServiceOrder s where s.customerId=?1 order by s.updatedDate desc"
	 * ) List<Integer> findServiceOrderIdByCustomer(int customerId);
	 * 
	
	 * 
	 * 
	 * 
	 */
	
	
	  @Query
	  ("select count(*) from ServiceOrder s where s.clientId=?1 and s.lastModifiedDate >= ?2 and s.createdDate <= ?3")
	  int findSOCountByClientId(int clientId, LocalDateTime start, LocalDateTime end);
	  
	  
	  @Query("select s from ServiceOrder s where s.siteId=?1 and s.companyId=?2 order by s.createdDate desc") 
	  List<ServiceOrder> findServiceOrderBySite(int siteId,int companyId);

	  @Query("select s from ServiceOrder s where s.customerId=?1")
	  public  ServiceOrder find_by_customerId(Integer customer_id);
	  
	  @Query("select s from ServiceOrder s where s.customerId=?1 order by s.createdDate desc")
	  List<ServiceOrder> findServiceOrderByCustomer(int customerId);
	  
	  
	  @Query("select s from ServiceOrder s where companyId=6 order by s.createdDate desc")
	  List<ServiceOrder> allServiceOrders();
	  
	  @Query("select s from ServiceOrder s where companyId=?1 order by s.createdDate desc")
	  List<ServiceOrder> allServiceOrders(int companyId);
	  
	  
	 // SELECT MAX(SO_ID),Site_ID,SONumber FROM ergosnewdevdb_local.serviceorder WHERE Company_ID=4 group by Site_ID;
	  
}
