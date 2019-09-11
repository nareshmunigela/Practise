package com.ergossoft.serviceorder.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SOSchedule")

public class SOSchedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SOSchedule_ID")
	private int soScheduleId;

	@Column(name = "SO_ID")
	private int serviceOrderId;

	@Column(name = "Description")
	private String description;

	@Column(name = "ScheduleStart")
	private LocalDateTime scheduleStart;

	@Column(name = "ScheduleEnd")
	private LocalDateTime scheduleEnd;
	
	@Column(name = "TravelStart")
	private LocalDateTime travelStart;

	@Column(name = "TravelEnd")
	private LocalDateTime travelEnd;

	@Column(name = "Arrival")
	private LocalDateTime arrival;

	@Column(name = "WorkFinished")
	private LocalDateTime workFinished;

	@Column(name = "TravelTime")
	private LocalDateTime travelTime;

	@Column(name = "WorkTime")
	private LocalDateTime workTime;

	@Column(name = "Employee_ID")
	private Integer employeeId;

	@Column(name = "EmployeeRole")
	private String employeeRole;

	@Column(name = "Client_ID")
	private int clientId;

	@Column(name = "Status")
	private Boolean status;

	@Column(name = "CreatedDate")
	private LocalDateTime createdDate;

	@Column(name = "UpdatedDate")
	private LocalDateTime updatedDate;

	@Column(name = "DeletedDate")
	private LocalDateTime deletedDate;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "UpdatedBy")
	private String updatedBy;

	@Column(name = "DeletedBy")
	private String deletedBy;

/*	@Column(name = "ArrivedDate")
	private LocalDateTime arrivedDate;*/

	public int getSoScheduleId() {
		return soScheduleId;
	}

	public void setSoScheduleId(int soScheduleId) {
		this.soScheduleId = soScheduleId;
	}

	public int getServiceOrderId() {
		return serviceOrderId;
	}

	public void setServiceOrderId(int serviceOrderId) {
		this.serviceOrderId = serviceOrderId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getScheduleStart() {
		return scheduleStart;
	}

	public void setScheduleStart(LocalDateTime scheduleStart) {
		this.scheduleStart = scheduleStart;
	}

	public LocalDateTime getScheduleEnd() {
		return scheduleEnd;
	}

	public void setScheduleEnd(LocalDateTime scheduleEnd) {
		this.scheduleEnd = scheduleEnd;
	}
	
	public LocalDateTime getTravelStart() {
		return travelStart;
	}

	public void setTravelStart(LocalDateTime travelStart) {
		this.travelStart = travelStart;
	}

	public LocalDateTime getTravelEnd() {
		return travelEnd;
	}

	public void setTravelEnd(LocalDateTime travelEnd) {
		this.travelEnd = travelEnd;
	}

	public LocalDateTime getArrival() {
		return arrival;
	}

	public void setArrival(LocalDateTime arrival) {
		this.arrival = arrival;
	}

	public LocalDateTime getWorkFinished() {
		return workFinished;
	}

	public void setWorkFinished(LocalDateTime workFinished) {
		this.workFinished = workFinished;
	}

	public LocalDateTime getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(LocalDateTime travelTime) {
		this.travelTime = travelTime;
	}

	public LocalDateTime getWorkTime() {
		return workTime;
	}

	public void setWorkTime(LocalDateTime workTime) {
		this.workTime = workTime;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeRole() {
		return employeeRole;
	}

	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public LocalDateTime getDeletedDate() {
		return deletedDate;
	}

	public void setDeletedDate(LocalDateTime deletedDate) {
		this.deletedDate = deletedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}
/*
	public LocalDateTime getArrivedDate() {
		return arrivedDate;
	}

	public void setArrivedDate(LocalDateTime arrivedDate) {
		this.arrivedDate = arrivedDate;
	}*/

}
