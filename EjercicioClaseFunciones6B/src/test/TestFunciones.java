package test;

import static modelo.Funciones.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Funcion esBiciesto:" + esBisiesto(2100));
		LocalDate date = LocalDate.of(2000, 2, 7);
		System.out.println("Funcion traerFechaCorta: " + traerFechaCorta(date));
		LocalTime hora = LocalTime.of(15, 28, 29, 2500);
		System.out.println("Funcion traerHoraCorta: " + traerHoraCorta(hora));
		System.out.println("Funcion esDiaHabil: " + esDiaHabil(date));
		System.out.println("Funcion traerDiaDeLaSemana: " + traerDiaDeLaSemana(date));
		System.out.println("Funcion traerMesEnLetras: " + traerMesEnLetras(date));
		System.out.println("Funcion traerFechaLarga: " + traerFechaLarga(date));
		System.out.println("Funcion traerCantidadDeDiasDeUnMes: " + traerCantidadDeDiasDeUnMes(2001, 9));
		System.out.println("Funcion aproximar2Decimal: " + aproximar2Decimal(5.6849));
		System.out.println("Funcion esNumero: " + esNumero('L'));
		System.out.println("Funcion esLetra: " + esLetra('K'));
		System.out.println("Funcion esCadenaNros: " + esCadenaNros("648431J"));
		System.out.println("Funcion esCadenaLetras: " + esCadenaLetras("dcasaABS7"));
		
		LocalDate date2 = LocalDate.of(2022, 9, 30);
		LocalDate date3 = LocalDate.of(2022, 10, 1);
		System.out.println("Cantidad de días habiles: " + cantidadDiasHabilesEntreDosDias(date2, date3));
		/*System.out.println(date3.isAfter(date2));
		System.out.println(date3.compareTo(date2));*/
		System.out.println("Funcion traerFechaLarga: " + traerFechaLarga(date2));
		System.out.println("Cantidad de días no habiles: " + cantidadDiasNoHabilesEntreDosDias(date2, date3));
		System.out.print(cantidadDeDias(date2, date3));
	}

	

}
