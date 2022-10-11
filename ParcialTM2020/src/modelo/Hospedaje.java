package modelo;

import java.time.LocalDate;

import static modelo.Funciones.*;

public class Hospedaje extends Servicio {
	private String sHospedaje;
	private double dPrecioPorNoche;
	
	public Hospedaje(String sCodServicio, double dPorcentajeDescuento, boolean bEnPromocion, String sHospedaje, double dPrecioPorNoche) throws Exception {
		super(sCodServicio, dPorcentajeDescuento, bEnPromocion);
		this.sHospedaje = sHospedaje;
		this.dPrecioPorNoche = dPrecioPorNoche;
	}

	@Override
	public double calcularPrecioFinal(LocalDate ldDia) {
		double dResultado = this.dPrecioPorNoche;
		
		if(esDiaHabil(ldDia) && this.bEnPromocion) {
			dResultado -= dResultado/this.dPorcentajeDescuento;
		}
		
		return dResultado;
	}

	public String getsHospedaje() {
		return sHospedaje;
	}

	public double getdPrecioPorNoche() {
		return dPrecioPorNoche;
	}

	public void setsHospedaje(String sHospedaje) {
		this.sHospedaje = sHospedaje;
	}

	public void setdPrecioPorNoche(double dPrecioPorNoche) {
		this.dPrecioPorNoche = dPrecioPorNoche;
	}

	@Override
	public String toString() {
		return "Hospedaje " + this.getsHospedaje() + super.toString()+ "\n\tPrecio por noche: $" + this.getdPrecioPorNoche() + "\n";
	}
	
	public boolean equals(Hospedaje h) {
		return this.toString().equals(h);
	}
	
}
