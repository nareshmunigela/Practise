package com.ergossoft.serviceorder.dto;

/**
 *  
 *
 */
public class CustomerDetailsDTO {

	private String customerName;
	private int propertyTypeId;
	private String siteAddress;
	private String siteUnit;
	private Boolean taxExempt;
	private String reason;
	private int customerId;
	
	private String billingAddress;
	private String billingUnit;
	
	private int siteId;
	private int billingAddressId;
	 
 
	private String customerNumber; 
	
	private Boolean taxExemptCustomer;
	private String reasonCustomer;
	
	
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getPropertyTypeId() {
		return propertyTypeId;
	}

	public void setPropertyTypeId(int propertyTypeId) {
		this.propertyTypeId = propertyTypeId;
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

	public Boolean getTaxExempt() {
		return taxExempt;
	}

	public void setTaxExempt(Boolean taxExempt) {
		this.taxExempt = taxExempt;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getSiteId() {
		return siteId;
	}

	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getBillingUnit() {
		return billingUnit;
	}

	public void setBillingUnit(String billingUnit) {
		this.billingUnit = billingUnit;
	}

	public int getBillingAddressId() {
		return billingAddressId;
	}

	public void setBillingAddressId(int billingAddressId) {
		this.billingAddressId = billingAddressId;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public Boolean getTaxExemptCustomer() {
		return taxExemptCustomer;
	}

	public void setTaxExemptCustomer(Boolean taxExemptCustomer) {
		this.taxExemptCustomer = taxExemptCustomer;
	}

	public String getReasonCustomer() {
		return reasonCustomer;
	}

	public void setReasonCustomer(String reasonCustomer) {
		this.reasonCustomer = reasonCustomer;
	}

	 
	

}
