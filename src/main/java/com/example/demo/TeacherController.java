// ** means it try by my self
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
@RequestMapping ("/api/v1/teachers")				//This is main URL after add this URL you can show all data
public class TeacherController 
{
 @GetMapping(value = {"","/"})    					// this is work after hit URL(/api/v1/teachers) EX=/api/v1/teachers+/
 public ArrayList<Teacher> getAllTeachers()
 {
	 ArrayList<Teacher> teachers = new ArrayList(); //We created Arraylist To show Data In array FOrmat
	 Teacher t = new Teacher(); 					//for set teacher details we create t name object of Teacher
	 t.setTeacherID(1); 							//now in the object we save the id of teacher
	 t.setTeacherMob("7888877777");					//now in the object we save the mobile of teacher
	 t.setTeacherName("jugal");						//now in the object we save the name of teacher
	 teachers.add(t);								//add whole data in teacher
	 
	 return teachers;								//and we return whole teacher class.
 }
 
 @GetMapping("/{id}")							   // it is for when we have to ad id in web URL..our data change according this id
 public Teacher getTeacher(@PathVariable int id)   // @pathvariable is justlike run time output usage
 
 	{
	 Teacher t = new Teacher(id,"Teacher-"+id,"Tmob"+id); //Add all arg constuctor for this
	 return t;
 	}
 
 
 @PostMapping(value = {"","/{id}"})					//now its your for our data pass on to the postman   **
 public Teacher saveTeacher(@RequestBody Teacher t)
 	{	
	 t.setTeacherName(t.getTeacherName()+"saved");   //**
	 t.setTeacherMob(t.getTeacherMob()+"saved"); //here we can see that only mobile.no is saved...also we can save name of teacher
	 System.out.println(t);
	 return t; 
	 
 	}
 
 
@DeleteMapping(value = {"","{id}"})

public Teacher delTeacher(@RequestBody Teacher t)
{

	System.out.print("del");
	return t;
 }
}

 

