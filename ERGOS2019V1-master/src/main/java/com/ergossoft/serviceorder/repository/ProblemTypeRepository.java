package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ergossoft.serviceorder.model.PhoneType;
import com.ergossoft.serviceorder.model.ProblemType;
import com.ergossoft.serviceorder.model.Property;

@Repository
public interface ProblemTypeRepository extends JpaRepository<ProblemType, Integer>{

	@Query("select problemType from ProblemType problemType where problemType.status=true")
	public List<ProblemType> getActiveProblemTypes();
}
