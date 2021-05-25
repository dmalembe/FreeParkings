package com.entreprise.freeparkings.dao.Impl;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.entreprise.freeparkings.dao.ParkingDAO;
import com.entreprise.freeparkings.dao.entity.ResponseParkingsEntity;

@Repository
public class ParkingsDAOImpl implements ParkingDAO {
	
	private static final String URL_API_OPEN_DATA = "https://data.nantesmetropole.fr/api/records/1.0/search/?dataset=244400404_parkings-publics-nantes-disponibilites&q=&facet=grp_nom&facet=grp_statut";
	
	@Autowired
	private RestTemplate restTemplate;


	@Override
	public ResponseParkingsEntity getAllparkings() {
		return restTemplate.getForEntity(URL_API_OPEN_DATA, ResponseParkingsEntity.class).getBody();
		
	}
}
