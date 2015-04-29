package com.serpen.logic.entity;

import com.serpen.logic.entity.Role;

public class User {
	/**
	 * usuario para ingresar a la plataforma
	 */
	private int nickname;
	/**
	 * contrase�a para que el usuario pueda acceder a la plataforma
	 */
	private String password;
	/**
	 * respuesta de seguriad que se utiliza en caso de olvido de contrase�a
	 */
	private String answer;
	/**
	 * rol que tine el usuario
	 */
	private Role rol;
	/**
	 * indica el estado que tiene el usuario
	 */
	private char  state;
	/**
	 * nombre de pila del usuario
	 */
	private String name;
	/**
	 * apellido del usuario
	 */
	private String lastName;
	/**
	 * direccion donde vive actualmente el usuario
	 */
	private String address;
	/**
	 * numero telefonico
	 */
	private String numberPhone;
	/**
	 * empresa donde trabaja si es cotizante o donde trabajo y se penciono
	 */
	private String business;
	/**
	 * salario que recive o resivia
	 */
	private double salary;
	/**
	 * tipo de afilliacion que tiene si es cotizante o pensionado
	 */
	private char affiliate;
	/**
	 * fondo de penciones a la que pertenece el usuario
	 */
	private PensionFund pensionFund;
	/**
	 * estado activo del suaurio
	 */
	public static final char STATE_TYPE_ACTIVE = 'A';
	/**
	 * tipo de afiliacion contisante
	 */
	public static final char AFFILIATE_TYPE_CONTRIBUTOR='C';
	/**
	 * tipo de afiliacion pensionado
	 */
	public static final char AFFILIATE_TUPE_PENSIONARY = 'P';
	/**
	 * Construcot por omision para la clase User.java
	 */
	public User() {


	}
	/**
	 * 
	 * @param nickname usuario
	 * @param password contrase�a
	 * @param answer respuesta_seguridad
	 * @param rol rol
	 * @param name nombre
	 * @param lastName apellido
	 * @param address direccion
	 * @param numberPhone numero_telefonico
	 * @param business empresa
	 * @param salary salario
	 * @param affiliate tipo_afiliacion
	 * @param pensionFund fondo_de_penciones
	 */
	public User(int nickname, String password, String answer, Role rol,
			String name, String lastName, String address,
			String numberPhone, String business, double salary, char affiliate,
			PensionFund pensionFund) {
		super();
		this.nickname = nickname;
		this.password = password;
		this.answer = answer;
		this.rol = rol;
		this.state = STATE_TYPE_ACTIVE;
		this.name = name;
		this.lastName = lastName;
		this.address = address;
		this.numberPhone = numberPhone;
		this.business = business;
		this.salary = salary;
		this.affiliate = affiliate;
		this.pensionFund = pensionFund;
	}
	/**
	 * permite asignar un estado de usuario
	 * @param estado estado
	 */
	public void setState(char estado) {
		this.state = estado;
	}
	/**
	 * retorna el estado del usuario /*activo /* inactivo
	 * @return estado
	 */
	public String getState(){
		if(state == 'A'){

			return "Activo";
		}else{
			return "Inactive";
		}
	}
	/**
	 * retorna el rol al que pertenece el usuario
	 * @return rol
	 */
	public Role getRol() {
		return rol;
	}
	/**
	 * asigna un rol al usuario
	 * @param rol rol
	 */
	public void setRol(Role rol) {
		this.rol = rol;
	}
	/**
	 * retorna el nickname o usuario para ingreso a la plataforma
	 * @return nickname
	 */
	public int getNickname() {
		return nickname;
	}
	/**
	 * asigna un valor al nickname
	 * @param nickname nickname
	 */
	public void setNickname(int nickname) {
		this.nickname = nickname;
	}
	/**
	 * retorna la contrase�a del usuario
	 * @return contrase�a
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * asigna una contrase�a al usuario
	 * @param password contrase�a
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * retorna la respuesta de seguridad del usaurio
	 * @return respuestaSeguridad
	 */
	public String getAnswer() {
		return answer;
	}
	/**
	 * permite asignar una respuesta de seguridad
	 * @param answer respuestaSeguridad
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	/**
	 * retorna el nombre del usuario
	 * @return nombre
	 */
	public String getName() {
		return name;
	}
	/**
	 * asigna un valor al nombre
	 * @param name nombre
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * retorna el apellido
	 * @return apellido
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * permite asignar un apellido
	 * @param lastName apellido
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * retorna la deireccion 
	 * @return direccion
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * asigna una direccion
	 * @param address direccion
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * retorna el numero de telefono
	 * @return numeroTelefono
	 */
	public String getNumberPhone() {
		return numberPhone;
	}
	/**
	 * asigna un numero de telefono
	 * @param numberPhone numeroTelefono
	 */
	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}
	/**
	 * retorna la empresa
	 * @return empresa
	 */
	public String getBusiness() {
		return business;
	}
	/**
	 * asigna una empresa
	 * @param business empresa
	 */
	public void setBusiness(String business) {
		this.business = business;
	}
	/**
	 * retorna el salario del usuario
	 * @return salario
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * asigna un valor al salario
	 * @param salary salario
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * retorna el tipo de afiliacion del usuario
	 * @return afiliacion
	 */
	public char getAffiliate() {
		return affiliate;
	}
	/**
	 * asgna un valor al tipo de afiliacion
	 * @param affiliate afiliacion
	 */
	public void setAffiliate(char affiliate) {
		this.affiliate = affiliate;
	}
	/**
	 * retorna el fondo de penciones al que pertenece el usuario
	 * @return fondo
	 */
	public PensionFund getPensionFund() {
		return pensionFund;
	}
	/**
	 * asigna un fondo de penciones
	 * @param pensionFund
	 */
	public void setPensionFund(PensionFund pensionFund) {
		this.pensionFund = pensionFund;
	}
	/**
	 * retorna si el estado es cativo o no
	 * @return
	 */
	public boolean isActive(){
		return this.state=='A';
	}
	/**
	 * metodo delegado toString
	 */
	@Override
	public String toString() {
		return "User [nickname=" + nickname + ", password=" + password
				+ ", answer=" + answer + ", rol=" + rol + ", state=" + state
				+ ", name=" + name + ", lastName=" + lastName + ", address="
				+ address + ", numberPhone=" + numberPhone + ", business="
				+ business + ", salary=" + salary + ", affiliate=" + affiliate
				+ ", pensionFund=" + pensionFund + "]";
	}
}
