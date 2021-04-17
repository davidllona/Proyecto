package fifa20;

import java.util.ArrayList;

public class Equipo {
	private int cod_equipo;
	private String nombre;
	private int cod_liga;
	
	public Equipo() {
		super();
	}
	
	public Equipo(int cod_equipo, String nombre, int cod_liga) {
		super();
		this.cod_equipo = cod_equipo;
		this.nombre = nombre;
		this.cod_liga = cod_liga;
	}
	
	public int getCod_equipo() {
		return cod_equipo;
	}
	public void setCod_equipo(int cod_equipo) {
		this.cod_equipo = cod_equipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCod_liga() {
		return cod_liga;
	}
	public void setCod_liga(int cod_liga) {
		this.cod_liga = cod_liga;
	}
	
	}