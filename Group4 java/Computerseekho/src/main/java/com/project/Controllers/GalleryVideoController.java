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
import com.project.Entities.GalleryVideo;
import com.project.Services.GalleryVideoService;


	@RestController  
	@CrossOrigin(origins="*")
	public class GalleryVideoController
	{
		@Autowired
		GalleryVideoService manager;
		
		
		 @GetMapping(value = "api/GalleryVideos")
		 public List<GalleryVideo> showGalleryVideos1()
		 {
			  return manager.getGalleryVideos(); 
			
		 }
		
		 @GetMapping(value = "api/GalleryVideosById/{pid}")
		 public Optional<GalleryVideo> getPro(@PathVariable int pid)
		 {
			Optional<GalleryVideo> p=manager.getGalleryVideo(pid);
			return p;
		 }
		
		 @DeleteMapping(value = "api/GalleryVideos/{pid}")
		 public void removepro(@PathVariable int pid)
		 {
			manager.delete(pid);
		 }
		 @PutMapping(value = "api/GalleryVideos/{pid}")
		 public void updatepro(@RequestBody GalleryVideo GalleryVideo,@PathVariable int pid)
		 {
			System.out.println("inside updatepro of controller");
			manager.update(GalleryVideo,pid);
		 }
		 @PostMapping(value = "api/GalleryVideos")
		 public void addpro(@RequestBody GalleryVideo GalleryVideo)
		 {
			System.out.println("addpro called");
			manager.addGalleryVideo(GalleryVideo);
		 }
	}