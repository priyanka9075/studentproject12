package com.Warstreet.Student.Controller;

import java.util.List;
import java.util.Optional;

import org.apache.tomcat.util.descriptor.web.ContextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.Warstreet.Student.Entity.Student;
import com.Warstreet.Student.Service.StudentService;

@RestController
public class StudentController{
	
@Autowired
StudentService studentService;

@PostMapping("/student")
public Student createStudent(@RequestBody Student student) 
{

System.out.println("Inside Controller..");
return studentService.createStudent(student);


}

@PutMapping("/student")
public Student updatStudent(@RequestBody Student student,@RequestParam Long Id)
{
  return studentService.updateStudent(student,Id);
}

 @GetMapping("/student/{Id}")
 public Optional<Student> findStudentById(@PathVariable Long Id)
 { 
  return studentService.findStudentById(Id);
 }

 @DeleteMapping("/student/{Id}")
public String deleteStudent(@PathVariable("Id") Long Id)
{ 
studentService.deleteStudent(Id);
return "deleted successfully";

}

}

