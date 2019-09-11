package com.ergossoft.serviceorder.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ergossoft.serviceorder.dto.CommonDTO;
import com.ergossoft.serviceorder.model.PhoneType;
import com.ergossoft.serviceorder.model.Property;
import com.ergossoft.serviceorder.model.RelationshipType;
import com.ergossoft.serviceorder.repository.PhoneTypeRepository;
import com.ergossoft.serviceorder.repository.PropertyRepository;
import com.ergossoft.serviceorder.repository.RelationshipTypeRepository;
import com.ergossoft.serviceorder.service.PhoneTypeService;
import com.ergossoft.serviceorder.service.PropertyService;
import com.ergossoft.serviceorder.service.RelationshipTypeService;

@Service
public class PhoneTypeServiceImpl implements PhoneTypeService {

	@Autowired
	private PhoneTypeRepository phoneTypeRepo;

	@Override
	public List<CommonDTO> getAllPhoneTypes() {
		List<CommonDTO> commonDtoList = new ArrayList<>();
		try {

			// TO GET ONLY ACTIVE PhoneType LIST
			List<PhoneType> phoneTypeList = phoneTypeRepo.getActivePhoneTypes();

			phoneTypeList.forEach(phoneType -> {
				commonDtoList.add(new CommonDTO(phoneType.getPhoneTypeId(), phoneType.getDescription()));
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
		return commonDtoList;

	}

}
