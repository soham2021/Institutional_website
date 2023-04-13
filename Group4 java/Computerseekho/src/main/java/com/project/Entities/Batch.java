package com.project.Entities;
import java.time.LocalDate;

import java.util.Set;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
public class Batch {

	private int batchId;
	
	private String batchName;
		private LocalDate startDate;
	
	private LocalDate endDate;
	
	private LocalDate finalpresentationDate;
		private int totalHours;
		private int batchFee;
	
	private String isBatchActive;
	
	private int courseBatchId;
    private Set<Student> students;
    public Batch()
    {
    	
    }
	@JsonCreator
	public Batch(@JsonProperty("batchId")int batchId, @JsonProperty("batchName") String batchName,@JsonProperty("startDate")  LocalDate startDate,@JsonProperty("endDate") LocalDate endDate,
			@JsonProperty("finalpresentationDate")LocalDate finalpresentationDate,@JsonProperty("totalHours") int totalHours,@JsonProperty("batchFee") int batchFee,@JsonProperty("isBatchActive") String isBatchActive,
			@JsonProperty("students")	Set<Student> students,@JsonProperty("courseBatchId")int courseBatchId	) {
		
		this.batchId =  batchId;
		this.batchName = batchName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.finalpresentationDate = finalpresentationDate;
		this.totalHours = totalHours;
		this.batchFee = batchFee;
		this.isBatchActive = isBatchActive;
		this.students = students;
		this.courseBatchId = courseBatchId;

		//this.batchCourseId=batchCourseId;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "batchId")

	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public LocalDate getFinalpresentationDate() {
		return finalpresentationDate;
	}
	public void setFinalpresentationDate(LocalDate finalpresentationDate) {
		this.finalpresentationDate = finalpresentationDate;
	}
	public int getTotalHours() {
		return totalHours;
	}
	public void setTotalHours(int totalHours) {
		this.totalHours = totalHours;
	}
	public int getbatchFee() {
		return batchFee;
	}
	public void setbatchFee(int batchFee) {
		this.batchFee = batchFee;
	}
	public String getIsBatchActive() {
		return isBatchActive;
	}
	public void setIsBatchActive(String isBatchActive) {
		this.isBatchActive = isBatchActive;
	}
	 @OneToMany(cascade = CascadeType.ALL)
	    @JoinColumn(name = "batchid", referencedColumnName="batchId")


	public Set<Student> getStudents() {
		return students;
	}




	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	public int getCourseBatchId() {
		return courseBatchId;
	}

	public void setCourseBatchId(int courseBatchId) {
		this.courseBatchId = courseBatchId;
	}


}
