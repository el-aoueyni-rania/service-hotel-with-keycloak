package com.iset.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Reservation {

	@Id
	@GeneratedValue
	private int id;
	private String client_name;
	private int nbr_nuits;
	private int nbr_chambres;
	private int nbr_adultes;
	private int nbr_enfants;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private Date date_reservation;
	private int user_id;
	
	
	public Reservation(int id, String client_name, int nbr_nuits, int nbr_chambres, int nbr_adultes, int nbr_enfants,
			Date date_reservation, int user_id) {
		super();
		this.id = id;
		this.client_name = client_name;
		this.nbr_nuits = nbr_nuits;
		this.nbr_chambres = nbr_chambres;
		this.nbr_adultes = nbr_adultes;
		this.nbr_enfants = nbr_enfants;
		this.date_reservation = date_reservation;
		this.user_id = user_id;
	}


	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getClient_name() {
		return client_name;
	}


	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}


	public int getNbr_nuits() {
		return nbr_nuits;
	}


	public void setNbr_nuits(int nbr_nuits) {
		this.nbr_nuits = nbr_nuits;
	}


	public int getNbr_chambres() {
		return nbr_chambres;
	}


	public void setNbr_chambres(int nbr_chambres) {
		this.nbr_chambres = nbr_chambres;
	}


	public int getNbr_adultes() {
		return nbr_adultes;
	}


	public void setNbr_adultes(int nbr_adultes) {
		this.nbr_adultes = nbr_adultes;
	}


	public int getNbr_enfants() {
		return nbr_enfants;
	}


	public void setNbr_enfants(int nbr_enfants) {
		this.nbr_enfants = nbr_enfants;
	}


	public Date getDate_reservation() {
		return date_reservation;
	}


	public void setDate_reservation(Date date_reservation) {
		this.date_reservation = date_reservation;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	
	
}
