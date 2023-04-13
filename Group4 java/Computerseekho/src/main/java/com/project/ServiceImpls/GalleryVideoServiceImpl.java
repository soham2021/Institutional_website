package com.project.ServiceImpls;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entities.GalleryVideo;
import com.project.Repositories.GalleryVideoRepository;
import com.project.Services.GalleryVideoService;
@Service
public class GalleryVideoServiceImpl implements GalleryVideoService{
	@Autowired
	GalleryVideoRepository repository;

	@Override
	public void addGalleryVideo(GalleryVideo p) {
		repository.save(p);	
	}

	@Override
	public List<GalleryVideo> getGalleryVideos() {
		
		return repository.findAll();		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}

	@Override
	public void update(GalleryVideo GalleryVideo,int id) {
		// TODO Auto-generated method stub
		System.out.println("inside update method of service layer");
		repository.update(GalleryVideo.getVideoPath(),GalleryVideo.getGalleryVideoId());
	}

	@Override
	public Optional<GalleryVideo> getGalleryVideo(int id) 
	{
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<GalleryVideo> getGalleryVideos1() {
		// TODO Auto-generated method stub
		return null;
	}

}

