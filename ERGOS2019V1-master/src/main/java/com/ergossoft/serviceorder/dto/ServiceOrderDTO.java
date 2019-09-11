package com.ergossoft.serviceorder.dto;

import java.util.Date;

public class ServiceOrderDTO {

	private int problemTypeId;
	private String openingCommments;
	private int priorityId;
	private int marketingCampaignId;

	private Date scheduleStart;

	private int scheduledTimeId;
	private int scheduledDays;
	private int employeeId;
	private int paymentTermId;
	private String scheduleNote;
	 
	
	private String employeeName;
	
	private String empImsStr;
	
	private String siteAddress;
	
	private int soId;

	public int getProblemTypeId() {
		return problemTypeId;
	}

	public void setProblemTypeId(int problemTypeId) {
		this.problemTypeId = problemTypeId;
	}

	public String getOpeningCommments() {
		return openingCommments;
	}

	public void setOpeningCommments(String openingCommments) {
		this.openingCommments = openingCommments;
	}

	public int getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(int priorityId) {
		this.priorityId = priorityId;
	}

	public int getMarketingCampaignId() {
		return marketingCampaignId;
	}

	public void setMarketingCampaignId(int marketingCampaignId) {
		this.marketingCampaignId = marketingCampaignId;
	}

	public Date getScheduleStart() {
		return scheduleStart;
	}

	public void setScheduleStart(Date scheduleStart) {
		this.scheduleStart = scheduleStart;
	}

	public int getScheduledTimeId() {
		return scheduledTimeId;
	}

	public void setScheduledTimeId(int scheduledTimeId) {
		this.scheduledTimeId = scheduledTimeId;
	}

	public int getScheduledDays() {
		return scheduledDays;
	}

	public void setScheduledDays(int scheduledDays) {
		this.scheduledDays = scheduledDays;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getPaymentTermId() {
		return paymentTermId;
	}

	public void setPaymentTermId(int paymentTermId) {
		this.paymentTermId = paymentTermId;
	}

	public String getScheduleNote() {
		return scheduleNote;
	}

	public void setScheduleNote(String scheduleNote) {
		this.scheduleNote = scheduleNote;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmpImsStr() {
		return empImsStr;
	}

	public void setEmpImsStr(String empImsStr) {
		this.empImsStr = empImsStr;
	}

	public String getSiteAddress() {
		return siteAddress;
	}

	public void setSiteAddress(String siteAddress) {
		this.siteAddress = siteAddress;
	}

	public int getSoId() {
		return soId;
	}

	public void setSoId(int soId) {
		this.soId = soId;
	}

	
	
	
	
}
