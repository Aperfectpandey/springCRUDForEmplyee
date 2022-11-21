package com.example.practice.DataObjects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
 private int empId;
 private String firstName;
 private String lastName;
 private String address;
 private int mobNo;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getMobNo() {
	return mobNo;
}
public void setMobNo(int mobNo) {
	this.mobNo = mobNo;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
			+ ", mobNo=" + mobNo + "]";
}
 
}
