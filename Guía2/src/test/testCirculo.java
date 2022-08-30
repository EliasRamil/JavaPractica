package test;

import modelo.Punto;
import modelo.Circulo;
import java.text.DecimalFormat;

public class testCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.##");
		final String LINEA = "--------------------------------------------------------------------------------------------------";
		
		Punto punto1 = new Punto(5, 3);
		Punto punto2 = new Punto(6, 7);
		Punto punto3 = new Punto(5, 3);
		
		Circulo circulo1 = new Circulo(punto1, 3.9);
		Circulo circulo2 = new Circulo(punto2, 7);
		Circulo circulo3 = new Circulo(punto3, 3.9);
		
		System.out.println("\n" + LINEA + "\nComprobar tostrings");
		System.out.println(circulo1.toString());
		System.out.println(circulo2.toString());
		
		System.out.println("\n" + LINEA + "\nCalcular perimetros:");
		System.out.println("Circulo 1: " + df.format(circulo1.calcularPerimetro()));
		System.out.println("Circulo 2: " + df.format(circulo2.calcularPerimetro()));
		
		System.out.println("\n" + LINEA + "\nCalcular areas:");
		System.out.println("Circulo 1: " + df.format(circulo1.calcularArea()));
		System.out.println("Circulo 2: " + df.format(circulo2.calcularArea()));
		
		System.out.println("\n" + LINEA + "\nCalcular distancias:");
		System.out.println("Circulo 1 a circulo 2: " + df.format(circulo1.calcularDistancia(circulo2)));
		
		System.out.println("\n" + LINEA + "\nComparar circulos");
		System.out.println("Circulo 1 y 3: " + circulo1.equals(circulo3));
		System.out.println("Circulo 2 y 3: " + circulo2.equals(circulo3));
	}

}
