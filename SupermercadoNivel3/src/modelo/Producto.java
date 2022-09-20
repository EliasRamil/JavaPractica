package modelo;

public class Producto {
	private int iIDProducto;
	private String sProducto;
	private float fPrecio;
	
	public Producto(int iIDProducto, String sProducto, float fPrecio) {
		this.iIDProducto = iIDProducto;
		this.sProducto = sProducto;
		this.fPrecio = fPrecio;
	}

	public int getiIDProducto() {
		return iIDProducto;
	}
	
	public String getsProducto() {
		return sProducto;
	}

	public void setsProducto(String sProducto) {
		this.sProducto = sProducto;
	}

	public float getfPrecio() {
		return fPrecio;
	}

	public void setfPrecio(float fPrecio) {
		this.fPrecio = fPrecio;
	}

	@Override
	public String toString() {
		return "Producto [ID= " + iIDProducto + ", Nombre= " + sProducto + ", Precio=" + fPrecio + "]";
	}
	
	public boolean equals(Producto p) {
		return (iIDProducto == p.iIDProducto && sProducto == p.sProducto && fPrecio == p.fPrecio) ? true : false;
	}
}
