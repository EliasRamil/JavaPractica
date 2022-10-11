package modelo;

import java.time.LocalDate;

public abstract class Servicio {
	protected String sCodServicio;
	protected double dPorcentajeDescuento;
	protected boolean bEnPromocion;
	
	public Servicio(String sCodServicio, double dPorcentajeDescuento, boolean bEnPromocion) throws Exception {
		setsCodServicio(sCodServicio);
		this.dPorcentajeDescuento = dPorcentajeDescuento;
		this.bEnPromocion = bEnPromocion;
	}
	
	public abstract double calcularPrecioFinal(LocalDate ldDia);

	public String getsCodServicio() {
		return sCodServicio;
	}

	public double getdPorcentajeDescuento() {
		return dPorcentajeDescuento;
	}

	public boolean isbEnPromocion() {
		return bEnPromocion;
	}

	private void setsCodServicio(String sCodServicio) throws Exception {
		
		if(sCodServicio.length() == 6) {
			this.sCodServicio = sCodServicio;
		}else {
			throw new Exception("El codigo ingresado no es valido");
		}
		
	}

	public void setdPorcentajeDescuento(double dPorcentajeDescuento) {
		this.dPorcentajeDescuento = dPorcentajeDescuento;
	}

	public void setbEnPromocion(boolean bEnPromocion) {
		this.bEnPromocion = bEnPromocion;
	}

	@Override
	public String toString() {
		return "\n\tCodServicio: " + sCodServicio + "\n\tPorcentaje de Descuento: " + dPorcentajeDescuento
				+ "%\n\tEn Promocion: " + bEnPromocion;
	}
	
	public boolean equals(Servicio s) {
		return (sCodServicio.equals(s.getsCodServicio()) && dPorcentajeDescuento == s.getdPorcentajeDescuento() && bEnPromocion == s.isbEnPromocion()) ? true : false;
	}
}
