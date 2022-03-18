package com.hiberproject.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Details")
public class Details {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
     private int c_no;
	private String Crime_year;
	private String A_name ;
	private String C_name;

	
	@OneToMany(cascade =CascadeType.ALL)
	@JoinColumn(name ="Pname")
	private List<Police> Details;


	public int getC_no() {
		return c_no;
	}


	public void setC_no(int c_no) {
		this.c_no = c_no;
	}


	public String getCrime_year() {
		return Crime_year;
	}


	public void setCrime_year(String crime_year) {
		Crime_year = crime_year;
	}


	public String getA_name() {
		return A_name;
	}


	public void setA_name(String a_name) {
		A_name = a_name;
	}


	public List<Police> getDetails() {
		return Details;
	}


	public void setDetails(List<Police> details) {
		Details = details;
	}


	public String getC_name() {
		return C_name;
	}


	public void setC_name(String c_name) {
		C_name = c_name;
	}


	
		
	}
	
	
	
	
	
