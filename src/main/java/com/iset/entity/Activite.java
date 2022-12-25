package com.iset.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Activite {
	@Id
	@GeneratedValue
	private int id;
	private String nom_activite;
	private Date date_activite;
	
	
	public Activite(int id, String nom_activite, Date date_activite) {
		super();
		this.id = id;
		this.nom_activite = nom_activite;
		this.date_activite = date_activite;
	}


	public Activite() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom_activite() {
		return nom_activite;
	}


	public void setNom_activite(String nom_activite) {
		this.nom_activite = nom_activite;
	}


	public Date getDate_activite() {
		return date_activite;
	}


	public void setDate_activite(Date date_activite) {
		this.date_activite = date_activite;
	}
	
	
	
}
