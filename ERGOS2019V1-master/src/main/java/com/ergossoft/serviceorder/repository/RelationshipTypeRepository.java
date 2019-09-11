package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ergossoft.serviceorder.model.Property;
import com.ergossoft.serviceorder.model.RelationshipType;

@Repository
public interface RelationshipTypeRepository extends JpaRepository<RelationshipType, Integer>{

	@Query("select relationshiptype from RelationshipType relationshiptype where relationshiptype.status=true")
	public List<RelationshipType> getActiveRelationshipTypes();
}
