/**
 * 
 */
package com.ergossoft.serviceorder.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Site")
public class Site {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Site_ID")
	private Integer siteId;

	@Column(name = "SiteNumber")
	private String siteNumber;

	@Column(name = "Customer_ID")
	private Integer customerId;
	
	@Column(name = "PropertyType_ID")
	private Integer propertyTypeId;


	@Column(name = "SiteAddress")
	private String siteAddress;
	
	@Column(name = "SiteUnit")
	private String siteUnit;

	
	/*
	 * @Column(name = "PreciseAddress") private String preciseAddress;
	 */
	   @Column(name = "ZipCode_ID") 
	   private String zipCode;
		  @Column(name = "State_ID") 
		  private String state;
		 

		@Column(name = "City")
		private String city;
		
		
	/*
	 * @Column(name = "Country") private String country;
	 */
		 
		

		@Column(name = "Sector")
		private String sector;

		@Column(name = "Comments")
		private String comments; 
	 
	/*
	 * @Column(name = "ZipCode_ID") private Integer zipCodeId;
	 * 
	 * @Column(name = "State_ID") private Integer stateCodeId;
	 */
	
	
	
	

	


	@Column(name = "TaxJurisdictionCode_ID")
	private Integer taxJurisdictionCodeId;

	@Column(name = "Reason")
	private String reason;

	@Column(name = "TaxExempt")
	private Boolean taxExempt;
	@Column(name = "AgeOfHome")
	private String ageOfHome;
	@Column(name = "Latitude")
	private String latitude;
	
	@Column(name = "Longitude")
	private String longitude;
	
	@Column(name = "Client_ID")
	private Integer clientId;
	/*
	 * @Column(name = "Company_ID") private Integer companyId;
	 */

	@Column(name = "Status")
	private int status;
	
	@Column(name = "UpdatedDate") private LocalDateTime lastModifiedDate;
	@Column(name = "UpdatedBy")
	private String lastModifiedBy;

	/*
	 * @Column(name = "EventLog") private String eventLog;
	 * 
	 * 
	 * @Column(name = "LastModifiedDate") private LocalDateTime lastModifiedDate;
	 * 
	 * 
	 * 
	 * 
	 */



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



	public Integer getPropertyTypeId() {
		return propertyTypeId;
	}



	public void setPropertyTypeId(Integer propertyTypeId) {
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



	/*
	 * public String getPreciseAddress() { return preciseAddress; }
	 * 
	 * 
	 * 
	 * public void setPreciseAddress(String preciseAddress) { this.preciseAddress =
	 * preciseAddress; }
	 */



	public String getZipCode() {
		return zipCode;
	}



	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	/* naresh
	 * public String getCountry() { return country; }
	 * 
	 * 
	 * 
	 * public void setCountry(String country) { this.country = country; }
	 */



	public String getSector() {
		return sector;
	}



	public void setSector(String sector) {
		this.sector = sector;
	}



	public String getComments() {
		return comments;
	}



	public void setComments(String comments) {
		this.comments = comments;
	}



	public Integer getTaxJurisdictionCodeId() {
		return taxJurisdictionCodeId;
	}



	public void setTaxJurisdictionCodeId(Integer taxJurisdictionCodeId) {
		this.taxJurisdictionCodeId = taxJurisdictionCodeId;
	}



	public String getReason() {
		return reason;
	}



	public void setReason(String reason) {
		this.reason = reason;
	}



	public Boolean getTaxExempt() {
		return taxExempt;
	}



	public void setTaxExempt(Boolean taxExempt) {
		this.taxExempt = taxExempt;
	}



	public String getAgeOfHome() {
		return ageOfHome;
	}



	public void setAgeOfHome(String ageOfHome) {
		this.ageOfHome = ageOfHome;
	}



	public String getLatitude() {
		return latitude;
	}



	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}



	public String getLongitude() {
		return longitude;
	}



	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}



	public Integer getClientId() {
		return clientId;
	}



	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}



	/*
	 * public Integer getCompanyId() { return companyId; }
	 * 
	 * 
	 * 
	 * public void setCompanyId(Integer companyId) { this.companyId = companyId; }
	 */


	public int getStatus() {
		return status;
	}



	public void setStatus(int status) {
		this.status = status;
	}



	/*
	 * public String getEventLog() { return eventLog; }
	 * 
	 * 
	 * 
	 * public void setEventLog(String eventLog) { this.eventLog = eventLog; }
	 * 
	 * 
	 *  */
	 public LocalDateTime getLastModifiedDate() { return lastModifiedDate; }
	  
	  
	  
	  public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
	  this.lastModifiedDate = lastModifiedDate; }
	 


	
	  public String getLastModifiedBy() { return lastModifiedBy; }
	  
	  
	  
	  public void setLastModifiedBy(String lastModifiedBy) { this.lastModifiedBy =
	  lastModifiedBy; }
	 
	

	
}
