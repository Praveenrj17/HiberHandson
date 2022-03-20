package com.hiberproject2.onetomany2;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name="Course")
public class Courses {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int s_no;
	private String course_name;
	private String duration;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="s_no")
	private List<Management> managements;
	public int getS_no() {
		return s_no;
	}
	public void setS_no(int s_no) {
		this.s_no = s_no;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	
	public List<Management> getManagements() {
		return managements;
	}
	public void setManagements(List<Management> managements) {
		this.managements = managements;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
}
