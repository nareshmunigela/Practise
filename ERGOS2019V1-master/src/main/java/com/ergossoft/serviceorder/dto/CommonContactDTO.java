package com.ergossoft.serviceorder.dto;

public class CommonContactDTO {

	private String firstName;
	private String lastName;
	private int relationshipTypeId;

	private String phoneTypeId;
	private String phoneNumber;

	private String email;

	private String relationshipType;
	
	private boolean isPrimary;
	private String primaryContact;
	private String primaryEmail;
	
	 
	
	private double randomStr;
	
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

	public int getRelationshipTypeId() {
		return relationshipTypeId;
	}

	public void setRelationshipTypeId(int relationshipTypeId) {
		this.relationshipTypeId = relationshipTypeId;
	}

	public String getPhoneTypeId() {
		return phoneTypeId;
	}

	public void setPhoneTypeId(String phoneTypeId) {
		this.phoneTypeId = phoneTypeId;
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

	public String getRelationshipType() {
		return relationshipType;
	}

	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}

	public String getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}

	public String getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

 

	
	public double getRandomStr() {
		return randomStr;
	}

	public void setRandomStr(double randomStr) {
		this.randomStr = randomStr;
	}

	public boolean getIsPrimary() {
		return isPrimary;
	}

	public void setIsPrimary(boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

}
