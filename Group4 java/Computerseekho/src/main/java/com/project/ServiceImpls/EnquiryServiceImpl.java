/**
 * 
 */
package com.project.ServiceImpls;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entities.Enquiry;
import com.project.Repositories.EnquiryRepository;
import com.project.Services.EnquiryService;

@Service
public class EnquiryServiceImpl implements EnquiryService{

	@Autowired
	EnquiryRepository repository;
	
	@Override
	public void addEnquiry(Enquiry p) {
		// TODO Auto-generated method stub
		repository.save(p);
		
	}

	@Override
	public List<Enquiry> getEnquiries() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Enquiry> getEnquiry(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void update(Enquiry Enquiry, int EnquiryId) {
		// TODO Auto-generated method stub
		repository.update(Enquiry.getEnquirerName(),Enquiry.getStudentName(),
				Enquiry.getCourseId(),Enquiry.getDate()
				,Enquiry.getMobile(),Enquiry.getEmailId(),Enquiry.getQueries(),EnquiryId);
	}

	//search
		public List<Enquiry> searchUsers(String keyword) {
	        return repository.searchUsers(keyword);
	    }
}
