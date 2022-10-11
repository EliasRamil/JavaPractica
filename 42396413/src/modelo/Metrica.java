package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Metrica {
	private int iValor;
	private LocalDate ldFecha;
	private LocalTime ltHora;
	
	public Metrica(int iValor, LocalDate ldFecha, LocalTime ltHora) {
		this.iValor = iValor;
		this.ldFecha = ldFecha;
		this.ltHora = ltHora;
	}
	
	public int getiValor() {
		return iValor;
	}

	public LocalDate getLdFecha() {
		return ldFecha;
	}

	public LocalTime getLtHora() {
		return ltHora;
	}

	public void setiValor(int iValor) {
		this.iValor = iValor;
	}

	public void setLdFecha(LocalDate ldFecha) {
		this.ldFecha = ldFecha;
	}

	public void setLtHora(LocalTime ltHora) {
		this.ltHora = ltHora;
	}

	@Override
	public String toString() {
		return "Metrica [Valor= " + iValor + ", Fecha= " + ldFecha + ", Hora= " + ltHora + "]";
	}
	
	public boolean equals(Metrica m) {
		return (iValor == m.getiValor() && ldFecha.compareTo(m.getLdFecha()) == 0 && ltHora.compareTo(m.getLtHora()) == 0) ? true : false;
	}
}
