package com.becoder.FirstApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "priyanshi")
public class Student {
	@Id
	@GeneratedValue
	private int ID;
	private String name;

	private Certificate certi;

	public int getID() {
		return ID;

	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}

}
