package com.nttdata.bootcamp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.Coche.Coche;

@RestController
public class Controller {
	
	@Autowired
	Coche coche;
	
	@GetMapping("/verCoche")
	public String getverCoche() {
		System.out.println(coche.getElegir());
		return coche.getElegir();
	}

}
