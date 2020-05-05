package com.pnc.springcore.autowiring;

public class Address {
	private String colonyName;
	private String landmark;
	private String appartmentName;
	
	public Address(){
	}
	
	public Address(String colonyName, String landmark, String appartmentName) {
		this.colonyName = colonyName;
		this.landmark = landmark;
		this.appartmentName = appartmentName;
	}
	
	public String getColonyName() {
		return colonyName;
	}
	public void setColonyName(String colonyName) {
		this.colonyName = colonyName;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getAppartmentName() {
		return appartmentName;
	}
	public void setAppartmentName(String appartmentName) {
		this.appartmentName = appartmentName;
	}
}
