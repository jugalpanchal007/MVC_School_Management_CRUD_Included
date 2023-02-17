package com.example.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//original code
@Getter
@Setter
@Data
@AllArgsConstructor
public class Student {
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int studentId;
	public String studentName;
	public String studentMob;

}



/*@Getter
@Setter
@Data
@AllArgsConstructor
@Entity
public class Student {

   
	public Student() {
		// TODO Auto-generated constructor stub
	}
	private int id;
    private String name;
    private String email;

    // getters, setters and constructors
}*/



