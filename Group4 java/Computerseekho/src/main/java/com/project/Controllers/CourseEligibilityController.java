package com.project.Controllers;

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

import com.project.Entities.CourseEligibility;
import com.project.Services.CourseEligibilityServices;




@RestController  
@CrossOrigin("http://localhost:3000")
public class CourseEligibilityController {

	@Autowired
	CourseEligibilityServices services;
	
	@DeleteMapping(value = "api/CourseEligibilityById/{cid}")
	 public void removeCourse(@PathVariable int cid)
	 {
		services.delete(cid);
	 }
	
	 @PutMapping(value = "api/CourseEligibilityById/{cid}")
	 public void updateCourseEligibility(@RequestBody CourseEligibility courseeligibility,@PathVariable int cid)
	 {
	
		services.update(courseeligibility,cid);
	 }
	 
	 @PostMapping(value = "api/CourseEligibility")
	 public void addCourse(@RequestBody CourseEligibility courseeligibility)
	 {
		System.out.println(courseeligibility);
		services.addCourseEligibility(courseeligibility);
	 }
	 
	 @GetMapping(value = "api/CourseEligibilityById/{cid}")
	 public Optional<CourseEligibility> getCourse(@PathVariable int cid)
	 {
		 return services.getCourseEligibility(cid);
	 }
}

