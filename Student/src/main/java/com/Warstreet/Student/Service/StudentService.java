package com.Warstreet.Student.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Warstreet.Student.Dao.StudentRepository;
import com.Warstreet.Student.Entity.Student;

@Service
public class StudentService{
	

@Autowired
StudentRepository studentRepository;

public Student createStudent(Student student)
{
	  
	  return studentRepository.save(student);
}
 

public Student updateStudent(Student student, Long Id) {
	
	Optional<Student> opSust = studentRepository.findById(Id);
	   Student sust = opSust.get();
	   
	   sust.setName(student.getName());
	   sust.setRole(student.getRole());
	   sust.setDescription(student.getDescription());
	   
	return studentRepository.save(sust);
	}

	public void deleteStudent(Long Id)
	{ 
		studentRepository.deleteById(Id);
		
	}





public Optional<Student> findStudentById(Long Id) {
	
	return studentRepository.findById(Id);
}



}




