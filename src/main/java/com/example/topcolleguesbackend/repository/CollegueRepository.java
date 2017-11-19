package com.example.topcolleguesbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.topcolleguesbackend.entite.Collegue;


public interface CollegueRepository extends JpaRepository<Collegue, Integer>{
	
	public Collegue findByPseudo(String pseudo); 
}
