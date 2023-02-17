package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//original code
@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
	
	@GetMapping({"","/"})
	public ArrayList<Student> getAllStudents()
	{
		ArrayList<Student> students = new ArrayList<>();
		Student s = new Student();
		s.setStudentId(1);
		s.setStudentName("JP");
		s.setStudentMob("7824080850");

		students.add(s);
		
		return students;
			
	}
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable int id)
	{
		
		Student s = new Student(id,"Student-"+id,"Smob"+id);
		return s;
	}

	@PostMapping(value = {"","/{id}"})
	public Student saveStudent(@RequestBody Student s)
	{
	 s.setStudentName(s.getStudentName()+"saved");   //**
	 s.setStudentMob(s.getStudentMob()+"saved"); //here we can see that only mobile.no is saved...also we can save name of teacher
	 return s;
	}
	//@putmapping
	//@deletemapping
	
	
	@DeleteMapping(value = {"","{id}"})
	public Student delTeacher(@RequestBody Student s)
	{

		System.out.print("del");
		return s;
	 }

}

/*@RestController
@RequestMapping("/api/students")
public class StudentController {

    private List<Student> students = new ArrayList<>();

    @GetMapping({" ","/"})
    public ArrayList<Student> getAllStudents() {
    	ArrayList<Student> students = new ArrayList<>();
		Student s = new Student();
		s.setId(1);
		s.setName("JP");
		s.setEmail("jugalpanchal@gmail.com");

		students.add(s);
        return students;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return students.stream().filter(student -> student.getId() == id)
            .findFirst().orElse(null);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.set(i, student);
                return student;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        students.removeIf(student -> student.getId() == id);
    }
}*/




	
