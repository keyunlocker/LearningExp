package com.client;

import java.io.Serializable;


public class DataSend implements Serializable{
	
	public boolean isSelected() {
		return isSelected;
	}
	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private boolean isSelected;
	private String name;
	
	
}
