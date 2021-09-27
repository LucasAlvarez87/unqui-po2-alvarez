package ar.ede.unq.po2.tp3;

import java.sql.Date;
import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.time.Period;

public class Persona {

	private String Nombre;
	//private Date fechaDeNacimiento;
	private int edad;
	
	public Persona(String nombre, int edad) {
		super();
		this.Nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/*public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	 
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public int getEdad() {;
		return 2021 - this.fechaDeNacimiento.getYear();
	}
	
	/*
	 * No, esta no conoce como se calcula o se obtiene tal valor, esto se llama 
	 * encapsulamiento
	 
	
	public Boolean menorQue(Persona persona) {
		return this.edad() < persona.edad();
	}
	*/
	
	public int getEdad() {
		return this.edad;
	}
	
}
