package com.ergossoft.serviceorder.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BillToHistory")
public class CustomerBillingAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BillingAddressId")
	private Integer billingAddressId;

	@Column(name = "CustomerId")
	private Integer customerId;

	@Column(name = "Address")
	private String Address;

	@Column(name = "Unit")
	private String Unit;

	@Column(name = "Latitude")
	private String Latitude;

	@Column(name = "Longitude")
	private String Longitude;

	@Column(name = "State")
	private String State;

	@Column(name = "City")
	private String City;

	@Column(name = "ZipCode")
	private String ZipCode;

	@Column(name = "RecordStatus")
	private String RecordStatus;

	@Column(name = "Status")
	private String Status;

	@Column(name = "EventLog")
	private String eventLog;
	
   	@Column(name = "LastModifiedDate")
	private LocalDateTime lastModifiedDate;

 
	@Column(name = "LastModifiedBy")
	private int lastModifiedBy;


	public Integer getBillingAddressId() {
		return billingAddressId;
	}

	public void setBillingAddressId(Integer billingAddressId) {
		this.billingAddressId = billingAddressId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getUnit() {
		return Unit;
	}

	public void setUnit(String unit) {
		Unit = unit;
	}

	public String getLatitude() {
		return Latitude;
	}

	public void setLatitude(String latitude) {
		Latitude = latitude;
	}

	public String getLongitude() {
		return Longitude;
	}

	public void setLongitude(String longitude) {
		Longitude = longitude;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getZipCode() {
		return ZipCode;
	}

	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}

	public String getRecordStatus() {
		return RecordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		RecordStatus = recordStatus;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getEventLog() {
		return eventLog;
	}

	public void setEventLog(String eventLog) {
		this.eventLog = eventLog;
	}

	public LocalDateTime getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public int getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(int lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	 
}
