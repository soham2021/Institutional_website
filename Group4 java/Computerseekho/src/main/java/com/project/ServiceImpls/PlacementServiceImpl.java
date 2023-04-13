package com.project.ServiceImpls;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entities.Placement;
import com.project.Repositories.PlacementRepository;
import com.project.Services.PlacementService;
@Service
public class PlacementServiceImpl implements PlacementService {
	@Autowired
	PlacementRepository repository;

	@Override
	public void addPlacement(Placement p) {
		repository.save(p);
		
		
	}

	@Override
	public List<Placement> getPlacements() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}

	//@Override
//	public void update(Placement Placement,int id) {
//		// TODO Auto-generated method stub
//		System.out.println("inside update method of service layer");
//		repository.update(Placement.getBatchName(),Placement.getStudentName(),Placement.getCompanyName(),Placement.getStudentImage(),Placement.getCourseName(),id);
//	}

	@Override
	public Optional<Placement> getPlacement(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

}
