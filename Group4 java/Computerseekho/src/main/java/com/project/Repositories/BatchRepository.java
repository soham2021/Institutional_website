package com.project.Repositories;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.Entities.Batch;


public interface BatchRepository extends JpaRepository< Batch, Integer > {
	 
//	    @Query("select b.batchName from Batch b join Course c on b.courseBatchId=c.courseId where b.batchId=:id")
//	   List<Batch> findById(@Param("id") int courseBatchId);
	}



