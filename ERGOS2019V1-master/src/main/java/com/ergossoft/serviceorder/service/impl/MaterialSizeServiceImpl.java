package com.ergossoft.serviceorder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ergossoft.serviceorder.model.MaterialSize;
import com.ergossoft.serviceorder.repository.MaterialSizeRepository;
import com.ergossoft.serviceorder.service.MaterialService;
import com.ergossoft.serviceorder.service.MaterialSizeService;
@Service
public class MaterialSizeServiceImpl implements MaterialSizeService
{
@Autowired
private MaterialSizeRepository materialsizerepository;
	@Override
	public List<MaterialSize> getmaterialsizelist() {
		// TODO Auto-generated method stub
		return materialsizerepository.findAll();
	}
	

}
