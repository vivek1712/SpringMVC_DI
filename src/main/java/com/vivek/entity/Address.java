package com.vivek.entity;

public class Address {
private Long addId;
private String streetName;
private String distName;
public Long getAddId() {
	return addId;
}
public void setAddId(Long addId) {
	this.addId = addId;
}
public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public String getDistName() {
	return distName;
}
public void setDistName(String distName) {
	this.distName = distName;
}

public String toString(Address add){
	String re="Address ID : "+add.getAddId()+" Street Name : "+add.getStreetName()+" District name : "+add.getDistName();
	return re;
}
}
