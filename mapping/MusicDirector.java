package com.java.jpaproject2.mapping;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Root")
public class MusicDirector 
{
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private String name;
	private int Age;
	private String firstmovie;
	private int releaseyear;
	@OneToOne(targetEntity=MovieDetails.class)
	private MovieDetails mname;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getFirstmovie() {
		return firstmovie;
	}
	public void setFirstmovie(String firstmovie) {
		this.firstmovie = firstmovie;
	}
	public int getReleaseyear() {
		return releaseyear;
	}
	public void setReleaseyear(int releaseyear) {
		this.releaseyear = releaseyear;
	}
	public MovieDetails getMname() {
		return mname;
	}
	public void setMname(MovieDetails mname) {
		this.mname = mname;
	}
	
	
	}
	
	
	

