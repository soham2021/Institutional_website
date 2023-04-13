package com.project.Services;

import java.util.List;
import java.util.Optional;

import com.project.Entities.Staff;

/**
 * @author a2z
 *
 */
public interface StaffService {


	void addStaff(Staff p);
	List<Staff> getStaffs();
	Optional<Staff> getStaff(int id);
	void delete(int pid);
	void update(Staff staff, int id);
	
	
	
}
