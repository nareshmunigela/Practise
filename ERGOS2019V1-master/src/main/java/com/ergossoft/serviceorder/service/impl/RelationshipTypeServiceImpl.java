package com.ergossoft.serviceorder.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ergossoft.serviceorder.dto.CommonDTO;
import com.ergossoft.serviceorder.model.Property;
import com.ergossoft.serviceorder.model.RelationshipType;
import com.ergossoft.serviceorder.repository.PropertyRepository;
import com.ergossoft.serviceorder.repository.RelationshipTypeRepository;
import com.ergossoft.serviceorder.service.PropertyService;
import com.ergossoft.serviceorder.service.RelationshipTypeService;

@Service
public class RelationshipTypeServiceImpl implements RelationshipTypeService {

	@Autowired
	private RelationshipTypeRepository relationshipTypeRepo;

	@Override
	public List<CommonDTO> getAllRelationshipTypes() {
		List<CommonDTO> commonDtoList = new ArrayList<>();
		try {

			// TO GET ONLY ACTIVE RelationshipType LIST
			List<RelationshipType> relationshipTypeList = relationshipTypeRepo.getActiveRelationshipTypes();

			relationshipTypeList.forEach(relationshipType -> {
				commonDtoList.add(
						new CommonDTO(relationshipType.getRelationshipTypeId(), relationshipType.getDescription()));
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
		return commonDtoList;
	}

}
