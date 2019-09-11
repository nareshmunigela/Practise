package com.ergossoft.serviceorder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ergossoft.serviceorder.model.MaterialType;
import com.ergossoft.serviceorder.repository.MaterialTypeRepository;
import com.ergossoft.serviceorder.service.MaterialTypeServie;
@Service
public class MateriaTypeServiceImpl implements MaterialTypeServie 
{
@Autowired
private MaterialTypeRepository materialTypeRepository;
	@Override
	public List<MaterialType> getAllMaterialType() {
		// TODO Auto-generated method stub
		return materialTypeRepository.getAllMaterialType();
	}
	@Override
	public MaterialType getmaterialtype(int materialTypeId) {
		// TODO Auto-generated method stub
		return materialTypeRepository.findById(materialTypeId).get();
	}
	
	
	
	

}
