package com.hiberproject2.onetomany2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Manage")
public class Management {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int m_id;
	private String university;
	private String collegename;
	private int pincode;	
}
