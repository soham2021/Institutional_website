package com.project.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.Entities.Placement;
@Repository
@Transactional
public interface PlacementRepository extends JpaRepository<Placement,Integer>  {
//	@Modifying
//	@Query("update Placement p set p.courseName = :courseName, p.batchName=:batchName,p.studentName = :studentName, p.companyName=:companyName, p.studentImage=:studentImage where p.studentId = :studentId")
//	void update(@Param("courseName") String courseName,@Param("batchName")String batchName,@Param("studentName") String studentName,@Param("companyName") String companyName ,@Param("studentImage") String studentImage ,@Param("studentId")int studentId);
//	
}
