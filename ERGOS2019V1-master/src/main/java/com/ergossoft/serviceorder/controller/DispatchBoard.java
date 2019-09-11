package com.ergossoft.serviceorder.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ergossoft.serviceorder.dto.ServiceOrderDTO;
import com.ergossoft.serviceorder.model.Employee;
import com.ergossoft.serviceorder.model.ServiceOrder;
import com.ergossoft.serviceorder.model.Site;
import com.ergossoft.serviceorder.repository.EmployeeRepository;
import com.ergossoft.serviceorder.repository.ServiceOrderRepository;
import com.ergossoft.serviceorder.repository.SiteRepository;

@Controller
public class DispatchBoard {

	@Autowired
	EmployeeRepository employeRepo;
	@Autowired
	SiteRepository siteRep;
	
	@Autowired
	ServiceOrderRepository soRepositry;
	
	@RequestMapping("/dispatchboard")
	public ModelAndView dispatchboard() {
		ModelAndView modelView = new ModelAndView();
		List<Employee> employeeLists=new ArrayList<Employee>();
		List<Employee> employeeList=employeRepo.findAll();
		Iterator itr=employeeList.iterator();
		while(itr.hasNext()) {
			Employee employee=(Employee) itr.next();
			
			String imgstr=Base64.getEncoder().encodeToString(employee.getImage());
			employee.setSector(imgstr);
			employeeLists.add(employee);
			
		}
		modelView.addObject("employeeLists", employeeLists);
		modelView.setViewName("dispatchboard");
		return modelView;
	}

	
	
	
	@RequestMapping("/getSosForDispatchBoard")
	public ResponseEntity<?> soOrdersForDispatch(){
	System.out.println("getSosForDispatchBoard");
		List<ServiceOrder> solists=soRepositry.allServiceOrders(6);
		List<ServiceOrderDTO> soList=new ArrayList<>();
		
		AjaxResponseBody result = new AjaxResponseBody();
		
		Iterator itr=solists.iterator();
		while(itr.hasNext()) {
			ServiceOrderDTO dto=new ServiceOrderDTO();
			ServiceOrder order=(ServiceOrder) itr.next();
			Employee emp=employeRepo.findById(order.getEmployeeId()).get();
			Site site=siteRep.findById(order.getSiteId()).get();
			dto.setEmpImsStr(Base64.getEncoder().encodeToString(emp.getImage()));
			dto.setSiteAddress(site.getSiteAddress());
			dto.setEmployeeName(emp.getName());
			dto.setSoId(order.getServiceOrderId());
			dto.setScheduleStart(order.getScheduleStart());
			soList.add(dto);
		}
		
		result.setMsg(soList);
		return ResponseEntity.ok(result);
	}
}
