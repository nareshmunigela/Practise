package com.ergossoft.serviceorder.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ergossoft.serviceorder.dto.CommonContactDTO;
import com.ergossoft.serviceorder.model.Contact;
import com.ergossoft.serviceorder.model.ContactEmail;
import com.ergossoft.serviceorder.model.ContactPhone;
import com.ergossoft.serviceorder.model.RelationshipType;
import com.ergossoft.serviceorder.repository.RelationshipTypeRepository;

@Controller
public class ContactController {
	
	@Autowired
	private RelationshipTypeRepository relationshipTypeRepository;
	
	
	@RequestMapping("/saveContactTemp")
	public ResponseEntity<?>  saveContactTemp(CommonContactDTO contactDTO,@RequestParam("TIMESTAMP") String TIMESTAMP, HttpSession session) {
		
		AjaxResponseBody result = new AjaxResponseBody();
		 
		System.out.println("SESSIONID...."+session.getId()+"   TIMESTAMP::"+TIMESTAMP);
		int mapObjectCount=0;
		
		Map<Double, Object> mapObject=null;
		Map<Double, Object> mapObject1=new LinkedHashMap<Double, Object>();
		try {
		mapObject=(Map<Double, Object>) session.getAttribute(TIMESTAMP+"_SITECONTACTMAPOBJECT");
		if(mapObject!=null) {
			mapObjectCount=mapObject.size();
		}else {
			mapObject=new LinkedHashMap<Double, Object>();
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		String fName=contactDTO.getFirstName();
		String lName=contactDTO.getLastName();
		int relationshipTypeId=contactDTO.getRelationshipTypeId();
		
		
		
		boolean isprimary=contactDTO.getIsPrimary();
		
		String phoneTypeIdStr=contactDTO.getPhoneTypeId();
		String phoneStr=contactDTO.getPhoneNumber();
		String emailStr=contactDTO.getEmail();
		
		String primaryContactStr=contactDTO.getPrimaryContact();
		String primaryEmailStr=contactDTO.getPrimaryEmail();
		
		
	 
		
		
		Contact contact=new Contact();
		List<ContactPhone> contactPhoneList=new ArrayList<ContactPhone>();
		List<ContactEmail> contactEmailList=new ArrayList<ContactEmail>();
		
		List<CommonContactDTO> commonContactDTOList=new ArrayList<CommonContactDTO>();
		
		
		
		contact.setFirstName(fName);
		contact.setLastName(lName);
		contact.setRelationshipTypeId(relationshipTypeId);
		
		if(mapObjectCount==0) {
			contact.setIsPrimary(true);
		}else {
			if(isprimary) {
			 for (Entry<Double, Object> entry : mapObject.entrySet()) {
			        
			        List list=(List) entry.getValue();
			        Contact existedContact=(Contact) list.get(0);
			        existedContact.setIsPrimary(false);
			        list.set(0, existedContact);
			        
			        
			        CommonContactDTO existedContactDTO=(CommonContactDTO) list.get(3);
			        existedContactDTO.setIsPrimary(false);
			        list.set(3, existedContactDTO);
			        
			        commonContactDTOList.add(existedContactDTO);
			        
			        //List<ContactPhone> existedContactPhoneList=(List<ContactPhone>) list.get(1);
					//List<ContactEmail> existedContactEmailList=(List<ContactEmail>) list.get(2);
					
			        mapObject1.put(entry.getKey(), list);
					
			    }
			}else {
				
				for (Entry<Double, Object> entry : mapObject.entrySet()) {
			        
			        List list=(List) entry.getValue();

			        CommonContactDTO existedContactDTO=(CommonContactDTO) list.get(3);
			        commonContactDTOList.add(existedContactDTO);
					
			        mapObject1.put(entry.getKey(), list);
					
			    }
			}
			contact.setIsPrimary(isprimary);
			
			
		}
		
		String primaryPhoneNumber=null;
		String primaryEmail=null;
		String relationshipType=null;
		
		
		
		String[] phoneArray=phoneStr.split(",");
		String[] emailArray=emailStr.split(",");
		
		String[] primaryContactArray=primaryContactStr.split(",");
		
		String[] primaryEmailArray=primaryEmailStr.split(",");
		
		String[] idArray=phoneTypeIdStr.split(",");
		
		for(int i=0;i<idArray.length;i++) {
			ContactPhone contactPhone=new ContactPhone();
			if(i==0) {
				relationshipType=idArray[i];
			}
			if(primaryContactArray[i].equals("true")) {
				primaryPhoneNumber=phoneArray[i];
				contactPhone.setIsPrimary(true);
			}else {
				contactPhone.setIsPrimary(false);
			}
			contactPhone.setPhoneTypeId(Integer.parseInt(idArray[i]));
			contactPhone.setPhoneNumber(phoneArray[i]);
			
			contactPhoneList.add(contactPhone);
		}
		for(int i=0;i<emailArray.length;i++) {
			ContactEmail contactEmail=new ContactEmail();
			if(primaryEmailArray[i].equals("true")) {
				primaryEmail=emailArray[i];
				contactEmail.setIsPrimary(true);
			}else {
				contactEmail.setIsPrimary(false);
			}
			contactEmail.setEmail(emailArray[i]);
			contactEmailList.add(contactEmail);
		}
		
		
	 		
		
		CommonContactDTO contactDTOResponseObject=new  CommonContactDTO();
		contactDTOResponseObject.setFirstName(fName);
		contactDTOResponseObject.setLastName(lName);
		contactDTOResponseObject.setRelationshipType(relationshipType);
		
		
		if(relationshipTypeId>0) {
			try {
				RelationshipType r=relationshipTypeRepository.findById(relationshipTypeId).get();
				contactDTOResponseObject.setRelationshipType(r.getDescription());
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		contactDTOResponseObject.setPhoneNumber(primaryPhoneNumber);
		contactDTOResponseObject.setEmail(primaryEmail);
		contactDTOResponseObject.setIsPrimary(contact.getIsPrimary());
		//CONNECTORID TRANSACTIONID TIMESTAMP
		
		double  randomStr =  Math.random();
		contactDTOResponseObject.setRandomStr(randomStr);
		
		List obj=new ArrayList();
		
		  obj.add(contact); obj.add(contactPhoneList); obj.add(contactEmailList);
		  obj.add(contactDTOResponseObject);
		  
		  commonContactDTOList.add(contactDTOResponseObject);
		
		   
		  mapObject1.put(randomStr, obj);
			
		  session.setAttribute(TIMESTAMP+"_SITECONTACTMAPOBJECT", mapObject1);
		 
		/*
		 * mapObject.put("CONTACT", contact); mapObject.put("CONTACTPHONELIST",
		 * contactPhoneList); mapObject.put("CONTACTEMAILLIST", contactEmailList);
		 */
		  
		List obj1=new ArrayList();
		  obj1.add(commonContactDTOList);
		result.setMsg(obj1);
		return ResponseEntity.ok(result);
		 
		
		//return new ResponseEntity.OK(result);
		
	}
	
	@RequestMapping("/saveContactBillingTemp")
	public ResponseEntity<?>  saveContactBillingTemp(CommonContactDTO contactDTO,@RequestParam("TIMESTAMP") String TIMESTAMP, HttpSession session) {

		System.out.println("saveContactBillingTemp...");
		System.out.println("SESSIONID...."+session.getId()+"   TIMESTAMP::"+TIMESTAMP);
		AjaxResponseBody result = new AjaxResponseBody();
		 
		int mapObjectCount=0;
		
		Map<Double, Object> mapObject=null;
		Map<Double, Object> mapObject1=new LinkedHashMap<Double, Object>();
		try {
		mapObject=(Map<Double, Object>) session.getAttribute(TIMESTAMP+"_BILLINGCONTACTMAPOBJECT");
		if(mapObject!=null) {
			mapObjectCount=mapObject.size();
		}else {
			mapObject=new LinkedHashMap<Double, Object>();
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		String fName=contactDTO.getFirstName();
		String lName=contactDTO.getLastName();
		int relationshipTypeId=contactDTO.getRelationshipTypeId();
		boolean isprimary=contactDTO.getIsPrimary();
		System.out.println("before map size..."+mapObject.size());
		System.out.println("isprimary...."+isprimary);
		
		
		String phoneTypeIdStr=contactDTO.getPhoneTypeId();
		String phoneStr=contactDTO.getPhoneNumber();
		String emailStr=contactDTO.getEmail();
		
		String primaryContactStr=contactDTO.getPrimaryContact();
		String primaryEmailStr=contactDTO.getPrimaryEmail();
		
		 
		
		Contact contact=new Contact();
		List<ContactPhone> contactPhoneList=new ArrayList<ContactPhone>();
		List<ContactEmail> contactEmailList=new ArrayList<ContactEmail>();
		
		List<CommonContactDTO> commonContactDTOList=new ArrayList<CommonContactDTO>();
		
		
		
		contact.setFirstName(fName);
		contact.setLastName(lName);
		
		
		contact.setRelationshipTypeId(relationshipTypeId);
		
		
		 
		if(mapObjectCount==0) {
			contact.setIsPrimary(true);
		}else {
			System.out.println("else");
			if(isprimary) {
				System.out.println("else if...."+isprimary);
			 for (Entry<Double, Object> entry : mapObject.entrySet()) {
			          
				 	//List listNew=new ArrayList();
				 //Contact contact=(Contact) list.get(0)
				 //List<ContactPhone> existedContactPhoneList=(List<ContactPhone>) list.get(1);
					//List<ContactEmail> existedContactEmailList=(List<ContactEmail>) list.get(2);
				//CommonContactDTO existedContactDTO=(CommonContactDTO) list.get(3);
				 
			        List list=(List) entry.getValue();
			        Contact existedContact=(Contact) list.get(0);
			        existedContact.setIsPrimary(false);
			        list.set(0, existedContact);
			        
			        
			        CommonContactDTO existedContactDTO=(CommonContactDTO) list.get(3);
			        existedContactDTO.setIsPrimary(false);
			        list.set(3, existedContactDTO);
			        
			        
			        existedContactDTO.setRandomStr(entry.getKey());
			        
			        commonContactDTOList.add(existedContactDTO);
			         System.out.println("added key..."+entry.getKey());
			       // double k=Math.random();
			        mapObject1.put(entry.getKey(), list);
			        
			        
			    }
			}else {
				System.out.println("else if else...."+isprimary);
				for (Entry<Double, Object> entry : mapObject.entrySet()) {
			         
			        List list=(List) entry.getValue();

			        CommonContactDTO existedContactDTO=(CommonContactDTO) list.get(3);
			        existedContactDTO.setRandomStr(entry.getKey());
			        commonContactDTOList.add(existedContactDTO);
			        double k=Math.random();
			        //mapObject1.put(entry.getKey(), list);
			         
			        mapObject1.put(k, list);
					
			    }
			}
			
			System.out.println("after map size.."+mapObject1.size());
			contact.setIsPrimary(isprimary);
			
			
		}
		
		 
		String primaryPhoneNumber=null;
		String primaryEmail=null;
		String relationshipType=null;
		
		
		
		String[] phoneArray=phoneStr.split(",");
		String[] emailArray=emailStr.split(",");
		
		String[] primaryContactArray=primaryContactStr.split(",");
		
		String[] primaryEmailArray=primaryEmailStr.split(",");
		
		String[] idArray=phoneTypeIdStr.split(",");
		
		for(int i=0;i<idArray.length;i++) {
			ContactPhone contactPhone=new ContactPhone();
			if(i==0) {
				relationshipType=idArray[i];
			}
			if(primaryContactArray[i].equals("true")) {
				primaryPhoneNumber=phoneArray[i];
				contactPhone.setIsPrimary(true);
			}else {
				contactPhone.setIsPrimary(false);
			}
			
			contactPhone.setPhoneTypeId(Integer.parseInt(idArray[i]));
			contactPhone.setPhoneNumber(phoneArray[i]);
			
			contactPhoneList.add(contactPhone);
		}
		for(int i=0;i<emailArray.length;i++) {
			ContactEmail contactEmail=new ContactEmail();
			if(primaryEmailArray[i].equals("true")) {
				primaryEmail=emailArray[i];
				contactEmail.setIsPrimary(true);
			}else {
				contactEmail.setIsPrimary(false);
			}
			 
			
			contactEmail.setEmail(emailArray[i]);
			
			contactEmailList.add(contactEmail);
		}
		
		 	
		
		CommonContactDTO contactDTOResponseObject=new  CommonContactDTO();
		contactDTOResponseObject.setFirstName(fName);
		contactDTOResponseObject.setLastName(lName);
		contactDTOResponseObject.setRelationshipType(relationshipType);
		contactDTOResponseObject.setPhoneNumber(primaryPhoneNumber);
		contactDTOResponseObject.setEmail(primaryEmail);
		contactDTOResponseObject.setIsPrimary(contact.getIsPrimary());
		
		
		if(relationshipTypeId>0) {
			try {
				RelationshipType r=relationshipTypeRepository.findById(relationshipTypeId).get();
				contactDTOResponseObject.setRelationshipType(r.getDescription());
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		//CONNECTORID TRANSACTIONID TIMESTAMP
		
		double  randomStr =  Math.random();
		contactDTOResponseObject.setRandomStr(randomStr);
		
		List obj=new ArrayList();
		
		  obj.add(contact); obj.add(contactPhoneList); obj.add(contactEmailList);
		  obj.add(contactDTOResponseObject);
		  
		  commonContactDTOList.add(contactDTOResponseObject);
		
		   
		  
		  mapObject1.put(randomStr, obj);
			
		  session.setAttribute(TIMESTAMP+"_BILLINGCONTACTMAPOBJECT", mapObject1);
		 
		  System.out.println("final map size.."+mapObject1.size());
		List obj1=new ArrayList();
		  obj1.add(commonContactDTOList);
		result.setMsg(obj1);
		return ResponseEntity.ok(result);
		 
	
	}
	
	
	
	@RequestMapping("/deleteContactTemp")
	public ResponseEntity<?>  deleteContactTemp(@RequestParam Double mapKey,@RequestParam("TIMESTAMP") String TIMESTAMP, HttpSession session) {
		AjaxResponseBody result = new AjaxResponseBody();
		
		System.out.println("deleteContactTemp....");
		System.out.println("SESSIONID...."+session.getId()+"   TIMESTAMP::"+TIMESTAMP);
		List<CommonContactDTO> commonContactDTOList=new ArrayList<CommonContactDTO>();
		Map<Double, Object> mapObject=new LinkedHashMap<Double, Object>();
		Map<Double, Object> mapObject1=new LinkedHashMap<Double, Object>();
		
		try {
			mapObject=(Map<Double, Object>) session.getAttribute(TIMESTAMP+"_SITECONTACTMAPOBJECT");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		try {
		if(mapObject.size()>0) {
			 for (Entry<Double, Object> entry : mapObject.entrySet()) {
			        if(!entry.getKey().equals(mapKey)) {
						 
			        	List list=(List) entry.getValue();
			        	CommonContactDTO existedContactDTO=(CommonContactDTO) list.get(3);
			        	commonContactDTOList.add(existedContactDTO);
			        	
			        	mapObject1.put(entry.getKey(), entry.getValue());
			        }//else
			    }//for
			    
			
			
				 
		}//if
		 
		}catch (Exception e) {
			e.printStackTrace();
		}	
		
		
		session.setAttribute(TIMESTAMP+"_SITECONTACTMAPOBJECT",mapObject1);
		List obj1=new ArrayList();
		  obj1.add(commonContactDTOList);
		result.setMsg(obj1);
		return ResponseEntity.ok(result);
			
	}
	
	
	
	@RequestMapping("/deleteContactBillingTemp")
	public ResponseEntity<?>  deleteContactBillingTemp(@RequestParam Double mapKey,@RequestParam("TIMESTAMP") String TIMESTAMP, HttpSession session) {

		System.out.println("deleteContactBillingTemp...");
		System.out.println("SESSIONID...."+session.getId()+"   TIMESTAMP::"+TIMESTAMP);
		AjaxResponseBody result = new AjaxResponseBody();
		List<CommonContactDTO> commonContactDTOList=new ArrayList<CommonContactDTO>();
		Map<Double, Object> mapObject=new LinkedHashMap<Double, Object>();
		Map<Double, Object> mapObject1=new LinkedHashMap<Double, Object>();
		
		try {
			mapObject=(Map<Double, Object>) session.getAttribute(TIMESTAMP+"_BILLINGCONTACTMAPOBJECT");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("before delete mapsize.."+mapObject.size());
		
		try {
		if(mapObject.size()>0) {
			 for (Entry<Double, Object> entry : mapObject.entrySet()) {
				 System.out.println(entry.getKey()+"-----"+mapKey);
			        if(!entry.getKey().equals(mapKey)) {
						 System.out.println("iffffff");
			        	List list=(List) entry.getValue();
			        	CommonContactDTO existedContactDTO=(CommonContactDTO) list.get(3);
			        	commonContactDTOList.add(existedContactDTO);
			        	
			        	mapObject1.put(entry.getKey(), entry.getValue());
			        }else {
			        	System.out.println("else.....");
			        }
			    }//for
				 
		}//if
		System.out.println("after delete mapsize.."+mapObject1.size());
		}catch (Exception e) {
			e.printStackTrace();
		}	
		
		
		session.setAttribute(TIMESTAMP+"_BILLINGCONTACTMAPOBJECT",mapObject1);
		List obj1=new ArrayList();
		  obj1.add(commonContactDTOList);
		result.setMsg(obj1);
		return ResponseEntity.ok(result);
	
	}
}
