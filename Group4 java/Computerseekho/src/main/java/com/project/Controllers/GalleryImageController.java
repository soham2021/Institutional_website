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

import com.project.Entities.GalleryImage;
import com.project.Services.GalleryImageService;


	@RestController  
	@CrossOrigin(origins="*")
	public class GalleryImageController
	{
		@Autowired
		GalleryImageService manager;
		
		
		 @GetMapping(value = "api/GalleryImages")
		 public List<GalleryImage> showGalleryImages1()
		 {
			  return manager.getGalleryImages(); 
			
		 }
		
		 @GetMapping(value = "api/GalleryImagesById/{pid}")
		 public Optional<GalleryImage> getPro(@PathVariable int pid)
		 {
			Optional<GalleryImage> p=manager.getGalleryImage(pid);
			return p;
		 }
		
		 @DeleteMapping(value = "api/GalleryImages/{pid}")
		 public void removepro(@PathVariable int pid)
		 {
			manager.delete(pid);
		 }
		 @PutMapping(value = "api/GalleryImages/{pid}")
		 public void updatepro(@RequestBody GalleryImage GalleryImage,@PathVariable int pid)
		 {
			System.out.println("inside updatepro of controller");
			manager.update(GalleryImage,pid);
		 }
		 @PostMapping(value = "api/GalleryImages")
		 public void addpro(@RequestBody GalleryImage GalleryImage)
		 {
			System.out.println("addpro called");
			manager.addGalleryImage(GalleryImage);
		 }
	}