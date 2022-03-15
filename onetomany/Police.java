package com.hiberproject.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Police")
public class Police {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String Pname;
	private String Area;
	
//	@OneToMany(cascade =CascadeType.ALL)
//	@JoinColumn(name ="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public Police() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Police(int id, String pname, String area) {
		super();
		this.id = id;
		this.Pname = pname;
		this.Area = area;
	}
	public void setC_no(Object q) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
