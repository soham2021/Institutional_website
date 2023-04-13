package com.project.Entities;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentId")
    private int studentId;
    
    @Column(name = "sName")
    private String studentName;
    
    @Column(name = "DOB")
    private LocalDate dateOfBirth;
    
    @Column(name = "gender")
    private String gender;
    
    @Column(name = "resAdd")
    private String resAddress;
    
    @Column(name = "mobile")
    private long mobile;
    
    @Column(name = "e_Id")
    private String emailId;
    
    @Column(name = "quali")
    private String qualification;
    
    @Column(name = "sImage")
    private String studentImage;
    private int batchid;
//    private List<Payment> payments;
  //  private int courseStudentId;
    
    public Student() {
    	
    }
    
    @JsonCreator
    public Student(@JsonProperty("studentName") String studentName,
            @JsonProperty("dateOfBirth")LocalDate  dateOfBirth, @JsonProperty("gender") String gender,
            @JsonProperty("resAddress") String resAddress, @JsonProperty("mobile") long mobile,
            @JsonProperty("emailId") String emailId, @JsonProperty("qualification") String qualification,
            @JsonProperty("studentImage") String studentImage,@JsonProperty("batchid")int batchid/*,@JsonProperty("courseStudentId")int courseStudentId,@JsonProperty("payments")List<Payment> payments*/)  {
        this.studentName = studentName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.resAddress = resAddress;
        this.mobile = mobile;
        this.emailId = emailId;
        this.qualification = qualification;
        this.studentImage = studentImage;
        this.batchid=batchid;
//        this.payments=payments;
       // this.courseStudentId=courseStudentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getResAddress() {
        return resAddress;
    }

    public void setResAddress(String resAddress) {
        this.resAddress = resAddress;
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

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getStudentImage() {
        return studentImage;
    }

    public void setStudentImage(String studentImage) {
        this.studentImage = studentImage;
    }
    public int getBatchId() {
        return batchid;
    }

    public void setBatchId(int batchid) {
        this.batchid = batchid;
    }

    
//	public List<Payment> getPayments() {
//		return payments;
//	}
//
//	@ElementCollection
//	@OneToMany(cascade = CascadeType.ALL)
//	 @JoinColumn(name = "studentPaymentId", referencedColumnName="studentId")
//	public void setPayments(List<Payment> payments) {
//		this.payments = payments;
//	}
//    
    
//    public int getCourseStudentId() {
//        return courseStudentId;
//    }
//
//    public void setCourseStudentId(int courseStudentId) {
//        this.courseStudentId = courseStudentId;
//    }
}
