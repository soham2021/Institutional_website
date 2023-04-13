package com.project.Repositories;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.Entities.Staff;

@Repository
@Transactional
public interface StaffRepository extends JpaRepository<Staff,Integer>{

	@Modifying
	@Query("update Staff s set s.staffName=:staffName, "
			+"s.qualification=:qualification ,"
			+"s.experience=:experience,"
			+"s.mobile=:mobile,"
			+"s.staffImage=:staffImage where s.staffId = :id")
	void update(@Param("staffName") String staffName,@Param("qualification")String qualification,
			@Param("experience") String experience, @Param("mobile") long mobile, @Param("staffImage") String staffImage,
			@Param("id")int id);

	
	
	

}
