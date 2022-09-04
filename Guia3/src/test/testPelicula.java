package test;

import modelo.Pelicula;

public class testPelicula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pelicula p1 = new Pelicula(1, "Los 101 Dalmatas");
		Pelicula p2 = new Pelicula(1, "Los 101 Dalmatas");
		
		System.out.println(p1.equals(p2));
		
	}

}
