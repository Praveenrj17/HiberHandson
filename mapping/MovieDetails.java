package com.java.jpaproject2.mapping;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Movie")
public class MovieDetails 
{
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@PrimaryKeyJoinColumn
    private int releaseyear;
    private String mname;
	private int budget;
	@OneToOne(targetEntity=MusicDirector.class,cascade = CascadeType.ALL)
	
	private MusicDirector name;
	
	public MusicDirector getName() {
		return name;
	}
	public void setName(MusicDirector name) {
		this.name = name;
	}
	public int getReleaseyear() {
		return releaseyear;
	}
	public void setReleaseyear(int releaseyear) {
		this.releaseyear = releaseyear;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	
}
