package com.project.ServiceImpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entities.Student;
import com.project.Repositories.StudentRepository;
import com.project.Services.StudentServices;
@Service
public class StudentServiceImpl implements StudentServices{
	@Autowired
	private StudentRepository s_repository;

	@Override
	public void save(Student student) {
		
		s_repository.save(student);
	}

	@Override
	public List<Student> getAll() {
		return s_repository.findAll();
	}

	public List<Student> getStudent(int pid) {
		return s_repository.findByBatchId(pid);

	}

	public void delete(int pid) {
		// TODO Auto-generated method stub
		s_repository.deleteById(pid);
	}
	
	}


