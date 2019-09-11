/**
 * 
 */
package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ergossoft.serviceorder.model.ServiceOrderNotes;

@Repository
public interface ServiceOrderNotesRepository extends JpaRepository<ServiceOrderNotes, Integer> {

	@Query("select s from ServiceOrderNotes s where s.serviceOrderId = ?1")
	List<ServiceOrderNotes> findServiceNotesByOrderId(int serviceOrderId);
}
