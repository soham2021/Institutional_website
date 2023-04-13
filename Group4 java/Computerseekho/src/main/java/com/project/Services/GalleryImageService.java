package com.project.Services;

import java.util.List;
import java.util.Optional;
import com.project.Entities.GalleryImage;

public interface GalleryImageService {
	void addGalleryImage(GalleryImage p);
	List<GalleryImage> getGalleryImages1();
	void delete(int id);
	void update(GalleryImage GalleryImage,int id);
	Optional<GalleryImage> getGalleryImage(int id);
	List<GalleryImage> getGalleryImages();
}
