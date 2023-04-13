package com.project.Entities;


import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Enquiry {

	/**
	 * 
	 */
	public Enquiry() {
		super();
	}
	
	
	private int enquiryId;
	private String enquirerName;
	private String studentName;
	private int courseId;
	private LocalDate date;
	
	private long mobile;
	private String emailId;
	private String closureReason;
	/**
	 * @return the closureReason
	 */
	public String getClosureReason() {
		return closureReason;
	}
	/**
	 * @param closureReason the closureReason to set
	 */
	public void setClosureReason(String closureReason) {
		this.closureReason = closureReason;
	}


	private String queries;
	private int staffId;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getEnquiryId() {
		return enquiryId;
	}
	public void setEnquiryId(int enquiryId) {
		this.enquiryId = enquiryId;
	}
	public String getEnquirerName() {
		return enquirerName;
	}
	public void setEnquirerName(String enquirerName) {
		this.enquirerName = enquirerName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getQueries() {
		return queries;
	}
	public void setQueries(String queries) {
		this.queries = queries;
	}
	
	
	/**
	 * @return the staffId
	 */
	public int getStaffId() {
		return staffId;
	}
	/**
	 * @param staffId the staffId to set
	 */
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	
	
	
	/**
	 * @param enquiryId
	 * @param enquirerName
	 * @param studentName
	 * @param courseId
	 * @param date
	 * @param mobile
	 * @param emailId
	 * @param closureReason
	 * @param queries
	 * @param staffId
	 */
	public Enquiry(int enquiryId, String enquirerName, String studentName, int courseId, LocalDate date, long mobile,
			String emailId, String closureReason, String queries, int staffId) {
		super();
		this.enquiryId = enquiryId;
		this.enquirerName = enquirerName;
		this.studentName = studentName;
		this.courseId = courseId;
		this.date = date;
		this.mobile = mobile;
		this.emailId = emailId;
		this.closureReason = closureReason;
		this.queries = queries;
		this.staffId = staffId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Enquiry [enquiryId=" + enquiryId + ", enquirerName=" + enquirerName + ", studentName=" + studentName
				+ ", courseId=" + courseId + ", date=" + date + ", mobile=" + mobile + ", emailId=" + emailId
				+ ", closureReason=" + closureReason + ", queries=" + queries + ", staffId=" + staffId + "]";
	}
	
	
	
}
