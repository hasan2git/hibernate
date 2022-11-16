package com.javasetup.tutorials.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="student_details")
public class Student {
@Id	
private int id;
private StudentName name;
@Column(name="dress_color")
private String dressColor;
@Transient
private int age;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public StudentName getName() {
	return name;
}
public void setName(StudentName name) {
	this.name = name;
}
public String getDressColor() {
	return dressColor;
}
public void setDressColor(String dressColor) {
	this.dressColor = dressColor;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", dressColor=" + dressColor + ", age=" + age + "]";
}

}
