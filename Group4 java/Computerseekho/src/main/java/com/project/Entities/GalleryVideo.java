package com.project.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GalleryVideo")
public class GalleryVideo 
{
	public GalleryVideo() {
	super();
	}
	
	private int galleryVideoId;
	private String videoPath;
	public GalleryVideo(int galleryVideoId, String videoPath) {
		super();
		this.galleryVideoId = galleryVideoId;
		this.videoPath = videoPath;
	}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getGalleryVideoId() {
		return galleryVideoId;
	}
	public void setGalleryVideoId(int galleryVideoId) {
		this.galleryVideoId = galleryVideoId;
	}
	public String getVideoPath() {
		return videoPath;
	}
	public void setVideoPath(String imagePath) {
		this.videoPath = imagePath;
	}
	@Override
	public String toString() {
		return "GalleryVideo [galleryVideoId=" + galleryVideoId + ", videoPath=" + videoPath + "]";
	}	
}
