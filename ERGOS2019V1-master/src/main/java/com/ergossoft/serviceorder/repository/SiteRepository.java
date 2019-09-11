package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ergossoft.serviceorder.model.Site;

@Repository
public interface SiteRepository extends  JpaRepository<Site, Integer>{

	/*
	 * @Query("select s From Site s where s.siteAddress like %?1% and status=1")
	 * public List<Site> findSiteByAddress(String searchStr);
	 * 
	  
	 */
	 @Query("select count(*) from Site") 
	    public int findNumberOfSite();
	 
	 
	 @Query("select s From Site s where s.siteAddress=?1 and status=1")
	 public List<Site> findSiteByAddress(String searchStr);
	 
	 
	 
	 @Query("select s From Site s where s.siteAddress=?1 and s.siteUnit=?2 and status=1")
	 public List<Site> findSiteByAddressAndUnit(String address,String unit);
	 
	 
	 @Query("select s From Site s where s.siteAddress like %?1% and status=1")
	 public List<Site> findSiteByAddressKey(String searchStr);
	 
	 
}
