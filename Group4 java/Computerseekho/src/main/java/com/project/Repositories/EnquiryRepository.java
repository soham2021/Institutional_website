package com.project.Repositories;


import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.Entities.Enquiry;

@Repository
@Transactional
public interface EnquiryRepository extends JpaRepository<Enquiry,Integer> {
	
	
	@Modifying
	@Query("update Enquiry e set e.enquirerName=:enquirerName, "
			+ "e.studentName=:studentName,e.courseId=:courseId,"
			+ " e.date=:date,  e.mobile=:mobile,"
			+ " e.emailId=:emailId, e.queries=:queries where e.enquiryId = :id")
	void update(@Param("enquirerName") String enquirerName,@Param("studentName")String studentName,
			@Param("courseId") int courseId, @Param("date") LocalDate date, 
			@Param("mobile") long mobile, @Param("emailId") String emailId, @Param("queries") String queries,
			@Param("id")int id);
	
	//search 

		@Query("from Enquiry e where e.studentName like %:keyword%")
		List<Enquiry> searchUsers(@Param("keyword") String keyword);
	

}
