package com.javasetup.tutorials.hibernate.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {
    @Id
	private int id;
	private String name;
	@OneToMany(fetch=FetchType.EAGER,mappedBy="emp")
	private List<Course> courses=new ArrayList<Course>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", courses=" + courses + "]";
	}
}
