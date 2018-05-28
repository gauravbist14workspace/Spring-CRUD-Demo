package com.naruto.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id 
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id1;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="age")
	private int age;
	
	public Student() {
		
	}

	public Student(int id, String firstname, String lastname, int age) {
		super();
		this.id1 = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}

	public int getId() {
		return id1;
	}

	public void setId(int id) {
		this.id1 = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id1 + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	}
	
	
}
