package com.project.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.Entities.GalleryVideo;

import java.util.List;



@Repository
@Transactional
public interface GalleryVideoRepository extends JpaRepository<GalleryVideo,Integer> 
{
	
	@Modifying
	@Query("update GalleryVideo m set m.videoPath = :videoPath where m.galleryVideoId = :id")
	void update(@Param("videoPath") String path, @Param("id")int id);
	
	
//	@Query("from Product p where p.category=:cat")
//	List<Product> listCat(@Param("cat") String name);
}
