package com.project.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CourseEligibility {

	private int courseEligibilityId;
	private String qualification;
	private double percentage;
	private int age;
	private String courseName;
	private int courseId;
	
	
	public CourseEligibility(int courseEligibilityId, String qualification, double percentage, int age,String courseName,int courseId)
	{
		super();
		this.courseEligibilityId = courseEligibilityId;
		this.qualification = qualification;
		this.percentage = percentage;
		this.age = age;
		this.courseId=courseId;
		this.courseName=courseName;
	}
	
	public CourseEligibility()
	{
		
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getCourseEligibilityId() {
		return courseEligibilityId;
	}

	public void setCourseEligibilityId(int courseEligibilityId) {
		this.courseEligibilityId = courseEligibilityId;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "CourseEligibility [courseEligibilityId=" + courseEligibilityId + ", qualification=" + qualification
				+ ", percentage=" + percentage + ", age=" + age + ", courseName=" + courseName + ", courseId="
				+ courseId + "]";
	}

	
	
//	@OneToOne(cascade=CascadeType.ALL)
//	public int getCourseId() {
//		return courseId;
//	}
//
//	public void setCourseId(int courseId) {
//		this.courseId = courseId;
//	}

	
//	public Course getCourse() {
//		return course;
//	}
//
//	public void setCourse(Course course) {
//		this.course = course;
//	}

	
	
	
	
	
}
