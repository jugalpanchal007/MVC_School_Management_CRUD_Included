package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
public class User {
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	

	private int id;
	private String userName;
	private String phone;
	private String email;
	public void remove(Integer integer) {
		// TODO Auto-generated method stub
		
	}

}
