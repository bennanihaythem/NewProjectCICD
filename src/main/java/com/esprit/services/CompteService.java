package com.esprit.services;

import java.util.List;

import com.esprit.entities.Compte;





public interface CompteService {
	
	Compte saveCompte(Compte c);
	List<Compte>findCompte();

}
