package com.ergossoft.serviceorder.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ergossoft.serviceorder.dto.CommonDTO;
import com.ergossoft.serviceorder.model.ScheduleTime;
import com.ergossoft.serviceorder.repository.ScheduleTimeRepository;
import com.ergossoft.serviceorder.service.ScheduleTimeService;

@Service
public class ScheduleTimeServiceImpl implements ScheduleTimeService {

	@Autowired
	private ScheduleTimeRepository marketingCampaignRepo;

	@Override
	public List<CommonDTO> getAllScheduleTimes() {
		List<CommonDTO> commonDtoList = new ArrayList<>();
		try {

			// TO GET ONLY ACTIVE ScheduleTime LIST
			List<ScheduleTime> scheduleTimesList = marketingCampaignRepo.getActiveScheduleTimes();

			scheduleTimesList.forEach(scheduleTime -> {
				commonDtoList.add(new CommonDTO(scheduleTime.getScheduleTimeID(), scheduleTime.getDescription()));
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
		return commonDtoList;
	}

}
