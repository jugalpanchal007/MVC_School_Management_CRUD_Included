package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
@AllArgsConstructor
public class Teacher {

	public Teacher() {
		// default constructor //it is compulsory
	}
	private int teacherID;
	private String teacherName;
	private String teacherMob;
	
}
