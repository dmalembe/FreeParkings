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
	private int NbplacesDispo;
	private int NbplacesTotal;
	private String Statut;
	private String Horaire_ouverture;

}
