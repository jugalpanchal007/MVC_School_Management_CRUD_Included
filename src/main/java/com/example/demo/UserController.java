package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/v1/users")				//This is main URL after add this URL you can show all data
public class UserController 
{
 @GetMapping(value = {"","/"})    					// this is work after hit URL(/api/v1/teachers) EX=/api/v1/teachers+/
 public ArrayList<User> getAllUsers()
 {
	 ArrayList<User> users = new ArrayList(); //We created Arraylist To show Data In array FOrmat
	 User u = new User();
	 u.setId(1);                                //for set teacher details we create t name object of Teacher
	 u.setUserName("jugal"); 							//now in the object we save the id of teacher
	 u.setPhone("7888877777");					//now in the object we save the mobile of teacher
	 u.setEmail("jugalpanchal70@gmail.com");						//now in the object we save the name of teacher
	 users.add(u);								//add whole data in teacher
	 
	 return users;								//and we return whole teacher class.
 }
 
 @GetMapping("/{id}")							   // it is for when we have to ad id in web URL..our data change according this id
 public User getUser(@PathVariable int id)        // @pathvariable is justlike run time output usage
 
 	{
	 User u = new User(id,"User-"+id,"Umob"+id, "Umail-"+id); //Add all arg constuctor for this
	 return u;
 	}
 
 @PostMapping(value = {"","/{id}"})					//now its your for our data pass on to the postman   **
 public User saveUser(@RequestBody User u)
 	{	
	 u.setUserName(u.getUserName()+"saved");   //**
	 u.setPhone(u.getPhone()+"saved");         //here we can see that only mobile.no is saved...also we can save name of teacher
	 System.out.println(u);
	 return u; 
	 
 	}
 
 }