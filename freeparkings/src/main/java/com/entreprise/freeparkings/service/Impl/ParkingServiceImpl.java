package com.entreprise.freeparkings.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entreprise.freeparkings.dao.ParkingDAO;
import com.entreprise.freeparkings.dao.entity.RecordEntity;
import com.entreprise.freeparkings.dao.entity.ResponseParkingsEntity;
import com.entreprise.freeparkings.models.Parking;
import com.entreprise.freeparkings.service.ParkingService;

@Service
public class ParkingServiceImpl implements ParkingService {
	
	
	@Autowired
	private ParkingDAO parkingDAO;
	
	public List<Parking> getAllParkings(){
		ResponseParkingsEntity response = parkingDAO.getAllparkings();
		return transformIntoObject(response);
	}
	
	private List<Parking> transformIntoObject(ResponseParkingsEntity response){
		List<Parking> result = new ArrayList<>();
		for (RecordEntity r : response.getRecords()) {
			Parking parking = new Parking();
			parking.setId(r.getFields().getIdobj());
			parking.setName(r.getFields().getGrp_nom());
			parking.setNbplacesDispo(r.getFields().getGrp_disponible());
			parking.setNbplacesTotal(r.getFields().getGrp_exploitation());
			parking.setHoraire_ouverture(r.getFields().getGrp_horodatage());
			parking.setStatut(r.getFields().getGrp_statut());
			
			result.add(parking);
		}
		
		return result;
		}
}
