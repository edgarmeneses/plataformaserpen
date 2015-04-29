package com.serpen.logic.entity;

public class PensionFund {
	/**
	 * nit del fondo de penciones
	 */
	private String nit;
	/**
	 * nombre del fondo de penciones
	 */
	private String name;
	/**
	 * porcentaje que el fondo aplica a las cesantias de un usuario
	 */
	private int porcent;
	/**
	 * constructor por omicion de la clase PensionFund.java
	 */
	public PensionFund() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructor de la clase PensionFund.java
	 * se debe ingresar los valores para los atributos de la clase
	 * @param nit nit
	 * @param name nombre_fondo
	 * @param porcent porcentaje_cesantias
	 */
	public PensionFund(String nit, String name, int porcent) {
		super();
		this.nit = nit;
		this.name = name;
		this.porcent = porcent;
	}
	/**
	 * retorna el nit del fondo 
	 * @return nit
	 */
	public String getNit() {
		return nit;
	}
	/**
	 * asigna un valor al nit
	 * @param nit
	 */
	public void setNit(String nit) {
		this.nit = nit;
	}
	/**
	 * retorna el nombre del fondo
	 * @return nombre
	 */
	public String getName() {
		return name;
	}
	/**
	 * asigna un nombre al fondo
	 * @param name nombre
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * retorna el pocentaje que el fondo aplica a las cesantias
	 * @return porcentaje
	 */
	public int getPorcent() {
		return porcent;
	}
	/**
	 * asigna un valor al porcentaje de cesantias
	 * @param porcent
	 */
	public void setPorcent(int porcent) {
		this.porcent = porcent;
	}
	/**
	 * metodo delegado toString
	 */
	@Override
	public String toString() {
		return "PensionFund [nit=" + nit + ", name=" + name + ", porcent="
				+ porcent + "]";
	}
}
