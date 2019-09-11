package com.ergossoft.serviceorder.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpSession;
import javax.xml.ws.RequestWrapper;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ergossoft.serviceorder.dto.CommonContactDTO;
import com.ergossoft.serviceorder.dto.CustomerDetailsDTO;
import com.ergossoft.serviceorder.model.ContactEmail;
import com.ergossoft.serviceorder.model.ServiceOrder;

@Controller
public class ServiceAddressController {

	@RequestMapping("/saveServiceAddressTemp")
	public ResponseEntity<?> saveContactTemp(CustomerDetailsDTO customerDetailsDTO,@RequestParam("TIMESTAMP") String TIMESTAMP,   HttpSession session) {
		AjaxResponseBody result = new AjaxResponseBody();
		
		try {
			//customerDetailsDTO.setSiteId(siteId);
			System.out.println("SESSIONID...."+session.getId()+"   TIMESTAMP::"+TIMESTAMP);
			CustomerDetailsDTO customerDetailsDTO_existed=null;
			 customerDetailsDTO_existed=(CustomerDetailsDTO) session.getAttribute(TIMESTAMP+"_CUSTOMER_DETAILSDTO_OBJECT");
			 if(customerDetailsDTO_existed!=null) {
				  System.out.println("@@@@@@@@@@@if....."+customerDetailsDTO_existed.getSiteId());
				 session.setAttribute(TIMESTAMP+"_CUSTOMER_DETAILSDTO_OBJECT", customerDetailsDTO_existed);
				 }else {
					 System.out.println("@@@@@@@@@else....."+customerDetailsDTO.getSiteId()+"   "+customerDetailsDTO.getCustomerId());
					 customerDetailsDTO.setBillingAddress(customerDetailsDTO.getSiteAddress());
					 customerDetailsDTO.setBillingUnit(customerDetailsDTO.getSiteUnit());
					 customerDetailsDTO.setCustomerId(customerDetailsDTO.getCustomerId());
					 customerDetailsDTO.setCustomerNumber(customerDetailsDTO.getCustomerNumber());
					 session.setAttribute(TIMESTAMP+"_CUSTOMER_DETAILSDTO_OBJECT", customerDetailsDTO);
				 }
			 
			 
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		/*
		 * List obj = new ArrayList(); obj.add("");
		 */

		result.setMsg("SUCCESS");
		return ResponseEntity.ok(result);
	}
	
	@RequestMapping("/saveServiceOrderTemp")
	public ResponseEntity<?> saveServiceOrderTemp(ServiceOrder serviceOrderDTO,@RequestParam("TIMESTAMP") String TIMESTAMP, HttpSession session) {
		AjaxResponseBody result = new AjaxResponseBody();
		CustomerDetailsDTO customerDetailsDTO=null;
		
		System.out.println("SESSIONID...."+session.getId());
		List<CommonContactDTO> commonContactDTOList=new ArrayList<CommonContactDTO>();
		
		
		 Map<Double, Object> mapObject=null;
			Map<Double, Object> mapObject1=null;
		try {
			  customerDetailsDTO=(CustomerDetailsDTO) session.getAttribute(TIMESTAMP+"_CUSTOMER_DETAILSDTO_OBJECT");
			  
			  System.out.println("@@2222222222 customerDetailsDTO..."+customerDetailsDTO.getSiteId());
			  
			  mapObject1=(Map<Double, Object>) session.getAttribute(TIMESTAMP+"_BILLINGCONTACTMAPOBJECT");
			  
			  if(mapObject1!=null) {

					for (Entry<Double, Object> entry : mapObject1.entrySet()) {
				        
				        List list=(List) entry.getValue();

				        CommonContactDTO existedContactDTO=(CommonContactDTO) list.get(3);
				        commonContactDTOList.add(existedContactDTO);
				        
				        List<ContactEmail> ll=(List<ContactEmail>) list.get(2);
				        System.out.println("if...."+ll.size());
				    }
			  }else {
				try {
				mapObject=(Map<Double, Object>) session.getAttribute(TIMESTAMP+"_SITECONTACTMAPOBJECT");
				if(mapObject!=null) {
					mapObject1=new LinkedHashMap<Double, Object>();
					//mapObject1.putAll(mapObject);
					
					for (Entry<Double, Object> entry : mapObject.entrySet()) {
				        
				        List list=(List) entry.getValue();

				        CommonContactDTO existedContactDTO=(CommonContactDTO) list.get(3);
				        commonContactDTOList.add(existedContactDTO);
						
				        //double d=Math.random();
				        List<ContactEmail> ll=(List<ContactEmail>) list.get(2);
				        System.out.println("else...."+ll.size());
				        mapObject1.put(entry.getKey(), list);
				       // mapObject1.put(d, list);
						
				    }
				}
				}catch (Exception e) {
					e.printStackTrace();
				}
			  }
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		 * if(mapObject1!=null) {
		 * System.out.println("billing start..."+mapObject1.size()); for (Entry<Double,
		 * Object> entry : mapObject1.entrySet()) {
		 * 
		 * List list=(List) entry.getValue();
		 * 
		 * CommonContactDTO existedContactDTO=(CommonContactDTO) list.get(3);
		 * commonContactDTOList.add(existedContactDTO);
		 * 
		 * double d=Math.random(); //mapObject1.put(entry.getKey(), list);
		 * System.out.println("billing key..."+d); mapObject1.put(d, list);
		 * 
		 * } }
		 */
		
		
		session.setAttribute(TIMESTAMP+"_BILLINGCONTACTMAPOBJECT", mapObject1);
		session.setAttribute(TIMESTAMP+"_SERVICE_ORDERDTO_OBJECT", serviceOrderDTO);
		
		  List obj = new ArrayList(); 
		  
		  obj.add(commonContactDTOList);
		  obj.add(customerDetailsDTO);
		 
		result.setMsg(obj);
		return ResponseEntity.ok(result);
	}
	
}
