package com.project.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Entities.Student;
import com.project.ServiceImpls.StudentServiceImpl;

@RestController
@CrossOrigin(origins="*")
public class StudentController {
	@Autowired
	private StudentServiceImpl service;
	
	@PostMapping("/api/addStudent")
	public void saveStudent(@RequestBody Student ref)
	{
		service.save(ref);
	}
     
	@GetMapping("/api/Student")
	public List<Student> getAllStudent()
	{
		return service.getAll();
	}
	 @GetMapping(value = "api/StudentById/{pid}")
	 public List<Student> getStudent(@PathVariable int pid)
	 {
		List<Student> p=service.getStudent(pid);
		return p;
	 }
	 @DeleteMapping(value = "api/StudentById/{pid}")
	 public void removeStudent(@PathVariable int pid)
	 {
		service.delete(pid);
	 }
		 

}
