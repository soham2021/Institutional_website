package com.project.ServiceImpls;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.project.Entities.Course;
import com.project.Repositories.CourseRepository;
import com.project.Services.CourseServices;
@Service
public class CourseServiceImpl implements CourseServices{
	@Autowired
	private CourseRepository s_repository;
	@Override
	public void save(Course ref) {
		s_repository.save(ref);	
	}

	@Override
	public List<Course> getAll() {
		return s_repository.findAll();
	}

	public Optional<Course> getCourse(int pid) {
		return s_repository.findById(pid);
	}

}
