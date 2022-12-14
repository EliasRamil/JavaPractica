package modelo;

import java.text.DecimalFormat;
import java.util.Iterator;

public class ArrayBidimensional {
	private double[][] matrizA;

	public ArrayBidimensional(double[][] matrizA) {
		this.matrizA = matrizA;
	}

	// Metodos:
	private boolean compararMatricesSiSonDeIgualesDimenciones(double[][] matrizB) {
		return ((matrizA.length == matrizB.length) && (matrizA[0].length == matrizB[0].length)) ? true : false;
	}

	public double[][] sumar(double[][] matrizB) {
		double[][] matrizSumada;

		if (compararMatricesSiSonDeIgualesDimenciones(matrizB)) {
			matrizSumada = matrizA;
			for (int i = 0; i < matrizA.length; i++) {
				for (int j = 0; j < matrizA[0].length; j++) {
					matrizSumada[i][j] += matrizB[i][j];
				}
			}
		} else {
			matrizSumada = null;
		}

		return matrizSumada;
	}

	public double[][] restar(double[][] matrizB) {
		double[][] matrizRestada;

		if (compararMatricesSiSonDeIgualesDimenciones(matrizB)) {
			matrizRestada = matrizA;
			for (int i = 0; i < matrizA.length; i++) {
				for (int j = 0; j < matrizA[0].length; j++) {
					matrizRestada[i][j] -= matrizB[i][j];
				}
			}
		} else {
			matrizRestada = null;
		}

		return matrizRestada;
	}

	public double[][] traspuesta() {
		double[][] traspuesta = new double[matrizA[0].length][matrizA.length];

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[0].length; j++) {
				traspuesta[j][i] = matrizA[i][j];
			}
		}

		return traspuesta;
	}

	public double[][] multiplicar(int iNumero) {
		double[][] resultado = matrizA;

		for (int i = 0; i < resultado.length; i++) {
			for (int j = 0; j < resultado[0].length; j++) {
				resultado[i][j] *= iNumero;
			}
		}

		return resultado;
	}

	public double[][] multiplicar(double[][] matrizB) {
		double[][] resultado;

		if (matrizA[0].length == matrizB.length) {
			resultado = new double[matrizA.length][matrizB[0].length];

			for(int i=0; i<resultado.length; i++) {
				for (int j = 0; j < resultado[0].length; j++) {
					resultado[i][j] = 0;
					
					for (int j2 = 0; j2 < resultado.length; j2++) {
						resultado[i][j] += matrizA[i][j2] *matrizB[j2][j];
					}
					
					resultado[i][j] /= 3;
					
				}
			}
			
		} else {
			resultado = null;
		}

		return resultado;
	}

	// Getters, setters, toString:
	public double[][] getMatrizA() {
		return matrizA;
	}

	public void setMatrizA(double[][] matrizA) {
		this.matrizA = matrizA;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.##");
		String sResultado = "Matriz:\n";

		if (matrizA != null) {
			for (int i = 0; i < matrizA.length; i++) {
				for (int j = 0; j < matrizA[0].length; j++) {
					sResultado += df.format(matrizA[i][j]) + " | ";
				}
				sResultado += "\n";
			}
		} else {
			sResultado += "Es nula.\n";
		}

		return sResultado;
	}

}
