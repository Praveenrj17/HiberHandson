package com.java.jpaproject.HP_project;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="EmployeeDetails")

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="Emp_ID")
	private int Emp_ID;
	@Column(name="Employee_name")
	private String Employee_name;
	@Column (name="Employee_mailid")
	private String Employee_mailid;
	@Column (name="Emoployee_salary")
	private int Employee_salary;
	public Employee(){	
	}
	public Employee(String Employee_name,String Employee_mailid,int Employee_salary) {
	super();
	this.Employee_name = Employee_name;
	this.Employee_mailid = Employee_mailid;
	this.Employee_salary = Employee_salary;
	}
	public int getEmp_ID() {
		return Emp_ID;
	}

	public void setEmp_ID(int Emp_ID) {
		this.Emp_ID = Emp_ID;
	}

	public String getEmployee_name() {
		return Employee_name;
	}

	public void setEmployee_name(String Employee_name) {
		this.Employee_name = Employee_name;
	}


	public String getEmployee_mailid() {
		return Employee_mailid;
	}

	public void setEmployee_mailid(String Employee_mailid) {
		this.Employee_mailid = Employee_mailid;
	}
	public int getEmployee_salary() {
		return Employee_salary;
	}
	public void setEmployee_salary(int Employee_salary) {
		this.Employee_salary = Employee_salary;
	}	
}




