package com.ergossoft.serviceorder.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customerbank")
public class CustomerBankDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CustomerBank_ID")
	private Integer customerAccountId;

	@Column(name = "Customer_ID")
	private Integer customerId;

	@Column(name = "Bank_ID")
	private int bankId;

	@Column(name = "AccountNumber")
	private String accountNumber;

	@Column(name = "RoutingNumber")
	private Integer routingNumber;

 

	@Column(name = "Status")
	private int status;

	@Column(name = "EventLog")
	private String eventLog;
	
   	@Column(name = "LastModifiedDate")
	private LocalDateTime lastModifiedDate;
//naresh
 
	@Column(name = "LastModifiedBy")
	private String lastModifiedBy;


	
	
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

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Integer getCustomerAccountId() {
		return customerAccountId;
	}

	public void setCustomerAccountId(Integer customerAccountId) {
		this.customerAccountId = customerAccountId;
	}

	public int getStatus() {
		return status;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

 

	public int isStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Integer getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(Integer routingNumber) {
		this.routingNumber = routingNumber;
	}
	
	
}
