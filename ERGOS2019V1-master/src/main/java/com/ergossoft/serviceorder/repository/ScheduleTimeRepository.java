package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ergossoft.serviceorder.model.MarketingCampaign;
import com.ergossoft.serviceorder.model.PhoneType;
import com.ergossoft.serviceorder.model.Priority;
import com.ergossoft.serviceorder.model.Property;
import com.ergossoft.serviceorder.model.ScheduleTime;

@Repository
public interface ScheduleTimeRepository extends JpaRepository<ScheduleTime, Integer>{

	@Query("select scheduleTime from ScheduleTime scheduleTime where scheduleTime.status=true")
	public List<ScheduleTime> getActiveScheduleTimes();
}
