package com.ergossoft.serviceorder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ergossoft.serviceorder.model.Vendor;
import com.ergossoft.serviceorder.repository.VendorRepository;
import com.ergossoft.serviceorder.service.VendorService;
@Service
public class VendorServiceImpl implements VendorService 
{
	@Autowired
	private VendorRepository VendorRepository;

	@Override
	public List<Vendor> getallVendor() {
		// TODO Auto-generated method stub
		return VendorRepository.findAll();
	}
	

}
