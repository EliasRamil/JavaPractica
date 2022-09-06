package modelo;

public class Producto {
	private int iIDProducto;
	private String sNombreProducto;
	private float fPrecio;
	
	public Producto(int iIDProducto, String sNombreProducto, float fPrecio) {
		this.iIDProducto = iIDProducto;
		this.sNombreProducto = sNombreProducto;
		this.fPrecio = fPrecio;
	}
	
	public int getiIDProducto() {
		return iIDProducto;
	}

	protected void setiIDProducto(int iIDProducto) {
		this.iIDProducto = iIDProducto;
	}

	public String getsNombreProducto() {
		return sNombreProducto;
	}

	public void setsNombreProducto(String sNombreProducto) {
		this.sNombreProducto = sNombreProducto;
	}

	public float getfPrecio() {
		return fPrecio;
	}

	public void setfPrecio(float fPrecio) {
		this.fPrecio = fPrecio;
	}

	@Override
	public String toString() {
		return "Producto [Nombre= " + sNombreProducto + ", Precio= " + fPrecio + "]";
	}
	
	public boolean equals(Producto p) {
		return ( (iIDProducto == p.iIDProducto) && (sNombreProducto.equalsIgnoreCase(p.sNombreProducto)) && (fPrecio == p.fPrecio) ) ? true : false;
	}
}
