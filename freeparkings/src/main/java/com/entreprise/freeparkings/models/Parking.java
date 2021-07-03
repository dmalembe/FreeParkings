package com.entreprise.freeparkings.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parking {
	
	private Integer id;
	private String name;
	private Integer NbplacesDispo;
	private Integer NbplacesTotal;
	private String Statut;
	private String Horaire_ouverture;

}
