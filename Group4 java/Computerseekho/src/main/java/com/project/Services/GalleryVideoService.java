package com.project.Services;

import java.util.List;
import java.util.Optional;

import com.project.Entities.GalleryVideo;

public interface GalleryVideoService {
	void addGalleryVideo(GalleryVideo p);
	List<GalleryVideo> getGalleryVideos1();
	void delete(int id);
	void update(GalleryVideo GalleryVideo,int id);
	Optional<GalleryVideo> getGalleryVideo(int id);
	List<GalleryVideo> getGalleryVideos();
}