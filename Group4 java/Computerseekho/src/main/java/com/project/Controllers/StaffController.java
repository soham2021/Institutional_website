package com.project.Controllers;

import java.util.List;

import java.util.Optional;
import com.project.Entities.Staff;
import com.project.Services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController  
@CrossOrigin(origins="*")
public class StaffController {

	@Autowired
	StaffService manager;
	
	@GetMapping(value = "api/Staffs")
	public List<Staff> showStaffs()
	{
		return manager.getStaffs();
	}
	
	@GetMapping(value = "api/StaffsById/{pid}")
	 public Optional<Staff> getStaff(@PathVariable int pid)
	 {
		Optional<Staff> p=manager.getStaff(pid);
		return p;
	 }
	
	
	@DeleteMapping(value = "api/Staffs/{pid}")
	 public void removeStaff(@PathVariable int pid)
	 {
		manager.delete(pid);
	 }
	
	@PutMapping(value = "api/Staffs/{pid}")
	 public void updateStaff(@RequestBody Staff Staff,@PathVariable int pid)
	 {
	
		manager.update(Staff,pid);
	 }
	
	@PostMapping(value = "api/Staffs")
	 public void addStaff(@RequestBody Staff Staff)
	 {
		
		manager.addStaff(Staff);
	 }
	
}
