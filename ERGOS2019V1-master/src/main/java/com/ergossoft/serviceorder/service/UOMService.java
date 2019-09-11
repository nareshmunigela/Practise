package com.ergossoft.serviceorder.service;

import java.util.List;

import com.ergossoft.serviceorder.model.UOM;

public interface UOMService {

	public List<UOM> getAllUOM();

	public UOM getUOMCode(int getuOMId);
	
}
