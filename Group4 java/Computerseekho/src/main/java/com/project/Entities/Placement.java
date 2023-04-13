package com.project.Entities;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Placement {
	
 public Placement(){
	 super();
 }
 
 private String courseName;
 private String batchName;
 private String studentName;
 private String companyName;
 private String studentImage;
 private int placementId;
 private List<Student> studs=new ArrayList<Student>();
 

public Placement(String courseName, String batchName, String studentName, String companyName,
		String studentImage, List<Student> studs) {
	super();
	this.courseName = courseName;
	this.batchName = batchName;
	this.studentName = studentName;
	this.companyName = companyName;
	this.studentImage = studentImage;
	this.studs=studs;
}

 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
public int getPlacementId() {
	return placementId;
}
public void setPlacementId(int placementId) {
	this.placementId = placementId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public String getBatchName() {

	return batchName;
}
public void setBatchName(String batchName) {
	this.batchName = batchName;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getStudentImage() {
	return studentImage;
}
public void setStudentImage(String studentImage) {
	this.studentImage = studentImage;
}

@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name = "placementstudentId", referencedColumnName="placementId")
public List<Student> getStuds() 
{
	return studs;
}

public void setStuds(List<Student> studs) {
	this.studs = studs;
}

@Override
public String toString() {
	return "Placement [CourseName=" + courseName  + ", BatchName=" + batchName
			+ ", StudentName=" + studentName + ", CompanyName=" + companyName + ", studentImage=" + studentImage +"]";
}
}
