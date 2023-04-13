package com.project.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Entities.Authentication;


public interface AuthenticationRepository extends JpaRepository<Authentication,Integer> 
{
	

}
