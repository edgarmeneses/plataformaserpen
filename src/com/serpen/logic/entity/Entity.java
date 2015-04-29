package com.serpen.logic.entity;

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

	}
/**
 * Constructor con los atributos de la clase 
 * @param nit_entity
 * @param id
 * @param name
 * @param type_entity
 * @param description
 */
	public Entity(String nit_entity, Conection conection, String name, String type_entity,
			String description) {
		
		this.nit = nit_entity;
		this.conection = conection;
		this.name = name;
		this.entityType = type_entity;
		this.description = description;
	}
/**
 * Getters y Setters de cada uno de los atributos 
 * @return
 */
	public String getNit_entity() {
		return nit;
	}

	public void setNit_entity(String nit_entity) {
		this.nit = nit_entity;
	}

	public Conection getConnection() {
		return this.conection;
	}

	public void setId(Conection conection) {
		this.conection = conection;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType_entity() {
		return entityType;
	}

	public void setType_entity(String type_entity) {
		this.entityType = type_entity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
