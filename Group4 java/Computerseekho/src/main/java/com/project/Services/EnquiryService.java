package com.project.Services;

import java.util.List;

import java.util.Optional;

import com.project.Entities.Enquiry;



public interface EnquiryService{

	void addEnquiry(Enquiry p);
	List<Enquiry> getEnquiries();
	Optional<Enquiry> getEnquiry(int id);
	void delete(int pid);
	void update(Enquiry enquiry, int id);
	List<Enquiry> searchUsers(String keyword);
	

}
