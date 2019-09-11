package com.ergossoft.serviceorder.service;

import java.util.List;

import com.ergossoft.serviceorder.dto.CommonDTO;

public interface EmployeeService {
	List<CommonDTO> findAllTechnician(int problemCd);
}
