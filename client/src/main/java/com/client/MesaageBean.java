package com.client;

public class MesaageBean {
	
	private String code;
	private String message;
	private String type;
	
	public MesaageBean(String code,String message,String type) {
		this.code=code;
		this.message=message;
		this.type=type;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
