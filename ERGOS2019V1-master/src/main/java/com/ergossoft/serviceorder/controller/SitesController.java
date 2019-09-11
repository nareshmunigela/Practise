package com.ergossoft.serviceorder.controller;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ergossoft.serviceorder.dto.SitesListDTO;
import com.ergossoft.serviceorder.model.Contact;
import com.ergossoft.serviceorder.model.ContactEmail;
import com.ergossoft.serviceorder.model.ContactPhone;
import com.ergossoft.serviceorder.model.Customer;
import com.ergossoft.serviceorder.model.ServiceOrder;
import com.ergossoft.serviceorder.model.Site;
import com.ergossoft.serviceorder.repository.ContactEmailRepository;
import com.ergossoft.serviceorder.repository.ContactPhoneRepository;
import com.ergossoft.serviceorder.repository.ContactRepository;
import com.ergossoft.serviceorder.repository.CustomerRepository;
import com.ergossoft.serviceorder.repository.ServiceOrderContactRepository;
import com.ergossoft.serviceorder.repository.ServiceOrderRepository;
import com.ergossoft.serviceorder.repository.SiteRepository;
import com.ergossoft.serviceorder.service.impl.CustomRepositoryImpl;

@Controller
public class SitesController {

	
	@Autowired
	private SiteRepository siteRepository;
	
	@Autowired
	private ServiceOrderRepository  serviceOrderRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ServiceOrderContactRepository serviceOrderContactRepository;
	
	@Autowired
	private ContactRepository contactRepository;
	
	@Autowired
	private ContactPhoneRepository contactPhoneRepository;
	
	@Autowired
	private ContactEmailRepository contactEmailRepository; 
	
	
	@Autowired
	CustomRepositoryImpl customRepositoryImpl;
	
	@RequestMapping("/sitesList")
	public @ResponseBody ModelAndView getSitesList() {
		int companyId=1;
		ModelAndView modelAndView=new ModelAndView();
		List<SitesListDTO> sitesListDTO=new  ArrayList<SitesListDTO>();
		List<Site> sitesList=siteRepository.findAll();
		sitesListDTO=addSitesListDTO(sitesList,companyId);
		modelAndView.addObject("sitesListDTO",sitesListDTO);
		modelAndView.setViewName("service-requests");
		return modelAndView;
	}
 
	@RequestMapping("/siteLatestSO")
	public String siteLatestSO(@RequestParam int siteId) {
		
		int companyId=6;
		ServiceOrder so=serviceOrderRepository.findServiceOrderBySite(siteId,companyId).get(0);
		
		int soId=so.getServiceOrderId();
		//newsoForExistingSite?soId=131
		return   "redirect:/newsoForExistingSite?soId="+soId;
	}
	
	
	
	
	@RequestMapping("/serchBysiteKey")
	public @ResponseBody ModelAndView getSitesListBySiteKey(@RequestParam("paramName") String paramName,@RequestParam("siteorcustomur") String siteorcustomur) {
		int companyId=6;
		ModelAndView modelAndView=new ModelAndView();
		
		List<SitesListDTO> sitesListDTO=new  ArrayList<SitesListDTO>();
			 
		List<Site> sitesList=null;
		/*
		 * if(siteorcustomur.equals("SITE")) {
		 * 
		 * }else { List<Customer> cus=customerRepository.searchCustomerByKey(paramName);
		 * sitesList=new ArrayList(); Iterator itr=cus.iterator(); while(itr.hasNext())
		 * { Customer cust=(Customer) itr.next();
		 * 
		 * // Site sit=siteRepository.findById(cust.)
		 * 
		 * }
		 * 
		 * }
		 */
		

		Set<Integer> uniquSites=new HashSet<Integer>();
		List<Integer> customerIds=new ArrayList<Integer>();
		 List<Site>	 sites=new ArrayList<Site>();
		try {
			 
			String[] keyarray=paramName.split(" ");
			 
			String searchTerm=paramName;
			 
			 
			//contact phones search
			 try {
			 String query="select s.contact.siteId from ContactPhone s where " ;
			 
			 String str="";
			 for (int i = 0; i < keyarray.length; i++) {
				if(i==0) {
					str=str+"s.phoneNumber  like '%"+keyarray[i]+"%'";
				}else {
					str=str+" or s.phoneNumber like '%"+keyarray[i]+"%'";
				}
			}
			 
			 query=query+str;
			 
			 System.out.println("query..."+query);
			 List<Integer> cph= customRepositoryImpl.getContactPhonesOrEmailsByQuery(query);
			 System.out.println("cph size.."+cph.size()+"   "+cph);
			 
			 
			 uniquSites.addAll(cph);
			 }catch (Exception e) {
				e.printStackTrace();
			}
			 
			 
			 //contact email search
			 try {
			 
			 String query="select s.contact.siteId from ContactEmail s where " ;
			 
			 String str="";
			 for (int i = 0; i < keyarray.length; i++) {
				if(i==0) {
					str=str+"s.email  like '%"+keyarray[i]+"%'";
				}else {
					str=str+" or s.email like '%"+keyarray[i]+"%'";
				}
			}
			 
			 query=query+str;
			 
			 System.out.println("query..."+query);
			 List<Integer> cph= customRepositoryImpl.getContactPhonesOrEmailsByQuery(query);
			 
			 //List<Integer> cph1= customRepositoryImpl.getSiteIdsOfContactPhonesOrEmailsByQuery(query);
			 System.out.println("cemail size.."+cph.size()+"   "+cph);
			 
			 uniquSites.addAll(cph);
			 }catch (Exception e) {
				e.printStackTrace();
			}
			 
			 System.out.println(" uniquSites::::"+ uniquSites);
			 // Set<Integer> siteIdsFromConatacts=
			 //unique siteids from uniqContacts 
			 
			 //customer address or customer number search
			 try {
				 
				 String query="select s.customerId  from Customer s where " ;
				 
				 String str="";
				 String str1="";
				 for (int i = 0; i < keyarray.length; i++) {
					if(i==0) {
						str=str+"s.name  like '%"+keyarray[i]+"%'";
						str1=str1+"s.address  like '%"+keyarray[i]+"%'";
					}else {
						str=str+" or s.name like '%"+keyarray[i]+"%'";
						str1=str1+" or s.address like '%"+keyarray[i]+"%'";
					}
				}
				 
				 query=query+str+" or "+str1;
				 
				 System.out.println("query..."+query);
				 customerIds= (List<Integer>) customRepositoryImpl.getCustomersByQuery(query);
				 System.out.println("customerIds size.."+customerIds.size());
				 
				 
				 }catch (Exception e) {
					e.printStackTrace();
				}
			 
			 
			 
			 //get unique sites ....
			 try {
				 //uniquSites,customerIds
				//SELECT * FROM ergosnewdevdb_local.site where Customer_ID in(1,5,3,20) group by Site_ID;
				 
				 String query="select s   from Site s where " ;
				 
				 String str="";
				 String str1="";
				 String str2="";
				 for (int i = 0; i < keyarray.length; i++) {
					if(i==0) {
						str=str+"s.siteAddress  like '%"+keyarray[i]+"%'";
						//str1=str1+"s.address  like '%"+keyarray[i]+"%'";
					}else {
						str=str+" or s.siteAddress like '%"+keyarray[i]+"%'";
						//str1=str1+" or s.address like '%"+keyarray[i]+"%'";
					}
				}
				
				  try { 
					 // String uniquSitesStr =  uniquSites.stream().collect(Collectors.joining(",")); 
					/*
					 * String result = uniquSites.stream() .map(n -> String.valueOf(n))
					 * .collect(Collectors.joining("-", "{", "}"));
					 * 
					 * str1=" siteId IN("+uniquSites+")";
					 */
				  }catch (Exception e) {
				  e.printStackTrace(); 
				  }
				 
				if(uniquSites.size()>0) {
					 String ss=uniquSites.toString().substring(1, uniquSites.toString().length()-1);
					 
					 System.out.println("ssss:;;"+ss);
					 str1=" or  siteId IN("+ss+")";
				}
				 
				if(customerIds.size()>0) {
					 String ss1=customerIds.toString().substring(1, customerIds.toString().length()-1);
					 
					 System.out.println("ssss1:;;"+ss1);
					 
					
					 str2=" or customerId IN("+ss1+")";
				}
				 
				
				 query=query+str+str1+str2;
				 
				 System.out.println("query..."+query);
				 sites= (List<Site>) customRepositoryImpl.getSitesByQuery(query);
				 System.out.println("sites size.."+sites.size());
				 
				 
				 
				 
				 
			 }catch (Exception e) {
				e.printStackTrace();
			}
			 
			 
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		/*
		 * System.out.println(paramName);
		 * sitesList=siteRepository.findSiteByAddressKey(paramName);
		 * System.out.println("sitesList.size()..."+sitesList.size());
		 * 
		 * sitesListDTO=sitesListDTO(sitesList,companyId);
		 */
		//companyId=6;
		sitesListDTO=addSitesListDTO(sites,companyId);
		
		
		System.out.println("sitesListDTO..."+sitesListDTO.size());
		
		modelAndView.addObject("sitesListDTO",sitesListDTO);
		modelAndView.setViewName("service-requests");
		return modelAndView;
	}
	
	
	
	String getPrimaryPhoneOREmail(String phoneOREmail,Contact contactObj) {
		String result=null;
		
		 System.out.println("contactObj...."+contactObj.getContactId());
		if(phoneOREmail.equals("PHONE")) {
			Set<ContactPhone> contactPhoneObjSet=contactObj.getContactPhones();
			 
			Iterator phoneItr=contactPhoneObjSet.iterator();
			while (phoneItr.hasNext()) {
				ContactPhone contactPhoneObj = (ContactPhone) phoneItr.next();
				if(contactPhoneObj.getIsPrimary()) {
					result=contactPhoneObj.getPhoneNumber();
					//dto.setPrimaryPhone(contactPhoneObj.getPhoneNumber());
				}
			}
		}else if(phoneOREmail.equals("EMAIL")) {
			Set<ContactEmail> contactEmailObjSet=contactObj.getContactEmails();
			
			
			Iterator emailItr=contactEmailObjSet.iterator();
			while (emailItr.hasNext()) {
				ContactEmail contactEmailObj = (ContactEmail) emailItr.next();
				
				System.out.println(contactEmailObj.getContact().getContactId()+"   contactEmailObj...."+contactEmailObj.getContactEmailId());
				if(contactEmailObj.getIsPrimary()) {
					System.out.println("iffffffffffff   "+contactEmailObj.getEmail());
					result=contactEmailObj.getEmail();
					//dto.setPrimaryEmail(contactEmailObj.getEmail());
				}
			}
		}
		
		return result;
	}
	
	
	
	
	 
		private List<SitesListDTO> addSitesListDTO(List<Site> sitesList, int companyId) {	
		
		
		List<SitesListDTO>	sitesListDTO=new ArrayList<SitesListDTO>();
		SitesListDTO dto = null;

		Iterator<Site> sitesItr=sitesList.iterator();
		while (sitesItr.hasNext()) {
			
			try {
			 
			Site siteObj = (Site) sitesItr.next();
			//get last service order for the site
			System.out.println(" siteObj.getSiteId() "+siteObj.getSiteId());
			dto=new SitesListDTO();
			dto.setSiteId(siteObj.getSiteId());
			//System.out.println(" siteObj.getSiteAddress() "+siteObj.getSiteAddress());
			dto.setSiteAddress(siteObj.getSiteAddress());
			try {
			//naresh dto.setSitePreciseAddress(siteObj.getPreciseAddress());
			 
			String extAddress="";
			//System.out.println("siteObj.getCity()..."+siteObj.getCity());
			if(!siteObj.getCity().equals("")) {
				extAddress=siteObj.getCity()+" ,";
			}else {
				extAddress=extAddress;
			}
			if(!siteObj.getState().equals("")) {
				extAddress=extAddress+siteObj.getState()+", ";
			}else {
				extAddress=extAddress;
			}
			/*if(!siteObj.getCountry().equals("")) {
				extAddress=extAddress+siteObj.getCountry()+", ";
			}else {
				extAddress=extAddress;
			}*/
			if(!siteObj.getZipCode().equals("")) {
				extAddress=extAddress+siteObj.getZipCode();
			}else {
				extAddress=extAddress;
			}
			
			dto.setSiteExtAddress(extAddress);
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			 System.out.println("site number "+siteObj.getSiteNumber());
			dto.setSiteNumber(siteObj.getSiteId().toString());
			List<ServiceOrder> serviceOrderForSiteList = new ArrayList<ServiceOrder>();
			ServiceOrder latestserviceOrderForSite=null;
			try { 
				serviceOrderForSiteList =  serviceOrderRepository.findServiceOrderBySite(siteObj.getSiteId(),companyId);
				if(serviceOrderForSiteList!=null && !serviceOrderForSiteList.isEmpty()) {
					
					System.out.println(" siteObj.getSiteId() "+siteObj.getSiteId());
					latestserviceOrderForSite =	serviceOrderForSiteList.get(0);
				
					 //for(ServiceOrder latestserviceOrderForSite : serviceOrderForSiteList){
						 if(latestserviceOrderForSite!=null) {
							 
							 dto.setServiceOrderId(latestserviceOrderForSite.getServiceOrderId());
							 dto.setServiceOrderNumber(latestserviceOrderForSite.getServiceOrderNumber());
							
							 Customer customer=  new Customer();// naresh customerRepository.findById(latestserviceOrderForSite.getCustomerId()).get();
							 customer.setZipCode("123");
							 customer.setAddress("3-5-76 indiranagar ramanthapur Hyderabad");
							 customer.setCity("city");
							 customer.setPreciseAddress("PAddress");
							 customer.setState("State");
							 customer.setCustomerNumber("1234567890");
							 customer.setAddressUnit("setAddressUnit");
							 customer.setName("Ramakrishna");
							 
							 dto.setAddress(customer.getAddress());
							 try {
									dto.setPreciseAddress(customer.getPreciseAddress());
									 
									String cutomerExtAddress="";
									if(!customer.getCity().equals("")) {
										cutomerExtAddress=customer.getCity()+" ,";
									}else {
										cutomerExtAddress=cutomerExtAddress;
									}
									if(!customer.getState().equals("")) {
										cutomerExtAddress=cutomerExtAddress+customer.getState()+", ";
									}else {
										cutomerExtAddress=cutomerExtAddress;
									}
									/*if(!customer.getCountry().equals("")) {
										cutomerExtAddress=cutomerExtAddress+customer.getCountry()+", ";
									}else {
										cutomerExtAddress=cutomerExtAddress;
									}*/
									if(!customer.getZipCode().equals("")) {
										cutomerExtAddress=cutomerExtAddress+customer.getZipCode();
									}else {
										cutomerExtAddress=cutomerExtAddress;
									}
									
									dto.setExtAddress(cutomerExtAddress);
									}catch (Exception e) {
										e.printStackTrace();
									}
							 
							 dto.setAddressUnit( customer.getAddressUnit());
							 dto.setCustomerName(customer.getName());
							 dto.setCustomerNumber(customer.getCustomerNumber());
							 
							 
							//naresh  int primaryContactId=serviceOrderContactRepository.findSitePrimaryContactId(latestserviceOrderForSite.getServiceOrderId(), "SITE");
							 
							 int primaryContactId =34;
							 Contact contactObj=contactRepository.findById(primaryContactId).get();
							 dto.setPrimaryContactName(contactObj.getFirstName()+" "+contactObj.getLastName());
							 String primaryPhoneNumber=getPrimaryPhoneOREmail("PHONE",contactObj);
							 String primaryEmail=getPrimaryPhoneOREmail("EMAIL",contactObj);
							 dto.setPrimaryPhone(primaryPhoneNumber);
							 dto.setPrimaryEmail(primaryEmail);
							dto.setLastModifiedDate(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(siteObj.getLastModifiedDate()));
							
							// sitesListDTO.add(dto);
							 }
						  
					  }
				//}
			
			 
			 
			
			}catch (Exception e) {
				System.out.println("ERROR  "+e);
			}
			 
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e);
		}
			
			 sitesListDTO.add(dto);
		}
			
		
		return sitesListDTO;
		
	}
	
	
	
	
	
}
