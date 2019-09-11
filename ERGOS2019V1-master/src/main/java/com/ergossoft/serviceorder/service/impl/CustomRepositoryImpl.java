package com.ergossoft.serviceorder.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.ergossoft.serviceorder.model.Contact;
import com.ergossoft.serviceorder.model.ContactPhone;
import com.ergossoft.serviceorder.model.Customer;
import com.ergossoft.serviceorder.model.Site;
import com.ergossoft.serviceorder.repository.CustomRepository;

@Service
public class CustomRepositoryImpl implements  CustomRepository{

	@PersistenceContext
    private EntityManager em;

	 
	@Override
	public List<Integer> getContactPhonesOrEmailsByQuery(String qStr) {
		System.out.println("qStr..."+qStr);
		List<Integer> l=  (List<Integer>) em.createQuery(qStr).getResultList();
		return l;
	}

 


	@Override
	public List<Integer> getCustomersByQuery(String query) {
		System.out.println("qStr..."+query);
		List<Integer> l=  (List<Integer>) em.createQuery(query).getResultList();
		return l;
	}




	@Override
	public List<Site> getSitesByQuery(String query) {
		System.out.println("qStr..."+query);
		List<Site> l=  (List<Site>) em.createQuery(query).getResultList();
		return l;
	}


	 
}
