package com.project.Controllers;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Entities.Course;
import com.project.ServiceImpls.CourseServiceImpl;


@RestController
@CrossOrigin(origins="*")
public class CourseContoller {
	@Autowired
	private CourseServiceImpl service;
	
		@PostMapping(value = "api/addCourse")
	 public void saveCourse(@RequestBody Course ref)
	 {
		
		service.save(ref);
	 }

	
	@GetMapping("/api/Course")
	public List<Course> getAllCourse()
	{
		return service.getAll();
	}
	@GetMapping(value = "api/CourseById/{pid}")
	 public Optional<Course> getCourse(@PathVariable int pid)
	 {
		Optional<Course> p=service.getCourse(pid);
		return p;
	 }
}
