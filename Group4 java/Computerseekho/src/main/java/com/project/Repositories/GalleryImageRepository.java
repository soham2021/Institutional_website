package com.project.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.Entities.GalleryImage;

import java.awt.Image;
import java.util.List;



@Repository
@Transactional
public interface GalleryImageRepository extends JpaRepository<GalleryImage,Integer> 
{
	
	@Modifying
	@Query("update GalleryImage m set m.imagePath = :imagePath where m.galleryImageId = :id")
	void update(@Param("imagePath") String path, @Param("id")int id);
	
	
}
