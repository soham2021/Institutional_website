package com.project.ServiceImpls;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entities.CourseEligibility;
import com.project.Repositories.CourseEligibilityRepository;
import com.project.Services.CourseEligibilityServices;


@Service
public class CourseEligibilityServicesImpl implements CourseEligibilityServices {

	@Autowired
	CourseEligibilityRepository repository;

	@Override
	public void addCourseEligibility(CourseEligibility courseeligibility) {
		// TODO Auto-generated method stub
		repository.save(courseeligibility);
		
	}

	

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void update(CourseEligibility courseEligibility, int id) {
		// TODO Auto-generated method stub
		repository.update(courseEligibility.getQualification(), courseEligibility.getPercentage(), courseEligibility.getAge(), id);
		
	}



	@Override
	public Optional<CourseEligibility> getCourseEligibility(int id) {
		// TODO Auto-generated method stub
		return  repository.findById(id)	;
		}

	
}
