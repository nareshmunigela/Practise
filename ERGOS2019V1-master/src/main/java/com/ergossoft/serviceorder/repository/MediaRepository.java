package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ergossoft.serviceorder.model.Media;

@Repository
public interface MediaRepository extends JpaRepository<Media, Integer>{

	@Query("select m from Media m where m.MediaCategoryId=?1 and m.referenceId=?2")
	List<Media> findMediaList(int cat,int elementId);
	
	
	
	/*@Query("select count(*) from Media m where m.mediaCategory=?1 and m.referenceId=?1")
	int mediaCount(int elementId);*/
	
	/*
	 * @Query("select count(*) from Media m where (m.mediaCategory='TaxExempt' OR m.mediaCategory='ProblemDescription') and m.referenceId=?1"
	 * ) int mediaCountForServiceOrder(int soId);
	 */
	
	
	
	@Query("select count(*) from Media m where m.MediaCategoryId=?2 and m.referenceId=?1")
	int mediaCountForServiceOrder(int soId,int mediaCtegory);
}
