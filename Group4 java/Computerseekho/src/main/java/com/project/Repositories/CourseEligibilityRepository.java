package com.project.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.Entities.CourseEligibility;

@Repository
@Transactional
public interface CourseEligibilityRepository extends JpaRepository<CourseEligibility,Integer> {

	@Modifying
	@Query("update CourseEligibility c set c.qualification=:qualification, c.percentage=:percentage,c.age=:age where c.courseEligibilityId = :id")
	void update(@Param("qualification") String qualification,@Param("percentage")double percentage,@Param("age") int age, @Param("id")int id);
	

}

