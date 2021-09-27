package ar.ede.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {

	private String nombre;
	private ArrayList<Persona> equipo = new ArrayList<Persona>();
	
	public EquipoDeTrabajo(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void agregarAEquipo(Persona persona) {
		equipo.add(persona);
	}
	
	public int promedioDeEdad() {
		int sum = 0;
		for (Persona persona: equipo) {
			sum += persona.getEdad();
		}
		return sum / equipo.size();
	}
	
	public static void main(String[] args) {
		EquipoDeTrabajo equipo = new EquipoDeTrabajo("Equipo");
		Persona leonel = new Persona("leonel", 28);
		Persona matias = new Persona("matias", 21);
		Persona franco = new Persona("franco", 35);
		Persona brian = new Persona("brian", 43);
		Persona juan = new Persona("juan", 19);
		
		equipo.agregarAEquipo(leonel);
		equipo.agregarAEquipo(matias);
		equipo.agregarAEquipo(franco);
		equipo.agregarAEquipo(brian);
		equipo.agregarAEquipo(juan);
		
		System.out.print(equipo.promedioDeEdad());
	}
}
