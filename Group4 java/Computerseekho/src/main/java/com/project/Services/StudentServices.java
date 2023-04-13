package com.project.Services;

import java.util.List;

import java.util.Optional;

import com.project.Entities.Student;

public interface StudentServices {

	void save(Student student);
	List<Student> getAll();
	void delete(int pid);
	List<Student> getStudent(int  pid);
}
