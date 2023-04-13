package com.project.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Entities.Course;



public interface CourseRepository extends JpaRepository< Course, Integer > {

}
