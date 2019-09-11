package com.ergossoft.serviceorder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ergossoft.serviceorder.model.Material;
import com.ergossoft.serviceorder.repository.MaterialRepository;
import com.ergossoft.serviceorder.service.MaterialService;
@Service
public class MaterialServiceImpl implements MaterialService
{
@Autowired
private MaterialRepository materialRepository;
 
	public Material savematerial(Material material) {
		return materialRepository.save(material);
	}

	@Override
	public Material findbyMaterialID(int materialId) {
		return materialRepository.getOne(materialId);
	}

	@Override
	public List<Material> findAll() {
		return materialRepository.findAll();
	}

	@Override
	public List<Material> searchByKey(String key) {
		
		return materialRepository.findMaterialsBySearchKey(key);
	}
	

}
