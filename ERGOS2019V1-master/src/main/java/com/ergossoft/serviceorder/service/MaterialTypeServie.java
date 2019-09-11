package com.ergossoft.serviceorder.service;

import java.util.List;

import com.ergossoft.serviceorder.model.MaterialType;

public interface MaterialTypeServie {

	public List<MaterialType> getAllMaterialType();

	public MaterialType getmaterialtype(int materialTypeId);
}
