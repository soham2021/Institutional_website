package com.project.Entities;

import java.util.*;


import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="course")
public class Course {
	private String courseName;
	
	private int courseId;
	private String courseModule;
	private Float courseFees;
	private String duration;
	private String courseIsActive;
	 private List<Batch> batches = new ArrayList<>();
	// private List<Student> students = new ArrayList<>();
	 public Course()
	 {
		 
	 }
	@JsonCreator
	public Course(@JsonProperty("courseName")String courseName,@JsonProperty("courseId") int courseId,@JsonProperty("courseModule")  String courseModule,@JsonProperty("courseFees") Float courseFees, @JsonProperty("duration") String duration,
			@JsonProperty("courseIsActive")	String courseIsActive,@JsonProperty("batches")List<Batch> batches/*,@JsonProperty("students")List<Student> students*/) {
		this.courseName = courseName;
		this.courseId = courseId;
		this.courseModule = courseModule;
		this.courseFees = courseFees;
		this.duration = duration;
		this.courseIsActive = courseIsActive;
		this.batches = batches;
		//this.students = students;
	}
		public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//5@Column(name = "course_id")
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public String getCourseModule() {
		return courseModule;
	}
	public void setCourseModule(String courseModule) {
		this.courseModule = courseModule;
	}
	
	public Float getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(Float courseFees) {
		this.courseFees = courseFees;
	}
	
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getCourseIsActive() {
		return courseIsActive;
	}
	public void setCourseIsActive(String courseIsActive) {
		this.courseIsActive = courseIsActive;
	}
	@OneToMany(cascade = CascadeType.ALL)
	 @JoinColumn(name = "courseBatchId", referencedColumnName="courseId")
	public List<Batch> getBatches() {
		return batches;
	}

	public void setBatches(List<Batch> batches) {
		this.batches = batches;
	}
	
//	@OneToMany(cascade = CascadeType.ALL)
//	 @JoinColumn(name = "courseStudentId", referencedColumnName="courseId")
//	public List<Student> getStudents() {
//		return students;
//	}
//
//	public void setStudents(List<Student> students) {
//		this.students = students;
//	}
}


