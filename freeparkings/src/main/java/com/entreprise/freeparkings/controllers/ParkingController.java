package com.entreprise.freeparkings.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entreprise.freeparkings.models.Parking;
import com.entreprise.freeparkings.service.ParkingService;

@RestController
@RequestMapping(path = "/")
public class ParkingController {
	
	@Autowired
	private ParkingService parkingservice;
	
	
	@GetMapping(path = "parkings")
	public List<Parking> getAllParkings(){
		return parkingservice.getAllParkings();
	}
	

}
