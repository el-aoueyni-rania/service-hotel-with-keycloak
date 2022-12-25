package com.iset.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iset.entity.Reservation;


public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
