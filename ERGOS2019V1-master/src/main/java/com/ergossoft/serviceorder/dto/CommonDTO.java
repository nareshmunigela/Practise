package com.ergossoft.serviceorder.dto;

public class CommonDTO {
	private Integer id;
	private String description;	

	public CommonDTO(Integer id, String description) {
		super();
		this.id = id;
		this.description = description != null ? description.trim():"";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
