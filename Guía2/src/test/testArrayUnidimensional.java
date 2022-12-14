package test;

import modelo.ArrayUnidimensional;
import java.util.Random;

public class testArrayUnidimensional {
	
	public static void main(String[] args) {
		final int TAMANIO = 10;
		Random aleatorio = new Random();
		int[] vector = new int[TAMANIO];
		
		for(int i=0; i<TAMANIO; i++) {
			vector[i] = aleatorio.nextInt(101);
		}
		
		final String LINEA = "--------------------------------------------------------------------------------------------------";
		
		ArrayUnidimensional array = new ArrayUnidimensional(vector);
		
		System.out.println("Datos del vector:\n" + array.toString() + "\n");
		
		System.out.println(LINEA + "\nTraer numero mayor del vector: " + array.traerElMayor());
		System.out.println(LINEA + "\nTraer numero menor del vector: " + array.traerElMenor());
		System.out.println(LINEA + "\nTraer promedio del vector: " + array.calcularPromedio());
		System.out.println(LINEA + "\nTraer moda del vector: " + array.traerModa());
		array.setVector(array.ordenarAscendente());
		System.out.println(LINEA + "\nVector ascendente: " + array.toString());
		array.setVector(array.ordenarDescendente());
		System.out.println(LINEA + "\nVector descendente: " + array.toString());
		int iPosicion = aleatorio.nextInt(TAMANIO);
		System.out.println(LINEA + "\nTraer frecuencia numero " + vector[iPosicion] + " del vector: " + array.traerFrecuencia(vector[iPosicion]));
	
	}

}
