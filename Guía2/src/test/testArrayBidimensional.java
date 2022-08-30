package test;

import java.util.Random;
import modelo.ArrayBidimensional;
import java.lang.Integer;

public class testArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TAMANIO1 = 3, TAMANIO2 = 4;
		final String LINEA = "--------------------------------------------------------------------------------------------------";
		Random aleatorio = new Random();
		
		double[][] matriz = new double[TAMANIO1][TAMANIO2];
		for(int i=0; i<TAMANIO1; i++) {
			for(int j=0; j<TAMANIO2; j++) {
				matriz[i][j] = aleatorio.nextInt(11);
			}
		}
		
		double[][] matrizB = new double[TAMANIO2][5];
		for(int i=0; i<matrizB.length; i++) {
			for(int j=0; j<matrizB[0].length; j++) {
				matrizB[i][j] = aleatorio.nextInt(11);
			}
		}
		
		ArrayBidimensional matriz1 = new ArrayBidimensional(matriz);
		ArrayBidimensional matriz2 = new ArrayBidimensional(matrizB);
		
		System.out.println("La 1er " + matriz1.toString());
		System.out.println(LINEA + "\nLa 2da " + matriz2.toString());
		ArrayBidimensional matrizCalculos = new ArrayBidimensional(matriz1.sumar(matrizB));
		System.out.println(LINEA + "\nSuma de la 1er y 2da " +matrizCalculos.toString());
		matrizCalculos.setMatrizA(matriz1.restar(matrizB));
		System.out.println(LINEA + "\nResta de la 1er y 2da " + matrizCalculos.toString());
		matrizCalculos.setMatrizA(matriz1.traspuesta());
		System.out.println(LINEA + "\nTraspuesta de la 1er " + matrizCalculos.toString());
		matrizCalculos.setMatrizA(matriz1.multiplicar(3));
		System.out.println(LINEA + "\nMultiplicación por un escalar de la 1er " + matrizCalculos.toString());
		matrizCalculos.setMatrizA(matriz1.multiplicar(matrizB));
		System.out.println(LINEA + "\nMultiplicación de la 1er por la 2da matriz" + matrizCalculos.toString());
	}



}
