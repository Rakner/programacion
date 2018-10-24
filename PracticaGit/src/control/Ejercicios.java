package control;

import java.time.LocalDate;
import java.util.Random;

import javax.swing.SingleSelectionModel;

import modelo.Persona;

public class Ejercicios {

	public void pruebasAPI() {
		// 1. Imprimir por consola el valor de 2 elevado a 3
		// 2. Imprime por consonla un valor aleatorio entre 1 y 100
		// 3. En la cadena "LAS PALMAS DE GRAN CANARIA", imprime "GRAN"
		double resul = Math.pow(2, 3);
		System.out.println("el resultado es" + " " + resul);
		Random rnd = new Random();
		System.out.println("el resultado es " + rnd.nextInt(100));
		System.out.println("el resultado es " + "LAS PALMAS DE GRAN CANARIA".substring(14, 18));
	}

	public Integer convierteCadenaAEntero(String cadena) {

		int c = 0;
		try {
			c = Integer.parseInt(cadena);
			System.out.println("El numero es: " + cadena);
		} catch (NumberFormatException e) {
			System.out.println(cadena + " No es un valor apto para pasar a parse");
		}
		return c;
	}

	// Mostrar por consola los numeros comprendidos entre dos enteros a y b.
	// 1.- Prototipo:

	public void listaIntervaloEnteros(int a, int b) {
		// 2.- Cuerpo:
		/*
		 * int i = a; while(i <= b) System.out.println(i++);
		 */
		boolean condicion = true;
		if (condicion) {

		} else {

		}
		for (int j = a; j <= b; j++)
			System.out.println(j);

	}

	public void serieFibonacci(int n) {
		int pri = 0;
		int seg = 1;
		int respuesta = 0;
		for (int i = 0; i < n; i++) {
			respuesta = pri + seg;
			System.out.print(pri + ",");
			pri = seg;
			seg = respuesta;
		}

	}

	public int factorizarNumero(int n) {
		int resultado = 1;
		for (int i = 1; i <= n; i++) {
			resultado *= i;
			System.out.print(resultado + ",");
		}
		return resultado;
	}

	public int[] generarAleatorios(int n, int inferior, int superior) {
		int[] resultado = new int[n];
		Random rnd = new Random();
		for (int i = 0; i < n; i++) {
			resultado[i] = inferior + rnd.nextInt(superior - inferior + 1);
			System.out.println(resultado[i]);
		}
		return resultado;

	}
//Devolver un array de nº random, basado en el metodo anterior
	
	public int [] generaListaAleatorios (int n, int inferior, int superior) {
		int[] resultado = new int[n];
		Random rnd = new Random();
		for (int i = 0; i < n; i++) 
			resultado[i] = inferior + rnd.nextInt(superior - inferior + 1);
		return resultado;
		
	}
	
	public int calNumeroMenos(int x, int y, int z) {
		if (x < y)
			if (x < z)
				return x;
			else
				return z;
		else if (y < z)
			return y;
		else
			return z;
	}

	public int calNumeroMenos(int x, int y, int z, int w) {
		if (x < y)
			if (x < z)
				if (x < w)
					return x;
				else
					return w;
			else if (z < w)
					return z;
				else
					return w;
		else if (y < z)
				if (y < w)
					return y;
				
				else
					return w;
		else 
			if (z < w)
				return z;
			else 
				return w;
	}
	
	
	public Persona [] devolverListaPersonas (int n) {
		Persona [] resultado = new Persona[n];
		for (int i = 0; i < n; i++) 
				resultado [i] = new Persona();
		return resultado;
		
	}
	

	public static void main(String[] args) {
		Persona juan;
		juan = new Persona("2345985k", "Juan Luis", 47);
		int pasos = juan.caminar(20);
		Persona persona1 = new Persona();
		Ejercicios prueba = new Ejercicios();
		prueba.pruebasAPI();
		Ejercicios ejercicios = new Ejercicios();
		// int a = 10;
		// int b = 30;
		int[] misAleatorios = ejercicios.generarAleatorios(10, 1, 6);
		/*
		 * ejercicios.factorizarNumero(6); ejercicios.serieFibonacci(7);
		 * ejercicios.convierteCadenaAEntero("a"); ejercicios.listaIntervaloEnteros(a,
		 * b);
		 */
		/*int menor = Ejercicios.calNumeroMenos(23, 43, 4, 35);
		System.out.println("el menor es: " + menor);*/
		int x=4, y=5, z=75, w=19;
		Persona [] misPersonas = ejercicios.devolverListaPersonas(5);
		System.out.println("el menor es : " + ejercicios.calNumeroMenos(x, y, z, w)); 
		System.out.println("FIN DE PROGRAMA");
	}
}
