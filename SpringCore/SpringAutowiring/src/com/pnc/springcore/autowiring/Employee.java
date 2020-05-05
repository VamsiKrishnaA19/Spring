package com.pnc.springcore.autowiring;

public class Employee {
	private String name;
	private int id;
	private Address address;
	
	public Employee(){
	}
	
	public Employee(String name, int id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {
		System.out.println("Employee details are: [name=" + name + ", id=" + id + ", address=" + address.getColonyName()+ "]"); 
	}
	
}
