package com.java.jpaproject1.hibernate_atm;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="CustomerDetails")

public class Details {
	@Id
	@Column(name="Customer_name")
	private String customer_name;
	@Column(name="Account_number")
	private int acc_number;
	@Column (name="Age")
	private int age;
	@Column (name="Phone_number")
	private int phone_number;
	@Column(name="Branch")
	private String branch;
	public Details() {
	}
	public Details(String customer_name, int acc_number, int age, int phone_number, String branch) {
		super();
		this.customer_name = customer_name;
		this.acc_number = acc_number;
		this.age = age;
		this.phone_number = phone_number;
		this.branch = branch;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public int getAcc_number() {
		return acc_number;
	}
	public void setAcc_number(int acc_number) {
		this.acc_number = acc_number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
}
