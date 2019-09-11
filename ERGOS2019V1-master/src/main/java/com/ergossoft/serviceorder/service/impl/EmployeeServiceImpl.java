/**
 * 
 */
package com.ergossoft.serviceorder.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ergossoft.serviceorder.dto.CommonDTO;
import com.ergossoft.serviceorder.model.Employee;
import com.ergossoft.serviceorder.repository.EmployeeRepository;
import com.ergossoft.serviceorder.service.EmployeeService;
 

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<CommonDTO> findAllTechnician(int problemCd) {
		List<Employee> employees = employeeRepository.findAllEmployeeByProblemType(problemCd);
		List<CommonDTO> commonDtos = new ArrayList<CommonDTO>();
		employees.forEach(e -> {
			CommonDTO commonDto = new CommonDTO(e.getEmployeeId(), e.getName());
			commonDtos.add(commonDto);
		});
		return commonDtos;
	}

		
}
