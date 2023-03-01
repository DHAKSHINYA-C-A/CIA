package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity


public class Address {
 @Id 
private String EmployeeName;
private String Address;
private int pincode;
public Address(String employeeName, String address, int pincode) {
	super();
	EmployeeName = employeeName;
	Address = address;
	this.pincode = pincode;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public String getEmployeeName() {
	return EmployeeName;
}
public void setEmployeeName(String employeeName) {
	EmployeeName = employeeName;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}

	

}
