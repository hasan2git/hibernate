package com.javasetup.tutorials.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StudentName {
@Column(name="first_name")	
private String fname;
@Column(name="last_name")	
private String lname;
@Column(name="sur_name")	
private String sname;
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
@Override
public String toString() {
	return "StudentName [fname=" + fname + ", lname=" + lname + ", sname=" + sname + "]";
}
}
