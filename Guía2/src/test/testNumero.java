package test;

import modelo.Numero;

public class testNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Numero numero1 = new Numero(8);
		
		System.out.println("Metodo 1: " + numero1.sumar(2));
		System.out.println("Metodo 2: " + numero1.multiplicar(3));
		System.out.println("Metodo 3: " + numero1.esPar());
		System.out.println("Metodo 4: " + numero1.esPrimo());
		System.out.println("Metodo 5: " + ((Object)numero1.convertirAString()).getClass().getSimpleName());
		System.out.println("Metodo 6: " + ((Object)numero1.convertirDouble()).getClass().getSimpleName());
		System.out.println("Metodo 7: " + numero1.calcularPotencia(2));
		System.out.println("Metodo 8: " + numero1.pasarBase2());
		System.out.println("Metodo 9: " + numero1.calcularFactorial());
		System.out.println("Metodo 10: " + numero1.numeroCombinatorio(5));

	}

}
