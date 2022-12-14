package modelo;

import java.util.Arrays;

public class ArrayUnidimensional{
	private int[] vector;

	//Constructor:
	public ArrayUnidimensional(int[] vector) {
		this.vector = vector;
	}
	
	@Override
	public String toString() {
		return "ArrayUnidimensional [vector=" + Arrays.toString(vector) + "]";
	}

	//Metedos:
	public int traerElMayor() {
		int iMayor = vector[0];
		
		for(int i = 0; i < vector.length; i++) {
			if(iMayor < vector[i]) {
				iMayor = vector[i];
			}
		}
		
		return iMayor;
	}
	
	public int traerElMenor() {
		int iMenor = vector[0];
		
		for(int i = 0; i < vector.length; i++) {
			if(iMenor > vector[i]) {
				iMenor = vector[i];
			}
		}
		
		return iMenor;
	}
	
	public double calcularPromedio() {
		double iPromedio = 0;
		
		for(int i=0; i<vector.length; i++) {
			iPromedio += vector[i];
		}
		
		return iPromedio/vector.length;
	}
	
	public int[] ordenarAscendente() {
		int iAux;
		
		for(int i=0; i<vector.length; i++) {
			for(int j = (i+1); j<vector.length; j++) {
				if(vector[i] > vector[j]) {
					iAux = vector[j];
	                vector[j] = vector[i];
	                vector[i] = iAux;
				}
			}
		}
		
		return vector;
	}
	
	public int[] ordenarDescendente() {
		int iAux;
		
		for(int i=0; i<vector.length; i++) {
			for(int j = (i+1); j<vector.length; j++) {
				if(vector[i] < vector[j]) {
					iAux = vector[j];
	                vector[j] = vector[i];
	                vector[i] = iAux;
				}
			}
		}
		
		return vector;
	}
	
	public double traerFrecuencia(int iNumero) {
		double dCantidad = 0;
		
		for(int i=0; i<vector.length; i++) {
			if(iNumero == vector[i]) {
				dCantidad += 1;
			}
		}
		
		return dCantidad/vector.length;
	}
	
	public int traerModa() {
		int[] modas = new int[vector.length];
		
		for(int i=0; i<vector.length; i++) {
			modas[i] = 0;
		}
		
		int iCantidad, iAux;
		for(int i=0; i<vector.length; i++) {
			iCantidad = 1;
			iAux = vector[i];
			
			for(int j=i+1; j<vector.length; j++) {
				if(iAux == vector[j]) {
					iCantidad++;
				}
			}
			
			modas[i] = iCantidad;
		}
		
		
		int iPosicion = 0;
		iAux = modas[0];
		for(int i=0; i<modas.length; i++) {
			if(iAux < modas[i]) {
				iAux = modas[i];
				iPosicion = i;
			}
		}
		
		return vector[iPosicion];
	}
	
	//Getters and setters:
	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	}
	
}
