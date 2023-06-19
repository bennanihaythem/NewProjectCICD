package com.esprit.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.dao.CompteRepository;
import com.esprit.entities.Compte;
import com.esprit.services.CompteService;



@Service
public class CompteImp implements CompteService{

	@Autowired
	private CompteRepository compteRepository;
	@Override
	public Compte saveCompte(Compte c) {
		// TODO Auto-generated method stub
		return compteRepository.save(c);
	}

	@Override
	public List<Compte> findCompte() {
		// TODO Auto-generated method stub
		return compteRepository.findAll();
	}

}
