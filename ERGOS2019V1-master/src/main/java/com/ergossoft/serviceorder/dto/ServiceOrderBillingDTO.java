package com.ergossoft.serviceorder.dto;

public class ServiceOrderBillingDTO {

	private int bankId;
	private int routingNumber;
	private String accountNumber;

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public int getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(int routingNumber) {
		this.routingNumber = routingNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

}
