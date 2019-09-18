package com.ergossoft.serviceorder.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.hibernate.type.LocalDateTimeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ergossoft.serviceorder.dto.CommonContactDTO;
import com.ergossoft.serviceorder.dto.CommonDTO;
import com.ergossoft.serviceorder.dto.CustomerDetailsDTO;
import com.ergossoft.serviceorder.dto.EquipmentsDto;
import com.ergossoft.serviceorder.model.Contact;
import com.ergossoft.serviceorder.model.ContactEmail;
import com.ergossoft.serviceorder.model.ContactPhone;
import com.ergossoft.serviceorder.model.Customer;
import com.ergossoft.serviceorder.model.Employee;
import com.ergossoft.serviceorder.model.Equipment;
import com.ergossoft.serviceorder.model.EquipmentType;
import com.ergossoft.serviceorder.model.MarketingCampaign;
import com.ergossoft.serviceorder.model.Media;
import com.ergossoft.serviceorder.model.MediaDto;
import com.ergossoft.serviceorder.model.PaymentTerms;
import com.ergossoft.serviceorder.model.Property;
import com.ergossoft.serviceorder.model.RelationshipType;
import com.ergossoft.serviceorder.model.SOSchedule;
import com.ergossoft.serviceorder.model.ScheduleTime;
import com.ergossoft.serviceorder.model.ServiceOrder;
import com.ergossoft.serviceorder.model.ServiceOrderContact;
import com.ergossoft.serviceorder.model.ServiceOrderNotes;
import com.ergossoft.serviceorder.model.ServiceOrderStatus;
import com.ergossoft.serviceorder.model.Site;
import com.ergossoft.serviceorder.repository.ContactEmailRepository;
import com.ergossoft.serviceorder.repository.ContactPhoneRepository;
import com.ergossoft.serviceorder.repository.ContactRepository;
import com.ergossoft.serviceorder.repository.CustomerRepository;
import com.ergossoft.serviceorder.repository.EmployeeRepository;
import com.ergossoft.serviceorder.repository.EquipmentRepository;
import com.ergossoft.serviceorder.repository.EquipmentTypeRepository;
import com.ergossoft.serviceorder.repository.MarketingCampaignRepository;
import com.ergossoft.serviceorder.repository.MediaRepository;
import com.ergossoft.serviceorder.repository.PaymentTermsRepository;
import com.ergossoft.serviceorder.repository.PropertyRepository;
import com.ergossoft.serviceorder.repository.RelationshipTypeRepository;
import com.ergossoft.serviceorder.repository.SOSCheduleRepository;
import com.ergossoft.serviceorder.repository.ScheduleTimeRepository;
import com.ergossoft.serviceorder.repository.ServiceOrderContactRepository;
import com.ergossoft.serviceorder.repository.ServiceOrderNotesRepository;
import com.ergossoft.serviceorder.repository.ServiceOrderRepository;
import com.ergossoft.serviceorder.repository.ServiceOrderStatusRepository;
import com.ergossoft.serviceorder.repository.SiteRepository;
import com.ergossoft.serviceorder.service.EmployeeService;
import com.ergossoft.serviceorder.service.impl.BankMasterServiceImpl;
import com.ergossoft.serviceorder.service.impl.MarketingCampaignServiceImpl;
import com.ergossoft.serviceorder.service.impl.PaymentTermsServiceImpl;
import com.ergossoft.serviceorder.service.impl.PhoneTypeServiceImpl;
import com.ergossoft.serviceorder.service.impl.PriorityServiceImpl;
import com.ergossoft.serviceorder.service.impl.ProblemTypeServiceImpl;
import com.ergossoft.serviceorder.service.impl.PropertyServiceImpl;
import com.ergossoft.serviceorder.service.impl.RelationshipTypeServiceImpl;
import com.ergossoft.serviceorder.service.impl.ScheduleTimeServiceImpl;

@Controller
public class ServiceOrderController {

	@Autowired
	PropertyServiceImpl propertyServiceImpl;

	@Autowired
	RelationshipTypeServiceImpl relationServiceImpl;
	
	@Autowired
	PhoneTypeServiceImpl phoneServiceImpl;
	
	@Autowired
	ProblemTypeServiceImpl problemTypeServiceImpl;
	
	@Autowired
	PriorityServiceImpl priorityServiceImpl;
	
	@Autowired
	MarketingCampaignServiceImpl marketingCampaignServiceImpl;
	
	@Autowired
	PaymentTermsServiceImpl paymentTermsServiceImpl;
	
	@Autowired
	ScheduleTimeServiceImpl scheduleTimesServiceImpl;
	
	@Autowired
	BankMasterServiceImpl bankMasterServiceImpl;
	
	@Autowired
	private PaymentTermsRepository paymentTermsRepo;
	
	@Autowired
	private PropertyRepository propertyRepo;
	
	@Autowired
	private MarketingCampaignRepository marketingCampaignRepo;
	
	@Autowired
	private EmployeeService employeService;
	
	@Autowired
	SiteRepository siteRep;
	
	
	@Autowired
	ServiceOrderRepository soRepositry;
	
	@Autowired
	SOSCheduleRepository soschedule;
	
	@Autowired
	SendEmail mailservice;
	
	@Autowired
	RelationshipTypeRepository relationshipTypeRepository;
	
	@Autowired
	CustomerRepository customer;
	@Autowired
	EmployeeRepository employeeRep;
	@Autowired
	ContactPhoneRepository contactPhone;
	@Autowired
	ContactEmailRepository contactEmail;
	@Autowired
	ServiceOrderContactRepository serviceOrderContactRepository;
	
	@Autowired
	ScheduleTimeRepository timeslot;
	
	
	@Autowired
	SitesController sitesController;
	
	@Autowired
	ContactRepository contactRepository;
	
	
	@Autowired
	ServiceOrderStatusRepository soSatusRep;
	
	

	@Autowired
	private EquipmentRepository equipmentRepo;
	
	
	@Autowired
	private EquipmentTypeRepository equipmentTypeRepo;
	
	@Autowired
	MediaRepository mediaRepo;
	
	@Autowired
	private ServiceOrderNotesRepository serviceOrderNotesRepo;
	
	@RequestMapping(value = "/newserviceorder", method = RequestMethod.GET)
	public ModelAndView newserviceorder(HttpSession httpSession) {
		ModelAndView modelView = new ModelAndView();

		try {

			List<CommonDTO> propertiesList = propertyServiceImpl.getAllProperties();
			List<CommonDTO> relationshipTypeList = relationServiceImpl.getAllRelationshipTypes();
			List<CommonDTO> phoneTypeList = phoneServiceImpl.getAllPhoneTypes();
			List<CommonDTO> problemTypeList = problemTypeServiceImpl.getAllProblemTypes();
			List<CommonDTO> priorityList = priorityServiceImpl.getAllPriorities();
			List<CommonDTO> marketingCampaignList = marketingCampaignServiceImpl.getAllMarketingCampaigns();
			List<CommonDTO> paymentTermsList = paymentTermsServiceImpl.getAllPaymentTerms();
			List<CommonDTO> scheduledTimesList = scheduleTimesServiceImpl.getAllScheduleTimes();
			List<CommonDTO> bankMasterList = bankMasterServiceImpl.getAllBankMasters();
			 
		 
			
			modelView.addObject("propertieslist", propertiesList);
			modelView.addObject("relationshiptypelist", relationshipTypeList);
			modelView.addObject("phonetypelist", phoneTypeList);
			modelView.addObject("problemtypelist", problemTypeList);
			modelView.addObject("serviceorderprioritylist", priorityList);
			modelView.addObject("marketingcampaignlist", marketingCampaignList);
			modelView.addObject("paymenttermslist", paymentTermsList);
			modelView.addObject("scheduledtimeslist", scheduledTimesList);
			modelView.addObject("bankmasterlist", bankMasterList);
			
			handleSessionObjects(httpSession);
			
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			String TIMESTAMP=timestamp.getTime()+"";
			System.out.println("TIMESTAMP.."+TIMESTAMP);
			
			modelView.addObject("TIMESTAMP", TIMESTAMP);
			modelView.setViewName("service-request-new");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelView;

	}
	
	
	private void handleSessionObjects(HttpSession httpSession) {
		if(httpSession!=null) {
		try {
			httpSession.removeAttribute("SITECONTACTMAPOBJECT");
		}catch (Exception e) {
			//e.printStackTrace();
		}
		try {
			httpSession.removeAttribute("BILLINGCONTACTMAPOBJECT");
		}catch (Exception e) {
			//e.printStackTrace();
		}
		try {
			httpSession.removeAttribute("CUSTOMER_DETAILSDTO_OBJECT");
		}catch (Exception e) {
			//e.printStackTrace();
		}
		try {
			httpSession.removeAttribute("SERVICE_ORDERDTO_OBJECT");
		}catch (Exception e) {
			//e.printStackTrace();
		}
		 
		}else {
			System.out.println("NO HTTP SESSION");
		}
	}


	@RequestMapping("/getTechnicianList")
	public ResponseEntity<List<CommonDTO>> findAllEmployeeType(@RequestParam int problemTypeId) {
		return new ResponseEntity<>(employeService.findAllTechnician(problemTypeId), HttpStatus.OK);
	}
	
	 
	
	@RequestMapping("/sodrderview")
	public ModelAndView viewServiceOrder(@RequestParam Integer soId ,@RequestParam String tabSet) {
		int companyId=1;
		ModelAndView model=new ModelAndView(); 
		try {
			//naresh serviceOrderId =soId
		ServiceOrder soorder=soRepositry.findById(soId).get();
		try {
			ServiceOrderStatus sostatus1=soSatusRep.findById(soorder.getServiceOrderStatusId()).get();
			soorder.setSoldBy(sostatus1.getDescription());//naresh what is sold by
		}catch (Exception e) {
			e.printStackTrace();
		}
		LocalDateTime ldt=soorder.getCreatedDate();
		
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");  
        String soDateCreated = ldt.format(format);  
		
 		Customer customerDetails=customer.findById(soorder.getCustomerId()).get();
			 
		int primaryContactId=serviceOrderContactRepository.findSitePrimaryContactId(soId,"SITE");
		 
		 Contact contactObj=contactRepository.findById(primaryContactId).get();
		 String relationshipTYpe=null;
		 if(contactObj.getRelationshipTypeId()>0) {//naresh what is relationship id?
				try {
					RelationshipType r=relationshipTypeRepository.findById(contactObj.getRelationshipTypeId()).get();
					relationshipTYpe=r.getDescription();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		 
		 String primaryPhoneNumber=sitesController.getPrimaryPhoneOREmail("PHONE",contactObj);
		 
		 String primaryEmail=sitesController.getPrimaryPhoneOREmail("EMAIL",contactObj);
		 
		 
		 
		 int primaryContactIdb=serviceOrderContactRepository.findSitePrimaryContactId(soId,"CUSTOMER");
		 
		 Contact contactObjb=contactRepository.findById(primaryContactIdb).get();
		 
		 String primaryPhoneNumberb=sitesController.getPrimaryPhoneOREmail("PHONE",contactObjb);
		 
		 String primaryEmailb=sitesController.getPrimaryPhoneOREmail("EMAIL",contactObjb);
		 
		 
		 
		 Employee emp=new Employee();
		 try {
 
		 emp=employeeRep.findById(soorder.getEmployeeId()).get();
		 }catch (Exception e) {
			e.printStackTrace();
		}
		
		Site site=siteRep.findById(soorder.getSiteId()).get(); //naresh serviceorder already has siteid. why to retrieve again?
		
		List<ServiceOrder> orders=soRepositry.findServiceOrderBySite(site.getSiteId(),companyId);
		ScheduleTime times=timeslot.findById(soorder.getScheduledTimeId()).get();
		
		/*
		 * contactPhone contactEmail
		 */
		
		
		Property property=propertyRepo.findById(site.getPropertyTypeId()).get();
		PaymentTerms pyamentterms=paymentTermsRepo.findById(soorder.getPaymentTermId()).get();
		MarketingCampaign marketingCampaign=marketingCampaignRepo.findById(soorder.getMarketingCampaignId()).get();
		
		List<EquipmentType> equipmetTypes=equipmentTypeRepo.findAll();
		List<Equipment> equipments=null;
		try {
		 equipments=equipmentRepo.findEquipments(site.getSiteId());
		}catch (Exception e) {
			e.printStackTrace();
		}
		 
		model.addObject("relationshipType",relationshipTYpe);
		model.addObject("soorder", soorder);
		model.addObject("customer", customerDetails);
		model.addObject("emp", emp);
		model.addObject("site", site);
		model.addObject("slot",times);
		 model.addObject("property", property);
		 model.addObject("pyamentterms", pyamentterms);
		 model.addObject("marketingCampaign", marketingCampaign);
		 
		 model.addObject("contactObj",contactObj);
		 model.addObject("primaryPhoneNumber",primaryPhoneNumber);
		 model.addObject("primaryEmail",primaryEmail);
		 
		 
		 model.addObject("contactObjBilling",contactObjb);
		 model.addObject("primaryPhoneNumberBilling",primaryPhoneNumberb);
		 model.addObject("primaryEmailBilling",primaryEmailb);
		 model.addObject("equipmetTypes",equipmetTypes);
		 
		 model.addObject("tabSet",tabSet);
		 model.addObject("soid",soId);
		 model.addObject("soDateCreated",soDateCreated);
		 
		 List<EquipmentsDto> equipmentsdtos=new ArrayList<EquipmentsDto>();
		 Iterator iterator=equipments.iterator();
		 
		 while(iterator.hasNext()) {
			 
			 Equipment equipment=(Equipment) iterator.next();
			 EquipmentsDto dto=new EquipmentsDto();
			 dto.setDescription(equipment.getDescription());
			 dto.setEquipmentId(equipment.getEquipmentId());
			  
			// dto.setInstallationDate(equipment.getInstallationDate());
			 dto.setManufacturer(equipment.getManufacturer());
			 dto.setName(equipment.getName());
			 dto.setSerialNumber(equipment.getSerialNumber());

			 List<Media> medialist=mediaRepo.findMediaList(4,equipment.getEquipmentId());
			try {
				if(medialist.size()>0) {
					String imgstr=Base64.getEncoder().encodeToString(medialist.get(0).getMediaFileBytes());
					dto.setImgStr(imgstr);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			 EquipmentType equipmentType=equipmentTypeRepo.findById(equipment.getEquipmentTypeID()).get();
			 dto.setType(equipmentType.getDescription());
			 try {
				 dto.setInstalledByUs(equipment.getInstalledByUs()); 
			 }catch(Exception e) {
				 
				 e.printStackTrace();
			 }
			 dto.setWarranty(equipment.getWarranty());
			 equipmentsdtos.add(dto);
			 
		 }
		 
		
			
			/*
			 * List<Media> taxmedialist=mediaRepo.findMediaList(2,soId); List<MediaDto>
			 * taxmedia=new ArrayList<>(); Iterator iterator3=taxmedialist.iterator();
			 * while(iterator2.hasNext()) {
			 * 
			 * Media media=(Media) iterator2.next(); String
			 * imgstr=Base64.getEncoder().encodeToString(media.getMediaFileBytes());
			 * 
			 * MediaDto mediadto=new MediaDto(); mediadto.setMediaId(media.getMediaId());
			 * mediadto.setSoId(soId); mediadto.setImgStr(imgstr);
			 * mediadto.setFileName(media.getMediaFileName());
			 * mediadto.setFileType(media.getMediaType());
			 * mediadto.setMediaCategoryId(media.getMediaCategoryId());
			 * mediadtoList.add(mediadto); }
			 * 
			 */		
		 //model.addObject("taxmedia",taxmedia);
		 
		 List<ServiceOrder> sorders=new ArrayList<ServiceOrder>();
		 Iterator itr=orders.iterator();
		 
		 while(itr.hasNext()) {
			 ServiceOrder ord=(ServiceOrder) itr.next();
			 
			 Employee emp1=employeeRep.findById(ord.getEmployeeId()).get();
			 
			 ServiceOrderStatus sostatus=soSatusRep.findById(ord.getServiceOrderStatusId()).get();
			 
			 ord.setLabour(emp1.getName());
			 
			 ord.setSoldBy(sostatus.getDescription());
			 sorders.add(ord);
		 }
		 
		 
		 model.addObject("orders", sorders);
		 
			
			
			/*
			 * try {
			 * 
			 * int c=mediaRepo.mediaCountForServiceOrder(soId,1);
			 * System.out.println("count..."+c);
			 * model.addObject("mediaCountForServiceOrder", c);
			 * 
			 * }catch (Exception e) {
			 * 
			 * }
			 */
			 
			 
			  try {
				  List<ServiceOrderNotes> serviceOrderNotes= serviceOrderNotesRepo.findServiceNotesByOrderId(soId);
				  model.addObject("serviceOrderNotes",serviceOrderNotes.get(0).getDescription());
				  System.out.println("serviceOrderNotes..."+serviceOrderNotes.get(0).getDescription());
			  }catch (Exception e) {
				e.printStackTrace();
			}
		
			  
			  
			  
			  
			  model.addObject("equipments",equipmentsdtos);
				 
				
			  
			  
		
		
	}catch(Exception e) {
		
		e.printStackTrace();
	}
	
		
		
		 List<Media> prbmedialist=mediaRepo.findMediaList(1,soId);
		 System.out.println("prbmedialist.size()  "+prbmedialist.size());
		 
		 List<Media> taxmedialist=mediaRepo.findMediaList(2,soId);
		 System.out.println("taxmedialist.size()  "+taxmedialist.size());
		 
		 
		 
		 prbmedialist.addAll(taxmedialist);
		 
		 System.out.println("prbmedialist.size()  "+prbmedialist.size());
		 List<MediaDto> mediadtoList=new ArrayList<>();
			Iterator iterator2=prbmedialist.iterator();
			while(iterator2.hasNext()) {
				
				Media media=(Media) iterator2.next();
				String imgstr=Base64.getEncoder().encodeToString(media.getMediaFileBytes());
				
				MediaDto mediadto=new MediaDto();
				mediadto.setMediaId(media.getMediaId());
				mediadto.setSoId(soId);
				mediadto.setImgStr(imgstr);
				mediadto.setFileName(media.getMediaFileName());
				mediadto.setFileType(media.getMediaType());
				
				mediadto.setMediaFileSize(media.getMediaFileSize());
				
				// naresh mediadto.setMediaCategoryId(media.getMediaCategoryId());
				mediadto.setMediaCategoryId(media.getMediaCategoryId());
				
				LocalDateTime ldt=media.getUpdatedDate();
				
				DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");  
		        String newFormat = ldt.format(format);  
		        
		        mediadto.setUpdatedDate(newFormat);
				
				
				
				mediadtoList.add(mediadto);
			}
		 model.addObject("prblumAttacments",mediadtoList);
		
		 model.setViewName("service-request-view");
		 
		 return model;
	}
	
	
	
	@RequestMapping("/newsoForExistingSite")
	public ModelAndView newsoForExistingSite(@RequestParam Integer soId , HttpSession session) {
		int companyId=6;
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String TIMESTAMP=timestamp.getTime()+"";
		System.out.println("newsoForExistingSite  TIMESTAMP.."+TIMESTAMP);
		
		
		
		
		List<CommonContactDTO> commonContactDTOSiteList=new ArrayList<CommonContactDTO>();
		List<CommonContactDTO> commonContactDTOBilingList=new ArrayList<CommonContactDTO>();
		
		
		List<CommonDTO> propertiesList = propertyServiceImpl.getAllProperties();
		List<CommonDTO> relationshipTypeList = relationServiceImpl.getAllRelationshipTypes();
		List<CommonDTO> phoneTypeList = phoneServiceImpl.getAllPhoneTypes();
		List<CommonDTO> problemTypeList = problemTypeServiceImpl.getAllProblemTypes();
		List<CommonDTO> priorityList = priorityServiceImpl.getAllPriorities();
		List<CommonDTO> marketingCampaignList = marketingCampaignServiceImpl.getAllMarketingCampaigns();
		List<CommonDTO> paymentTermsList = paymentTermsServiceImpl.getAllPaymentTerms();
		List<CommonDTO> scheduledTimesList = scheduleTimesServiceImpl.getAllScheduleTimes();
		List<CommonDTO> bankMasterList = bankMasterServiceImpl.getAllBankMasters();
		
		Map<Double, Object> mapObject1=new LinkedHashMap<Double, Object>();
		
		 
		
		handleSessionObjects(session);
		 
		 
		ModelAndView model=new ModelAndView(); 
		
		ServiceOrder soorder=soRepositry.findById(soId).get();
		
		Site site=siteRep.findById(soorder.getSiteId()).get();
		
		
		
		Customer customerDetails=customer.findById(soorder.getCustomerId()).get();
		
		System.out.println("vvvv "+customerDetails.getAddress());
		CustomerDetailsDTO customerDetailsDTO=null;
		try {
			customerDetailsDTO =(CustomerDetailsDTO) session.getAttribute(TIMESTAMP+"_CUSTOMER_DETAILSDTO_OBJECT");
		if(customerDetailsDTO==null) {
			customerDetailsDTO=new CustomerDetailsDTO();
			System.out.println("customerDetails.getCustomerId().."+customerDetails.getCustomerId());
			customerDetailsDTO.setBillingAddress(customerDetails.getAddress());
			customerDetailsDTO.setBillingUnit(customerDetails.getAddressUnit());
			customerDetailsDTO.setCustomerId(customerDetails.getCustomerId());
			
			customerDetailsDTO.setCustomerNumber(customerDetails.getCustomerNumber());
			customerDetailsDTO.setSiteAddress(site.getSiteAddress());
			customerDetailsDTO.setSiteUnit(site.getSiteUnit());
			customerDetailsDTO.setSiteId(site.getSiteId());
			session.setAttribute(TIMESTAMP+"_CUSTOMER_DETAILSDTO_OBJECT",customerDetailsDTO);
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("ending.....");
		
		List<ServiceOrderContact> soContactsList_sites=serviceOrderContactRepository.findServiceOrderContactsByType(soId,"SITE");
		
		Iterator soContactsItr=soContactsList_sites.iterator();
		while (soContactsItr.hasNext()) {
			ServiceOrderContact soContact = (ServiceOrderContact) soContactsItr.next();
			//int primaryContactId=serviceOrderContactRepository.findSitePrimaryContactId(soId,"SITE");
			 int contactId=soContact.getContactId();
			 Contact contactObj=contactRepository.findById(contactId).get();
			 
			 List<ContactPhone> contactPhoneList=new ArrayList<ContactPhone>();
				List<ContactEmail> contactEmailList=new ArrayList<ContactEmail>();
				
				 
			Set<ContactPhone> contactPhonesSet=	contactObj.getContactPhones();
			Set<ContactEmail> contactEmailsSet= contactObj.getContactEmails();
			
			Iterator i1=contactPhonesSet.iterator();
			while (i1.hasNext()) {
				ContactPhone cph = (ContactPhone) i1.next();
				contactPhoneList.add(cph);
			}
			
			Iterator i2=contactEmailsSet.iterator();
			while (i2.hasNext()) {
				ContactEmail cE = (ContactEmail) i2.next();
				contactEmailList.add(cE);
			}
			
			 
			 String primaryPhoneNumber=sitesController.getPrimaryPhoneOREmail("PHONE",contactObj);
			 String primaryEmail=sitesController.getPrimaryPhoneOREmail("EMAIL",contactObj);
			 
			 
			 
			 CommonContactDTO contactDTOResponseObject=new  CommonContactDTO();
				contactDTOResponseObject.setFirstName(contactObj.getFirstName());
				contactDTOResponseObject.setLastName(contactObj.getLastName());
				if(contactObj.getRelationshipTypeId()>0) {
					try {
						RelationshipType r=relationshipTypeRepository.findById(contactObj.getRelationshipTypeId()).get();
						contactDTOResponseObject.setRelationshipType(r.getDescription());
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
				
				contactDTOResponseObject.setPhoneNumber(primaryPhoneNumber);
				contactDTOResponseObject.setEmail(primaryEmail);
				contactDTOResponseObject.setIsPrimary(contactObj.getIsPrimary());
				//CONNECTORID TRANSACTIONID TIMESTAMP
				
				double  randomStr =  Math.random();
				contactDTOResponseObject.setRandomStr(randomStr);
				
				commonContactDTOSiteList.add(contactDTOResponseObject);
				 List obj=new ArrayList();
					
				  obj.add(contactObj); obj.add(contactPhoneList); obj.add(contactEmailList);
				  obj.add(contactDTOResponseObject);
				  
				  System.out.println("site contactEmailList.xize()..."+contactEmailList.size());
				   
				  mapObject1.put(randomStr, obj);
					
		}//while-end....
		
		 System.out.println("site contact size !@@@ time of copy..."+mapObject1.size());
		  session.setAttribute(TIMESTAMP+"_SITECONTACTMAPOBJECT", mapObject1);
		 
		  
		  
		  
		  
		  
		  
		  Map<Double, Object> mapObject=new LinkedHashMap<Double, Object>();
		  
		List<ServiceOrderContact> soContactsList_billing=serviceOrderContactRepository.findServiceOrderContactsByType(soId,"CUSTOMER");
		Iterator soContactsBillingItr=soContactsList_billing.iterator();
		while (soContactsBillingItr.hasNext()) {
			ServiceOrderContact soContact = (ServiceOrderContact) soContactsBillingItr.next();
			//int primaryContactId=serviceOrderContactRepository.findSitePrimaryContactId(soId,"SITE");
			 int contactId=soContact.getContactId();
			 Contact contactObj=contactRepository.findById(contactId).get();
			 
			 List<ContactPhone> contactPhoneList=new ArrayList<ContactPhone>();
				List<ContactEmail> contactEmailList=new ArrayList<ContactEmail>();
				
				 
			Set<ContactPhone> contactPhonesSet=	contactObj.getContactPhones();
			Set<ContactEmail> contactEmailsSet= contactObj.getContactEmails();
			
			Iterator i1=contactPhonesSet.iterator();
			while (i1.hasNext()) {
				ContactPhone cph = (ContactPhone) i1.next();
				contactPhoneList.add(cph);
			}
			
			Iterator i2=contactEmailsSet.iterator();
			while (i2.hasNext()) {
				ContactEmail cE = (ContactEmail) i2.next();
				contactEmailList.add(cE);
			}
			
			 
			 String primaryPhoneNumber=sitesController.getPrimaryPhoneOREmail("PHONE",contactObj);
			 String primaryEmail=sitesController.getPrimaryPhoneOREmail("EMAIL",contactObj);
			 
			 
			 
			 CommonContactDTO contactDTOResponseObject=new  CommonContactDTO();
				contactDTOResponseObject.setFirstName(contactObj.getFirstName());
				contactDTOResponseObject.setLastName(contactObj.getLastName());
				if(contactObj.getRelationshipTypeId()>0) {
					try {
						RelationshipType r=relationshipTypeRepository.findById(contactObj.getRelationshipTypeId()).get();
						contactDTOResponseObject.setRelationshipType(r.getDescription());
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
				
				contactDTOResponseObject.setPhoneNumber(primaryPhoneNumber);
				contactDTOResponseObject.setEmail(primaryEmail);
				contactDTOResponseObject.setIsPrimary(contactObj.getIsPrimary());
				//CONNECTORID TRANSACTIONID TIMESTAMP
				
				double  randomStr =  Math.random();
				contactDTOResponseObject.setRandomStr(randomStr);
				
				commonContactDTOBilingList.add(contactDTOResponseObject);
				 List obj=new ArrayList();
					
				 
				 System.out.println("bill contactEmailList.xize()..."+contactEmailList.size());
				  obj.add(contactObj); obj.add(contactPhoneList); obj.add(contactEmailList);
				  obj.add(contactDTOResponseObject);
				  
				   
				   
				  mapObject.put(randomStr, obj);
					
		}
		
		 
		  System.out.println("billing contact size !@@@ time of copy..."+mapObject.size());
		session.setAttribute(TIMESTAMP+"_BILLINGCONTACTMAPOBJECT", mapObject);
 
		model.addObject("siteDetails", site);
		model.addObject("customerDetails", customerDetails);
		System.out.println("customerDetails..."+customerDetails.getCustomerId());
		model.addObject("commonContactDTOBilingList", commonContactDTOBilingList);
		model.addObject("commonContactDTOSiteList", commonContactDTOSiteList);
		
		model.addObject("propertieslist", propertiesList);
		model.addObject("relationshiptypelist", relationshipTypeList);
		model.addObject("phonetypelist", phoneTypeList);
		model.addObject("problemtypelist", problemTypeList);
		model.addObject("serviceorderprioritylist", priorityList);
		model.addObject("marketingcampaignlist", marketingCampaignList);
		model.addObject("paymenttermslist", paymentTermsList);
		model.addObject("scheduledtimeslist", scheduledTimesList);
		model.addObject("bankmasterlist", bankMasterList);
		model.setViewName("service-request-copy");
		
		
		
		
		
		
		
		
		model.addObject("TIMESTAMP", TIMESTAMP);
		
		return model;
	}
	
	
	@RequestMapping("getEquipmentDeatils")
	public ResponseEntity<?> getEquipmentDetails(@RequestParam("equipmentId") Integer eqId){
		
		AjaxResponseBody result = new AjaxResponseBody();
		
		Equipment equ=equipmentRepo.findById(eqId).get();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		 
		String installationDate="";
		String mfgLaborWarrantyExpDate="";
		 String mfgMaterialWarrantyExpDate="";
		 String companyLaborWarrantyExpDate="";
		 String companyMaterialWarrantyExpDate="";
		 
		 String[] datesStrArray=new String[5];
		if(equ.getInstallationDate()!=null) {
		    installationDate=sdf.format(equ.getInstallationDate());
		} 
		
		if(equ.getMfgLaborWarrantyExpDate()!=null) {
			mfgLaborWarrantyExpDate=sdf.format(equ.getMfgLaborWarrantyExpDate());
		} 
		
		
		if(equ.getMfgMaterialWarrantyExpDate()!=null) {
			mfgMaterialWarrantyExpDate=sdf.format(equ.getMfgMaterialWarrantyExpDate());
		} 
		
		if(equ.getCompanyLaborWarrantyExpDate()!=null) {
			companyLaborWarrantyExpDate=sdf.format(equ.getCompanyLaborWarrantyExpDate());
		} 
		 
		if(equ.getCompanyMaterialWarrantyExpDate()!=null) {
			companyMaterialWarrantyExpDate=sdf.format(equ.getCompanyMaterialWarrantyExpDate());
		} 
		 
		 
		
		datesStrArray[0]=installationDate;
		datesStrArray[1]=mfgLaborWarrantyExpDate;
		datesStrArray[2]=mfgMaterialWarrantyExpDate;
		datesStrArray[3]=companyLaborWarrantyExpDate;
		datesStrArray[4]=companyMaterialWarrantyExpDate;
		 
 		 
		 
		/*
		 * try { System.out.println("dstr  "+dstr+"   "+sdf.parse(dstr));
		 * 
		 * DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		 * 
		 * LocalDate localDate = LocalDate.parse(dstr, formatter);
		 * 
		 * Date date =
		 * Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		 * 
		 * System.out.println(date); equ.setInstallationDate(date); } catch
		 * (ParseException e1) {
		 * 
		 * e1.printStackTrace(); }
		 */
		
		List<Media> medialist=mediaRepo.findMediaList(4,eqId);
		List<String> imgStr=new ArrayList();
		try {
			Iterator  itr=medialist.iterator();
			while(itr.hasNext()) {
				Media m=(Media) itr.next();
				String imgstr=Base64.getEncoder().encodeToString(m.getMediaFileBytes());
				imgStr.add(imgstr);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		List lis=new ArrayList<>();
		
		lis.add(equ);
		lis.add(imgStr);
		lis.add(datesStrArray);
		result.setMsg(lis);
	 
		return ResponseEntity.ok(result);
		
	}
	@RequestMapping("/getServiceOrderDetails")
	public ResponseEntity<?> getServiceOrderDetails(@RequestParam("soId") Integer soId){
		
		AjaxResponseBody result = new AjaxResponseBody();
		ServiceOrder order=soRepositry.findById(soId).get();
		ServiceOrderStatus sostatus=soSatusRep.findById(order.getServiceOrderStatusId()).get();
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
		 String s=sdf.format(order.getScheduleStart());
		 
		  
		order.setSoldBy(sostatus.getDescription());
		order.setApprovedBy(s);
		result.setMsg(order);
		return ResponseEntity.ok(result);
	}
	
	
	@RequestMapping("/confirmSOOrder")
	public ResponseEntity<?> confirmSOOrder(@RequestParam("soId") Integer soId){
		
		AjaxResponseBody result = new AjaxResponseBody();
		ServiceOrder order=soRepositry.findById(soId).get();
		ServiceOrderStatus sostatus=soSatusRep.findById(order.getServiceOrderStatusId()).get();
		 
		Customer customerDetails=customer.findById(order.getCustomerId()).get();
		 
		int primaryContactId=serviceOrderContactRepository.findSitePrimaryContactId(soId,"SITE");
		 
		 Contact contactObj=contactRepository.findById(primaryContactId).get();
		 
		 
		 String primaryPhoneNumber=sitesController.getPrimaryPhoneOREmail("PHONE",contactObj);
		 
		 String primaryEmail=sitesController.getPrimaryPhoneOREmail("EMAIL",contactObj);
		 
		 System.out.println(primaryEmail);
		 System.out.println(customerDetails.getName());
		 
		 
		 order.setServiceOrderStatusId(2);
		 
		 
		  
		 order.setConfirmedDate(LocalDateTime.now());
		 ServiceOrder order1=soRepositry.save(order);
		 SOSchedule schedule=new SOSchedule();
		 
		 schedule.setServiceOrderId(soId);
		 schedule.setEmployeeId(order.getEmployeeId());
		 schedule.setStatus(true);
		 schedule.setEmployeeRole("ADMIN");
		 schedule.setClientId(1);
		 schedule.setCreatedDate(LocalDateTime.now());
		 soschedule.save(schedule);
		
		result.setMsg(order);
		return ResponseEntity.ok(result);
	}
	
	@RequestMapping("/sendConfirmMsg")
	public ResponseEntity<?> sendConfirmMsgSOorder(@RequestParam("soId") Integer soId){
		
		AjaxResponseBody result = new AjaxResponseBody();
		ServiceOrder order=soRepositry.findById(soId).get();
		ServiceOrderStatus sostatus=soSatusRep.findById(order.getServiceOrderStatusId()).get();
		 
		order.setConfirmed(true);
		 order.setConfirmedDate(LocalDateTime.now());
		 soRepositry.save(order);
		 
		Customer customerDetails=customer.findById(order.getCustomerId()).get();
		 
		int primaryContactId=serviceOrderContactRepository.findSitePrimaryContactId(soId,"SITE");
		 
		 Contact contactObj=contactRepository.findById(primaryContactId).get();
		 
		 
		 String primaryPhoneNumber=sitesController.getPrimaryPhoneOREmail("PHONE",contactObj);
		 
		 String primaryEmail=sitesController.getPrimaryPhoneOREmail("EMAIL",contactObj);
		 
		 System.out.println(primaryEmail);
		 System.out.println(customerDetails.getName());
		 String link="<a href='http://localhost:8080/userConfirmSoOrder?soId="+soId+"&ci="+customerDetails.getCustomerId()+"'>Confirm</a><br/";
		 //String link="Your service order <b>"+order.getServiceOrderNumber()+"</b> confirmed <br/><br/>";
		 
		 
		 String msg="<h2>Thanks for your order, "+contactObj.getFirstName()+" "+contactObj.getLastName()+" </h2>";
		 
		 msg=msg+"<p>Here is your confirmation for order number <b>"+order.getServiceOrderNumber()+"</b>. Review your order and confirm from the following link: </p>";
		 
		// String msg1="Please complete your signup process by clicking the below link:<br/><br/><br/>";
		 String msg2="Thank You,<br/> Ergos Software Team";
		 
		 String subject="Thank you for your order.";
		 
		 mailservice.sendEmail(primaryEmail, subject,msg+msg2);
		 
		 
		 
		result.setMsg(order);
		return ResponseEntity.ok(result);
	}
	
	
	
}