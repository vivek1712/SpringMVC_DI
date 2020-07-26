package com.vivek.entity;

public class Student {
private Long id;
private String stuName;
private String courseName;
private Address address;
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getStuName() {
	return stuName;
}
public void setStuName(String stuName) {
	this.stuName = stuName;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public String toString()
{
String re="Student id : "+this.getId()+" Student name  :"+this.getStuName()+" Course Name :"+this.getCourseName()
+" Address Id"+this.getAddress().getAddId() + "  address street : "+this.getAddress().getStreetName()
+" address distri : "+this.getAddress().getDistName();
return re;
}
}