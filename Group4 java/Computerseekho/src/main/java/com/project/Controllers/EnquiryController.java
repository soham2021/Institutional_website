package com.project.Controllers;


import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Entities.Enquiry;
import com.project.Services.EnquiryService;


@RestController  
@CrossOrigin(origins="*")
public class EnquiryController {

	@Autowired
	EnquiryService manager;
	
	
	@GetMapping(value = "api/Enquiries")
	public List<Enquiry> showEnquiries()
	{
		return manager.getEnquiries();
	}
	
	
	
	@GetMapping(value = "api/EnquiriesById/{pid}")
	 public Optional<Enquiry> getEnquiry(@PathVariable int pid)
	 {
		Optional<Enquiry> p=manager.getEnquiry(pid);
		return p;
	 }
	
	@DeleteMapping(value = "api/Enquiries/{pid}")
	 public void removeEnquiry(@PathVariable int pid)
	 {
		manager.delete(pid);
	 }
	
	@PutMapping(value = "api/Enquiries/{pid}")
	 public void updateEnquiry(@RequestBody Enquiry Enquiry,@PathVariable int pid)
	 {
	
		manager.update(Enquiry,pid);
	 }
	
	@PostMapping(value = "api/Enquiries")
	 public void addEnquiry(@RequestBody Enquiry Enquiry)
	 {
		
		manager.addEnquiry(Enquiry);
	 }
	
	//search
	
		@GetMapping("api/Enquiries/{keyword}")
	    public List<Enquiry> searchUsers(@PathVariable String keyword) {
	        return manager.searchUsers(keyword);
		
		}
}
