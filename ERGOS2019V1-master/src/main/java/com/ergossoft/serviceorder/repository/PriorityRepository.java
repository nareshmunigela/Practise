package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ergossoft.serviceorder.model.PhoneType;
import com.ergossoft.serviceorder.model.Priority;
import com.ergossoft.serviceorder.model.Property;

@Repository
public interface PriorityRepository extends JpaRepository<Priority, Integer>{

	@Query("select priority from Priority priority where priority.status=true")
	public List<Priority> getActiveServiceOrderPriorities();
}
