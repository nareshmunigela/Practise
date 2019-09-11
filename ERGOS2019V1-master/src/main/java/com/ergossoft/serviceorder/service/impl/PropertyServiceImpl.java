package com.ergossoft.serviceorder.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ergossoft.serviceorder.dto.CommonDTO;
import com.ergossoft.serviceorder.model.Property;
import com.ergossoft.serviceorder.repository.PropertyRepository;
import com.ergossoft.serviceorder.service.PropertyService;

@Service
public class PropertyServiceImpl implements PropertyService{

	
	@Autowired
	private PropertyRepository propertyRepo;
	
	 
	@Override
	public List<CommonDTO> getAllProperties() {
		List<CommonDTO> commonDtoList =  new ArrayList<>();
		try {
			
			//TO GET ALL PROPERTIES LIST
			//List<Property> propertiesList1=propertyRepo.findAll();
			
			
			//TO GET ONLY ACTIVE PROPERTIES LIST
			List<Property> propertiesList=propertyRepo.getActiveProperties();			
			 
			propertiesList.forEach(proerty ->  {
				commonDtoList.add(new CommonDTO(proerty.getPropertyTypeId(), proerty.getDescription()));
			});
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return commonDtoList;
	}

	
	
}
