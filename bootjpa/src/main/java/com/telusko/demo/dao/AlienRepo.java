package com.telusko.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.telusko.demo.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>
{

} 
