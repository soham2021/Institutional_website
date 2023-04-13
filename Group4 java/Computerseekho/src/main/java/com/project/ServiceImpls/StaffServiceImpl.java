package com.project.ServiceImpls;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entities.Staff;
import com.project.Repositories.StaffRepository;
import com.project.Services.StaffService;

@Service
public class StaffServiceImpl implements StaffService {

	
	@Autowired
	StaffRepository repository;
		
	@Override
	public void addStaff(Staff p) {
		// TODO Auto-generated method stub
		repository.save(p);
		
	}

	@Override
	public List<Staff> getStaffs() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Staff> getStaff(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void update(Staff Staff, int StaffId) {
		// TODO Auto-generated method stub
		repository.update(Staff.getStaffName(),Staff.getQualification(),
				Staff.getExperience(),Staff.getMobile(),Staff.getStaffImage()
				,StaffId);
		
}
}


