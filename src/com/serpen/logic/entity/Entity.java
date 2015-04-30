package com.serpen.logic.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Clase entidad
 * esta clase contiene las entidades de educacion, turismo
 * y vivienda que interactuan en la aplicacion
 * @author Diana
 *
 */

public class Entity {

	/**
	 * Atributos de la clase, segun la base de datos 
	 */
	private String nit;
	private Conection conection;
	private String name;
	private String entityType;
	private String description;
	private Set<Agreement> agreements;
	/**
	 * Tipos de entidad
	 * sea Educacion, vivienda y turismo 
	 */
	public static final char ENTITY_TYPE_EDUCATION='E';
	public static final char ENTITY_TYPE_HOUSING='V';
	public static final char ENTITY_TYPE_TOURISM='T';
	/**
	 * Constructor vacio de la clase 	
	 */
	public Entity() {
		this.agreements = new HashSet<Agreement>();
		this.conection=new Conection();
	}
	/**
	 * Constructor con los atributos de la clase 
	 * @param nit_entity
	 * @param id
	 * @param name
	 * @param type_entity
	 * @param description
	 */
	public Entity(String nit_entity, String name, String type_entity,
			String description) {

		this.nit = nit_entity;
		this.conection = new Conection();
		this.name = name;
		this.entityType = type_entity;
		this.description = description;
		this.agreements = new HashSet<Agreement>();
	}
	/**
	 * Getters y Setters de cada uno de los atributos 
	 * @return
	 */
	public String getNit() {
		return nit;
	}

	public void setNit(String nit_entity) {
		this.nit = nit_entity;
	}

	public Conection getConection() {
		return this.conection;
	}

	public void setConection(int id, String url, int port, String nameBd, String nit) {
		//conection = new Conection(id, url, port, name_Bd, nit)on
		conection.setId(id);
		conection.setName_Bd(nameBd);
		conection.setNit(nit);
		conection.setPort(port);
		conection.setUrl(url);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String type_entity) {
		this.entityType = type_entity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Agreement> getAgreements() {
		return agreements;
	}
	
	public void setAgreements(Set<Agreement> agreements) {
		this.agreements = agreements;
	}
	/**
	 * Metodo tostring que retorna todos los atributos de la clase 
	 */
	@Override
	public String toString() {
		return "Entity [nit_entity=" + nit + ", conction=" + conection + ", name="
				+ name + ", type_entity=" + entityType + ", description="
				+ description + "]";
	}

}
