package test;

import modelo.Genero;

public class testGenero {

	public static void main(String[] args) {
		Genero g1 = new Genero(1, "Acci�n");
		Genero g2 = new Genero(2, "Terror");
		Genero g3 = new Genero(1, "Acci�n");

		System.out.println(g1.equals(g2));
		System.out.println(g1.equals(g3));
	}

}
