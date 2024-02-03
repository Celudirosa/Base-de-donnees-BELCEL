package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Type;

@Repository
public interface TypeDao extends JpaRepository<Type, Integer> {

}
