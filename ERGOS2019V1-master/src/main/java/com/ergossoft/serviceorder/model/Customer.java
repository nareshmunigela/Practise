package com.ergossoft.serviceorder.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Customer_ID")
	private int customerId;

	@Column(name = "CustomerNumber")
	private String customerNumber;

	@Column(name = "Name")
	private String name;

	@Column(name = "FirstName")
	private String firstName;

	@Column(name = "LastName")
	private String lastName;

	@Column(name = "Address")
	private String address;

	@Column(name = "AddressUnit")
	private String addressUnit;
	
	@Column(name = "Note")
	private String note;
	
	@Column(name = "LastCall")
	private LocalDateTime lastCall;

	@Column(name = "ARtermsCode")
	private String arTermsCodeType;

	@Column(name = "Rating")
	private Float rating;

	@Column(name = "Comment")
	private String comments;
	
	@Column(name = "UnappliedCash")
	private Float unAppliedCash;

	@Column(name = "Blocked")
	private int blocked;

	@Column(name = "CustomerSince")
	private LocalDateTime customerSince;

	
	/*
	 * @Column(name = "PreciseAddress") private String preciseAddress;
	 * 
	 * @Column(name = "ZipCode") private String zipCode;
	 * 
	 * @Column(name = "State") private String state;
	 * 
	 * @Column(name = "City") private String city;
	 */
	@Column(name = "Client_ID")
	private int clientId;

	@Column(name = "Company_ID")
	private int companyId;
	@Column(name = "Status")
	private int status;
	
	
   	@Column(name = "UpdatedDate")
	private LocalDateTime lastModifiedDate;

 
	@Column(name = "UpdatedBy")
	private String lastModifiedBy;
	
	/*
	 * @Column(name = "Country") private String country;
	 */
	
/*	@Column(name = "Sector")
	private String sector;*/

	
	
	/*
	 * @Column(name = "EventLog") private String eventLog;
	 */
	
	
	/*
	 * @Column(name = "TaxExempt") private Boolean taxExempt;
	 * 
	 * @Column(name = "Reason") private String reason;
	 */
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
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

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public LocalDateTime getLastCall() {
		return lastCall;
	}

	public void setLastCall(LocalDateTime lastCall) {
		this.lastCall = lastCall;
	}

	public String getArTermsCodeType() {
		return arTermsCodeType;
	}

	public void setArTermsCodeType(String arTermsCodeType) {
		this.arTermsCodeType = arTermsCodeType;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Float getUnAppliedCash() {
		return unAppliedCash;
	}

	public void setUnAppliedCash(Float unAppliedCash) {
		this.unAppliedCash = unAppliedCash;
	}

	public int getBlocked() {
		return blocked;
	}

	public void setBlocked(int blocked) {
		this.blocked = blocked;
	}


	public LocalDateTime getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
//naresh converted from int to string
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public LocalDateTime getCustomerSince() {
		return customerSince;
	}

	public void setCustomerSince(LocalDateTime customerSince) {
		this.customerSince = customerSince;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
	

}
