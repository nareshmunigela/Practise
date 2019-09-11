package com.ergossoft.serviceorder.service;

import java.util.List;

import com.ergossoft.serviceorder.model.Material;

 
public interface MaterialService
{
	
	public Material savematerial(Material material);
	public Material findbyMaterialID(int materialId);
	
	public List<Material> findAll();
	
	
	public List<Material> searchByKey(String key);
}
