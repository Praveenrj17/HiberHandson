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
@Data
@AllArgsConstructor
@NoArgsConstructor
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
}
