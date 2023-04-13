package com.project.Entities;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Staff {

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private int staffId;
	private String staffName;
	private String qualification;
	private String experience;
	private long mobile;
	private String staffImage;
	private Set<Enquiry> StaffEnquiries;
	/**
	 * @return the staffId
	 */
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STAFF_ID")
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
	 * @return the staffName
	 */
	public String getStaffName() {
		return staffName;
	}
	/**
	 * @param staffName the staffName to set
	 */
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}
	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	/**
	 * @return the experience
	 */
	public String getExperience() {
		return experience;
	}
	/**
	 * @param experience the experience to set
	 */
	public void setExperience(String experience) {
		this.experience = experience;
	}
	/**
	 * @return the mobile
	 */
	public long getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the staffImage
	 */
	public String getStaffImage() {
		return staffImage;
	}
	/**
	 * @param staffImage the staffImage to set
	 */
	public void setStaffImage(String staffImage) {
		this.staffImage = staffImage;
	}
	/**
	 * @param staffId
	 * @param staffName
	 * @param qualification
	 * @param experience
	 * @param mobile
	 * @param staffImage
	 */
	public Staff(int staffId, String staffName, String qualification, String experience, long mobile,
			String staffImage,Set<Enquiry> StaffEnquiries) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.qualification = qualification;
		this.experience = experience;
		this.mobile = mobile;
		this.staffImage = staffImage;
	    this.StaffEnquiries = StaffEnquiries;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffName=" + staffName + ", qualification=" + qualification
				+ ", experience=" + experience + ", mobile=" + mobile + ", staffImage=" + staffImage + "]";
	}
	
	

@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name = "staffId", referencedColumnName="STAFF_ID")
public Set<Enquiry> getStaffEnquiries() {
return this.StaffEnquiries;
}
public void setStaffEnquiries(Set<Enquiry> StaffEnquiries) {
this.StaffEnquiries = StaffEnquiries;
}
}

	

