package com.ergossoft.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ergossoft.serviceorder.repository.ServiceOrderRepository;

@Service
public class ServiceOrderGeneratorUtil {

	@Autowired
	private ServiceOrderRepository serviceOrderRepository;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("YYMMdd");
	
	public String generateSO(int clientId) {
		LocalDate now = LocalDate.now();
		LocalDateTime start = LocalDateTime.of(now, LocalTime.of(0, 0, 0));
		LocalDateTime end = LocalDateTime.of(now, LocalTime.of(23, 59, 59));
		int count = serviceOrderRepository.findSOCountByClientId(clientId, start, end);
		return sdf.format(new Date())+String.format ("%03d", ++count);
	}
}
