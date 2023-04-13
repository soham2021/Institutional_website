package com.project.ServiceImpls;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entities.Batch;
import com.project.Repositories.BatchRepository;
import com.project.Services.BatchServices;
@Service
public class BatchServiceImpl implements BatchServices {
	@Autowired
	private BatchRepository s_repository;

	@Override
	public void save(Batch ref) {
		s_repository.save(ref);	
		
	}

	@Override
	public List<Batch> getAll() {
		return s_repository.findAll();
	}

	
	public Optional<Batch> getBatch(int pid) {
		return s_repository.findById(pid);
	}

	public Optional<Batch> findById(int courseBatchId) {
	return	s_repository.findById(courseBatchId);
	}

}
