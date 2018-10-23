package modelo;

import java.time.LocalDate;
import java.util.Random;

public class Persona {
	private String nombre;
	private LocalDate fecha_nac;
	private String nif;
	private int longitudDePaso;

	public int caminar(int numPasos) {
		double a = 9.0;
		double raiz = Math.sqrt(a);
		Random miRandom = new Random();
		int valor = miRandom.nextInt();
		return (numPasos * longitudDePaso) / 100;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(LocalDate fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public int getLongitudDePaso() {
		return longitudDePaso;
	}

	public void setLongitudDePaso(int longitudDePaso) {
		this.longitudDePaso = longitudDePaso;
	}

	public Persona(String nombre, String nif, int longitudDePaso) {
		super();
		this.nombre = nombre;
		this.nif = nif;
		this.longitudDePaso = longitudDePaso;
		this.fecha_nac = null;
	}

	public Persona() {
		super();
		this.nombre = "anonimo";
		this.nif = "883435237f";
		this.longitudDePaso = 25;
		this.fecha_nac = LocalDate.now();
	}
}
