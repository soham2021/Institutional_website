package com.project.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.Entities.Student;

public interface StudentRepository extends JpaRepository< Student, Integer > {
	

	@Query("select s from Student s where s.batchid=:batchid" )
	List<Student> findByBatchId(@Param("batchid")int batchid);
}
