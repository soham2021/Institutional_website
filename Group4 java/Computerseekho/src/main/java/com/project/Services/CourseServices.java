package com.project.Services;
import java.util.List;

import java.util.Optional;

import com.project.Entities.Course;

public interface CourseServices {
	
		void save(Course ref);
		List<Course>getAll();
		Optional<Course> getCourse(int  pid);

}
