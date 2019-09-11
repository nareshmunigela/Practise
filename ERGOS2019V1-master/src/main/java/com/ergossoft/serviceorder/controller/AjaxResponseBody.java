package com.ergossoft.serviceorder.controller;

import com.ergossoft.serviceorder.dto.CommonContactDTO;
import com.fasterxml.jackson.annotation.JsonView;

public class AjaxResponseBody {

	@JsonView(CommonContactDTO.class)
	Object msg;

	public Object getMsg() {
		return msg;
	}

	public void setMsg(Object msg) {
		this.msg = msg;
	}

}
