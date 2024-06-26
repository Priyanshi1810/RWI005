package com.becoder.FirstApp;

import java.beans.Transient;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="priyanshi_address")
public class Address {
	 @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int Id;
	    private String name;
		public Address(int id, String name) {
			super();
			Id = id;
			this.name = name;
		}
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Address() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Student [Id=" + Id + ", name=" + name + "]";
		}
}
