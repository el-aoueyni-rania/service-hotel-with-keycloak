package com.iset.web;

import java.util.Collection;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.iset.dao.ActiviteRepository;
import com.iset.entity.Activite;

@RestController
public class ActiviteController {
	
	@Autowired 
	ActiviteRepository activiteRepository;
	
	@PostMapping("/activites")
	public Activite saveActivite(@RequestBody Activite a)
	    {
	       return activiteRepository.save(a);
        }
	
	@GetMapping("/activites")
	public Collection <Activite> getActivites()
	{
	return activiteRepository.findAll();
	}
	
	@GetMapping(value="/activites/{id}")
    public Optional <Activite> findActiviteById(@PathVariable("id") int id) {
		return activiteRepository.findById(id);
	}
	
	
	@DeleteMapping("/activites/{id}")
    public void deleteActivite(@PathVariable int id)
     {
		activiteRepository.deleteById(id);
     }
	
	@PutMapping("/activites/{id}")
	public Activite updateActivite(@PathVariable("id") int id, @RequestBody Activite a) 
	{
		Activite act = activiteRepository.findById(id).
				orElseThrow(() -> new RuntimeException("Activite introuvable avec id : : " +id));
		act.setNom_activite(a.getNom_activite());
		act.setDate_activite(a.getDate_activite());
	   
		final Activite updatedActivite =  activiteRepository.save(act); 
		return updatedActivite;
	}

}

