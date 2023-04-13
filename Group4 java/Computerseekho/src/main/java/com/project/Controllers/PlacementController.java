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

import com.project.Entities.Placement;
import com.project.Services.PlacementService;


	
	@RestController  
	@CrossOrigin(origins="*")
	public class PlacementController
	{
		@Autowired
		PlacementService manager;
		
		
		 @GetMapping(value = "api/Placements")
		 public List<Placement> showPlacements1()
		 {
			  return manager.getPlacements(); 
			
		 }
		
		 @GetMapping(value = "api/PlacementsById/{pid}")
		 public Optional<Placement> getPro(@PathVariable int pid)
		 {
			Optional<Placement> p=manager.getPlacement(pid);
			return p;
		 }
	
		 @DeleteMapping(value = "api/Placements/{pid}")
		 public void removepro(@PathVariable int pid)
		 {
			manager.delete(pid);
		 }
//		 @PutMapping(value = "api/Placements/{pid}")
//		 public void updatepro(@RequestBody Placement Placement,@PathVariable int pid)
//		 {
//			System.out.println("inside updatepro of controller");
//			manager.update(Placement,pid);
//		 }
		 @PostMapping(value = "api/Placements")
		 public void addpro(@RequestBody Placement Placement)
		 {
			System.out.println("addpro called");
			manager.addPlacement(Placement);
		 }
	}



