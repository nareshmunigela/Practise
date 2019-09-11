package com.ergossoft.serviceorder.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ergossoft.serviceorder.model.ContactPhone;

@Service
public interface ContactPhoneCustomService{

 
	public List<ContactPhone> getContactPhonesByKey(String qStr);
}
