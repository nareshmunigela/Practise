package com.ergossoft.serviceorder.dto;

public class CommonContactResponseDTO {

	private String firstName;
	private String lastName;
	private int relationshipTypeId;

	private String phoneTypeId;
	private String phoneNumber;

	private String email;

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

}
