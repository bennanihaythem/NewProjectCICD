package com.esprit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

@Entity
public class Compte {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom;
	/**
	 * 
	 */
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Compte(String nom) {
		super();
		this.nom = nom;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Compte [id=" + id + ", nom=" + nom + "]";
	}
	

}
