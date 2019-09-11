package com.ergossoft.serviceorder.model;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Client")
public class Client {
	@Id
	@Column(name = "Client_ID")
	private Integer clientId;

	@Column(name = "ClientName")
	private String companyName;

	@Column(name = "FirstName")
	private String firstName;

	@Column(name = "LastName")
	private String lastName;

	@Column(name = "Designation")
	private String designation;

	@Column(name = "Address")
	private String address;

	@Column(name = "City")
	private String city;

	@Column(name = "State_ID")
	private Integer stateCode;

	@Column(name = "ZipCode_ID")
	private Integer zipCode;

	@Column(name = "PhoneNumber")
	private String phoneNumber;

	@Column(name = "Email")
	private String email;

	@Column(name = "WebSite")
	private String website;

	@Column(name = "Logo")
	private Byte logo;

	@Column(name = "SubScriptionPlan_ID")
	private Integer subscriptionPlan;

	@Column(name = "NumberOfCompanies")
	private Integer numberofCompanies;

	@Column(name = "RegisteredDate")
	private Date registeredDate;

	@Column(name = "ActivationDate")
	private Date activationDate;

	@Column(name = "Status")
	private boolean status;

	@Column(name = "CreatedDate")
	private LocalDateTime createdDate;

	@Column(name = "UpdatedDate")
	private LocalDateTime updatedDate;

	@Column(name = "deletDeletedDateed_date")
	private LocalDateTime deletedDate;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "UpdatedBy")
	private String updatedBy;

	@Column(name = "DeletedBy")
	private String deletedBy;

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getStateCode() {
		return stateCode;
	}

	public void setStateCode(Integer stateCode) {
		this.stateCode = stateCode;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Byte getLogo() {
		return logo;
	}

	public void setLogo(Byte logo) {
		this.logo = logo;
	}

	public Integer getSubscriptionPlan() {
		return subscriptionPlan;
	}

	public void setSubscriptionPlan(Integer subscriptionPlan) {
		this.subscriptionPlan = subscriptionPlan;
	}

	public Integer getNumberofCompanies() {
		return numberofCompanies;
	}

	public void setNumberofCompanies(Integer numberofCompanies) {
		this.numberofCompanies = numberofCompanies;
	}

	public Date getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}

	public Date getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
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

}
