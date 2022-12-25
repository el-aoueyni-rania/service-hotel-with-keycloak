package com.iset;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iset.dao.ActiviteRepository;
import com.iset.dao.ReservationRepository;
import com.iset.dao.UserRepository;
import com.iset.entity.Activite;
import com.iset.entity.Reservation;
import com.iset.entity.User;

@SpringBootApplication
public class ServiceHotelWithKeycloakApplication implements CommandLineRunner {

	
	@Autowired
	UserRepository userRepository;
	@Autowired
	ActiviteRepository activityRepository;
	@Autowired
	ReservationRepository reservationRepository;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceHotelWithKeycloakApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user1=userRepository.save(new User(1,"rania","123456"));
		User user2=userRepository.save(new User(2,"mariem","12345"));
		User user3=userRepository.save(new User(3,"tahe","1234567"));		
		
		Activite a1 =activityRepository.save(new Activite(1,"activité numero 1",new Date()));
		Activite a2 =activityRepository.save(new Activite(2,"activité numero 2",new Date()));
		
		
		Reservation r1 = reservationRepository.save(new Reservation(1 , "rania" , 2 , 1 , 2 , 2 , new Date(), 1));
		 Reservation r2 = reservationRepository.save(new Reservation(2 , "mariem" , 2 , 1 , 2 , 2 , new Date(), 1));
		 Reservation r3 = reservationRepository.save(new Reservation(3 , "tahe" , 2 , 1 , 2 , 2 , new Date(), 1));
		 
	}

}
