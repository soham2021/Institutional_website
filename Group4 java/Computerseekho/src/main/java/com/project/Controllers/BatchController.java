package com.project.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Entities.Batch;
import com.project.ServiceImpls.BatchServiceImpl;

@RestController

@CrossOrigin(origins = "*")
// If you need to enable your Web Service End point to accept
//AJAX HTTP Requests sent from any origin then use the * for the list of origins.
public class BatchController {
	@Autowired
	private BatchServiceImpl service;
	
	@PostMapping("/api/addBatch")
	public void saveBatch(@RequestBody Batch ref)
	{
		service.save(ref);
	}
	
	@GetMapping("/api/Batch")
	public List<Batch> getAllBatch()
	{
		return service.getAll();
	}
	@GetMapping(value = "api/BatchById/{pid}")
	 public Optional<Batch> getBatch(@PathVariable int pid)
	 {
		Optional<Batch> p=service.getBatch(pid);
		return p;
	 }
//	public Optional<Batch> findById(int courseId) {
//        return service.findById(courseId);
//	}

}
