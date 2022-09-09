package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Funciones {
	public static boolean esBisiesto(int iAnio) {
		return ( ((iAnio%4 == 0) && (iAnio%100 != 0) ) || ((iAnio%400 == 00) && (iAnio%100 == 0) ) ) ? true : false;
	}
	
	public static boolean esFechaValida(LocalDate fecha) {
		boolean bEsValida = false;

		if (fecha.getMonthValue() == 1 || fecha.getMonthValue() == 3 || fecha.getMonthValue() == 5
				|| fecha.getMonthValue() == 7 || fecha.getMonthValue() == 8 || fecha.getMonthValue() == 10
				|| fecha.getMonthValue() == 12) {
			if (1 <= fecha.getDayOfMonth() && fecha.getDayOfMonth() <= 31) {
				bEsValida = true;
			}
		} else if (fecha.getMonthValue() == 4 || fecha.getMonthValue() == 6 || fecha.getMonthValue() == 9
				|| fecha.getMonthValue() == 8 || fecha.getMonthValue() == 11) {
			if (1 <= fecha.getDayOfMonth() && fecha.getDayOfMonth() <= 30) {
				bEsValida = true;
			}
		} else if (fecha.getMonthValue() == 2) {
			if (esBisiesto(fecha.getYear())) {
				if (1 <= fecha.getDayOfMonth() && fecha.getDayOfMonth() <= 29) {
					bEsValida = true;
				}
			} else {
				if (1 <= fecha.getDayOfMonth() && fecha.getDayOfMonth() <= 28) {
					bEsValida = true;
				}
			}
		}

		return bEsValida;
	}
	
	public static String traerFechaCorta(LocalDate fecha) {
		return ( String.valueOf(fecha.getDayOfMonth()) + "/" +  String.valueOf(fecha.getMonthValue()) + "/" + String.valueOf(fecha.getYear()) );
	}
	
	public static String traerHoraCorta(LocalTime hora) {
		return ( String.valueOf(hora.getHour()) + ":" + String.valueOf(hora.getMinute()) );
	}
	
	public static boolean esDiaHabil(LocalDate fecha) {
		return (fecha.getDayOfWeek().getValue() != 6 && fecha.getDayOfWeek().getValue() != 7 ) ? true : false;
	}
	
	public static String traerDiaDeLaSemana(LocalDate fecha) {
		String sDia = "";
		
		switch (fecha.getDayOfWeek().getValue()) {
		case 7:
			sDia = "Domingo";
			break;
		case 1:
			sDia = "Lunes";
			break;
		case 2:
			sDia = "Martes";
			break;	
		case 3:
			sDia = "Miércoles";
			break;
		case 4:
			sDia = "Jueves";
			break;
		case 5:
			sDia = "Viernes";
			break;
		case 6:
			sDia = "Sábado";
			break;
		default:
			sDia = "Error, no existe tal día";
			break;
		}
		
		return sDia;
	}
	
	public static String traerMesEnLetras(LocalDate fecha) {
		String sMes = "";
		
		switch (fecha.getMonthValue()) {
		case 1:
			sMes = "Enero";
			break;
		case 2:
			sMes = "Febrero";
			break;
		case 3:
			sMes = "Marzo";
			break;
		case 4:
			sMes = "Abril";
			break;
		case 5:
			sMes = "Mayo";
			break;
		case 6:
			sMes = "Junio";
			break;
		case 7:
			sMes = "Julio";
			break;
		case 8:
			sMes = "Agosto";
			break;
		case 9:
			sMes = "Septiembre";
			break;
		case 10:
			sMes = "Octubre";
			break;
		case 11:
			sMes = "Noviembre";
			break;
		case 12:
			sMes = "Diciembre";
			break;
		default:
			sMes = "Error, no existe tal mes";
			break;
		}
		
		return sMes;
	}
	
	public static String traerFechaLarga(LocalDate fecha) {
		return traerDiaDeLaSemana(fecha) + " " + String.valueOf(fecha.getDayOfMonth()) + " de " + traerMesEnLetras(fecha) + " del " + String.valueOf(fecha.getYear());
	}
	
	public static int traerCantidadDeDiasDeUnMes(int iAnio, int iMes) {
		int iCantidad = 0;
		
		if (iMes == 1 || iMes == 3 || iMes == 5 || iMes == 7 || iMes == 8 || iMes == 10 || iMes == 12) {
			iCantidad = 31;
		} else if (iMes == 4 || iMes == 6 || iMes == 9 || iMes == 11) {
			iCantidad = 30;
		} else if (iMes == 2) {
			if (esBisiesto(iAnio)) {
				iCantidad = 29;
			} else {
				iCantidad = 28;
			}
		} else {
			iCantidad = -1;
		}
		
		return iCantidad;
	}
	
	public static double aproximar2Decimal(double dValor) {
		return Math.round(dValor * 100d) / 100d;
	}
	
	public static boolean esNumero(char c) {
		return Character.isDigit(c);
	}
	
	public static boolean esLetra(char c) {
		return Character.isLetter(c);
	}
	
	public static boolean esCadenaNros(String sCadena) {
		return sCadena.matches("[0-9]*");
	}
	
	public static boolean esCadenaLetras(String sCadena) {
		return sCadena.matches("[A-z]*");
	}
}
