package com.esprit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.esprit.entities.Compte;
import com.esprit.services.CompteService;

@SpringBootApplication
public class BackendProject1Application implements CommandLineRunner{
	@Autowired
	CompteService compteService;

	public static void main(String[] args) {
		SpringApplication.run(BackendProject1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Compte c= compteService.saveCompte(new Compte("Haythem"));
		Compte c2= compteService.saveCompte(new Compte("Haythem2"));
		Compte c3= compteService.saveCompte(new Compte("Haythem3"));
		compteService.findCompte().forEach(compte->System.out.println(c.toString()));
		
	}

}
