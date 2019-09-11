package com.ergossoft.serviceorder.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ergossoft.serviceorder.dto.CommonDTO;
import com.ergossoft.serviceorder.model.PhoneType;
import com.ergossoft.serviceorder.model.ProblemType;
import com.ergossoft.serviceorder.model.Property;
import com.ergossoft.serviceorder.model.RelationshipType;
import com.ergossoft.serviceorder.repository.PhoneTypeRepository;
import com.ergossoft.serviceorder.repository.ProblemTypeRepository;
import com.ergossoft.serviceorder.repository.PropertyRepository;
import com.ergossoft.serviceorder.repository.RelationshipTypeRepository;
import com.ergossoft.serviceorder.service.PhoneTypeService;
import com.ergossoft.serviceorder.service.ProblemTypeService;
import com.ergossoft.serviceorder.service.PropertyService;
import com.ergossoft.serviceorder.service.RelationshipTypeService;

@Service
public class ProblemTypeServiceImpl implements ProblemTypeService {

	@Autowired
	private ProblemTypeRepository problemTypeRepo;

	@Override
	public List<CommonDTO> getAllProblemTypes() {
		List<CommonDTO> commonDtoList = new ArrayList<>();
		try {

			// TO GET ONLY ACTIVE ProblemType LIST
			List<ProblemType> problemTypeList = problemTypeRepo.getActiveProblemTypes();

			problemTypeList.forEach(problemType -> {
				commonDtoList.add(new CommonDTO(problemType.getProblemTypeId(), problemType.getDescription()));
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
		return commonDtoList;
	}

}
