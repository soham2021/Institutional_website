package com.project.Services;



import java.util.Optional;

import com.project.Entities.CourseEligibility;


public interface CourseEligibilityServices {

	void addCourseEligibility(CourseEligibility courseeligibility);
	Optional<CourseEligibility> getCourseEligibility(int id);
	void delete(int id);
	void update(CourseEligibility courseEligibility,int id);
	
}

