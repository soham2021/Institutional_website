package com.project.ServiceImpls;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.Entities.GalleryImage;
import com.project.Repositories.GalleryImageRepository;
import com.project.Services.GalleryImageService;

@Service
public class GalleryImageServiceImpl implements GalleryImageService{
	
	@Autowired
	GalleryImageRepository repository;

	@Override
	public void addGalleryImage(GalleryImage p) {
		repository.save(p);	
	}

	@Override
	public List<GalleryImage> getGalleryImages() {
		
		return repository.findAll();		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}

	@Override
	public void update(GalleryImage GalleryImage,int id) {
		// TODO Auto-generated method stub
		System.out.println("inside update method of service layer");
		repository.update(GalleryImage.getImagePath(),GalleryImage.getGalleryImageId());
	}

	@Override
	public Optional<GalleryImage> getGalleryImage(int id) 
	{
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<GalleryImage> getGalleryImages1() {
		// TODO Auto-generated method stub
		return null;
	}

}