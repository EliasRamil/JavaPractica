package modelo;

import java.time.LocalDate;

public class Gastronomia extends Servicio {
	private String sGastronomia;
	private double dPrecio;
	private int iDiaDeSemDesc;
	
	public Gastronomia(String sCodServicio, double dPorcentajeDescuento, boolean bEnPromocion, String sGastronomia, double dPrecio, int iDiaDeSemDesc) throws Exception {
		super(sCodServicio, dPorcentajeDescuento, bEnPromocion);
		this.sGastronomia = sGastronomia;
		this.dPrecio = dPrecio;
		this.iDiaDeSemDesc = iDiaDeSemDesc;
	}

	@Override
	public double calcularPrecioFinal(LocalDate ldDia) {
		double dResultado = dPrecio;
		
		if(this.isbEnPromocion()) {
			dResultado -= dResultado/this.getdPorcentajeDescuento();
		}
		
		return dResultado;
	}

	public String getsGastronomia() {
		return sGastronomia;
	}

	public double getdPrecio() {
		return dPrecio;
	}

	public int getiDiaDeSemDesc() {
		return iDiaDeSemDesc;
	}

	public void setsGastronomia(String sGastronomia) {
		this.sGastronomia = sGastronomia;
	}

	public void setdPrecio(double dPrecio) {
		this.dPrecio = dPrecio;
	}

	public void setiDiaDeSemDesc(int iDiaDeSemDesc) {
		this.iDiaDeSemDesc = iDiaDeSemDesc;
	}

	@Override
	public String toString() {
		return "Gastronomia " + sGastronomia + super.toString() + "\n\tPrecio: $" + this.getdPrecio();
	}
	
	
}
