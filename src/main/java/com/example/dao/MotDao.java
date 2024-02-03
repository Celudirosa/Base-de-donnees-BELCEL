package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Mot;

public interface MotDao extends JpaRepository<Mot, Integer> {
    
    List<Mot> rechercheParMots(String mot);

}
