package com.entreprise.freeparkings.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldsEntity {
	
	@JsonProperty(value = "idobj")
	private Integer idobj;
	@JsonProperty(value = "grp_identifiant")
	private Integer grp_identifiant;
	@JsonProperty(value = "grp_nom")
	private String grp_nom;
	@JsonProperty(value = "grp_horodatage")
	private String grp_horodatage;
	@JsonProperty(value = "grp_statut")
	private String grp_statut;
	@JsonProperty(value = "grp_disponible")
	private Integer grp_disponible;
	@JsonProperty(value = "grp_exploitation")
	private Integer grp_exploitation;
}
