package com.project.Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GalleryImage")
public class GalleryImage 
{
	public GalleryImage() {
	super();
	}
	
	private int galleryImageId;
	private String imagePath;
	public GalleryImage(int galleryImageId, String imagePath) {
		super();
		this.galleryImageId = galleryImageId;
		this.imagePath = imagePath;
	}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getGalleryImageId() {
		return galleryImageId;
	}
	public void setGalleryImageId(int galleryImageId) {
		this.galleryImageId = galleryImageId;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	@Override
	public String toString() {
		return "GalleryImage [galleryImageId=" + galleryImageId + ", imagePath=" + imagePath + "]";
	}	
}
