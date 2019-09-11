package com.ergossoft.serviceorder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ergossoft.serviceorder.model.UOM;
import com.ergossoft.serviceorder.repository.UOMRepository;
import com.ergossoft.serviceorder.service.UOMService;

@Service
public class UOMServiceImpl implements UOMService {
@Autowired
private UOMRepository uomRepository;
	@Override
	public List<UOM> getAllUOM() {
		// TODO Auto-generated method stub
		return uomRepository.getAllUOM();
	}
	@Override
	public UOM getUOMCode(int uOMId) {
		// TODO Auto-generated method stub
		return uomRepository.findById(uOMId).get();
	}

	
	
}
