package com.esprit.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.entities.Compte;
import com.esprit.services.CompteService;

@RestController
@CrossOrigin("*")
public class CompteController {

	@Autowired
	CompteService compteService;

	@PostMapping(value = "/")
	public Compte saveCompte(@RequestBody Compte c) {
		return compteService.saveCompte(c);
	}
    
	@GetMapping(path = "/find")
	public List<Compte> findCompte() {
		return compteService.findCompte();
	}
}
