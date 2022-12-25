package com.iset.web;

import java.util.Collection;
import java.util.Optional;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iset.dao.ReservationRepository;
import com.iset.entity.Reservation;


@RestController
public class ReservationController {

	@Autowired 
	ReservationRepository reservationRepository;
	
	@PostMapping("/reservations")
	public Reservation saveReservation(@RequestBody Reservation r)
	    {
	       return reservationRepository.save(r);
	    }
	
	@GetMapping("/reservations")
	@RolesAllowed("user")
	public Collection <Reservation> getReservations()
	{
	return reservationRepository.findAll();
	}
	
	@GetMapping("/reservations/{id}")
    public Optional <Reservation> findReservationById(@PathVariable("id") int id) {
		return reservationRepository.findById(id);
	}
	
	
	@DeleteMapping("/reservations/{id}")
    public void deleteReservation(@PathVariable int id)
     {
		reservationRepository.deleteById(id);
     }
	
	@PutMapping("/reservations/{id}")
	public Reservation updateReservation(@PathVariable int id, @RequestBody Reservation r) 
	{

		Reservation reserv = reservationRepository.findById(id).
				orElseThrow(() -> new RuntimeException("Reservation introuvable avec id : : " +id));
	    reserv.setClient_name(r.getClient_name());
		reserv.setNbr_adultes(r.getNbr_adultes());
		reserv.setNbr_chambres(r.getNbr_chambres());
		reserv.setNbr_enfants(r.getNbr_enfants());
		reserv.setNbr_nuits(r.getNbr_nuits());
		reserv.setDate_reservation(r.getDate_reservation());
		reserv.setUser_id(r.getUser_id());

		final Reservation updatedReservation =  reservationRepository.save(reserv); 
		return updatedReservation;
	}
}


