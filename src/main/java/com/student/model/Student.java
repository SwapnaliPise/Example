package com.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {

	@Id
	private int id;
	@Column
	private String name;
	@Column
	private String gender;
	@Column
	private int age;
	@Column
	private String subjectTaken;
	
	public Student() {
		super();
	}

	public Student(int id, String name, String gender, int age, String subjectTaken) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.subjectTaken = subjectTaken;
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSubjectTaken() {
		return subjectTaken;
	}

	public void setSubjectTaken(String subjectTaken) {
		this.subjectTaken = subjectTaken;
	}
}
