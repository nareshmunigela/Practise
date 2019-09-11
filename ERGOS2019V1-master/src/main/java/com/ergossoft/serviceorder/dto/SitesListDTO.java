package com.ergossoft.serviceorder.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;

public class SitesListDTO {

	private Integer siteId;

	private String siteNumber;

	private Integer customerId;

	private String customerNumber;
	private String siteAddress;
	
	private String sitePreciseAddress;
	private String siteExtAddress;

	private String siteUnit;

	private Integer serviceOrderId;

	private String serviceOrderNumber;
	private LocalDateTime updatedDate;
	
	private String customerName;
	private String address;
	private String preciseAddress;
	private String extAddress;
	
	private String lastModifiedDate;
	private int lastModifiedBy;
	private String addressUnit;
	
	private String primaryPhone;
	private String primaryEmail;
	
	private String primaryContactName;

	public Integer getSiteId() {
		return siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	public String getSiteNumber() {
		return siteNumber;
	}

	public void setSiteNumber(String siteNumber) {
		this.siteNumber = siteNumber;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getSiteAddress() {
		return siteAddress;
	}

	public void setSiteAddress(String siteAddress) {
		this.siteAddress = siteAddress;
	}

	public String getSiteUnit() {
		return siteUnit;
	}

	public void setSiteUnit(String siteUnit) {
		this.siteUnit = siteUnit;
	}

	public Integer getServiceOrderId() {
		return serviceOrderId;
	}

	public void setServiceOrderId(Integer serviceOrderId) {
		this.serviceOrderId = serviceOrderId;
	}

	public String getServiceOrderNumber() {
		return serviceOrderNumber;
	}

	public void setServiceOrderNumber(String serviceOrderNumber) {
		this.serviceOrderNumber = serviceOrderNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressUnit() {
		return addressUnit;
	}

	public void setAddressUnit(String addressUnit) {
		this.addressUnit = addressUnit;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getPrimaryPhone() {
		return primaryPhone;
	}

	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}

	public String getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPrimaryContactName() {
		return primaryContactName;
	}

	public void setPrimaryContactName(String primaryContactName) {
		this.primaryContactName = primaryContactName;
	}

	public String getSitePreciseAddress() {
		return sitePreciseAddress;
	}

	public void setSitePreciseAddress(String sitePreciseAddress) {
		this.sitePreciseAddress = sitePreciseAddress;
	}

	public String getSiteExtAddress() {
		return siteExtAddress;
	}

	public void setSiteExtAddress(String siteExtAddress) {
		this.siteExtAddress = siteExtAddress;
	}

	public String getPreciseAddress() {
		return preciseAddress;
	}

	public void setPreciseAddress(String preciseAddress) {
		this.preciseAddress = preciseAddress;
	}

	public String getExtAddress() {
		return extAddress;
	}

	public void setExtAddress(String extAddress) {
		this.extAddress = extAddress;
	}

	public String getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public int getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(int lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	 

}
