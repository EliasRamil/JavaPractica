package modelo;

public class Servicio extends Mercancia {
	private String sServicio;
	private double dPresupuesto;
	private double dPorcentajeDescuento;
	private boolean bEnPromocion;
	
	//Constructor:
	public Servicio(String sCodMercancia, String sServicio, double dPresupuesto, double dPorcentajeDescuento, boolean bEnPromocion) throws Exception {
		super(sCodMercancia);
		this.sServicio = sServicio;
		this.dPresupuesto = dPresupuesto;
		this.dPorcentajeDescuento = dPorcentajeDescuento;
		this.bEnPromocion = bEnPromocion;
	}

	//Metodos:
	@Override
	public double calcularPrecioFinal() {
		double dResultado = dPresupuesto;
		
		if(bEnPromocion) {
			dResultado -= dPresupuesto * dPorcentajeDescuento/100;
		}
		
		return dResultado;
	}	
	
	//Basico:
	public String getsServicio() {
		return sServicio;
	}

	public double getdPresupuesto() {
		return dPresupuesto;
	}

	public double getdPorcentajeDescuento() {
		return dPorcentajeDescuento;
	}

	public boolean isbEnPromocion() {
		return bEnPromocion;
	}

	public void setsServicio(String sServicio) {
		this.sServicio = sServicio;
	}

	public void setdPresupuesto(double dPresupuesto) {
		this.dPresupuesto = dPresupuesto;
	}

	public void setdPorcentajeDescuento(double dPorcentajeDescuento) {
		this.dPorcentajeDescuento = dPorcentajeDescuento;
	}

	public void setbEnPromocion(boolean bEnPromocion) {
		this.bEnPromocion = bEnPromocion;
	}

	@Override
	public String toString() {
		return "Servicio: " + sServicio + "\n\t" + super.toString() + "\n\tPresupuesto: " + dPresupuesto + "\n\tPorcentaje descuento: " + dPorcentajeDescuento + "\n\tEn promoción: " + bEnPromocion;
	}

	public boolean equals(Servicio s) {
		return s.toString().equals(this.toString());
	}
}
