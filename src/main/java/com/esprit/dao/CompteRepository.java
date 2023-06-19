package com.esprit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.esprit.entities.Compte;




@RepositoryRestController
public interface CompteRepository extends JpaRepository<Compte, Long>{

}
