package modelo;

public class Produto extends Mercancia {
	private String sProducto;
	private double dPPrecioProducto;
	private double dPorcentajeDescuento;
	private boolean bEsDescuentoEn2daUnidad;
	
	//Constructor:
	public Produto(String sCodMercancia, String sProducto, double dPPrecioProducto, double dPorcentajeDescuento, boolean bEsDescuentoEn2daUnidad) throws Exception {
		super(sCodMercancia);
		this.sProducto = sProducto;
		this.dPPrecioProducto = dPPrecioProducto;
		this.dPorcentajeDescuento = dPorcentajeDescuento;
		this.bEsDescuentoEn2daUnidad = bEsDescuentoEn2daUnidad;
	}

	//Metodos:
	@Override
	public double calcularPrecioFinal() {
		double dResultado = dPPrecioProducto;
		
		if(bEsDescuentoEn2daUnidad) {
			dResultado -= dPPrecioProducto * (dPorcentajeDescuento/200);
		}
		
		return dResultado;
	}

	//Basico:
	public String getsProducto() {
		return sProducto;
	}

	public double getdPPrecioProducto() {
		return dPPrecioProducto;
	}

	public double getdPorcentajeDescuento() {
		return dPorcentajeDescuento;
	}

	public boolean isbEsDescuentoEn2daUnidad() {
		return bEsDescuentoEn2daUnidad;
	}

	public void setsProducto(String sProducto) {
		this.sProducto = sProducto;
	}

	public void setdPPrecioProducto(double dPPrecioProducto) {
		this.dPPrecioProducto = dPPrecioProducto;
	}

	public void setdPorcentajeDescuento(double dPorcentajeDescuento) {
		this.dPorcentajeDescuento = dPorcentajeDescuento;
	}

	public void setbEsDescuentoEn2daUnidad(boolean bEsDescuentoEn2daUnidad) {
		this.bEsDescuentoEn2daUnidad = bEsDescuentoEn2daUnidad;
	}

	@Override
	public String toString() {
		return "Produto: " + sProducto + "\n\t" + super.toString() + "\n\tPrecio producto: " + dPPrecioProducto + "\n\tPorcentaje descuento: " + dPorcentajeDescuento + "\n\tDescuento en la 2da unidad: " + bEsDescuentoEn2daUnidad;
	}
	
	public boolean equals(Produto p) {
		return this.toString().equals(p.toString());
	}
}
