package modelo;

public class Cliente {
	private int iIDCliente;
	private String sCliente;
	private long lDNI;
	private String sDireccion;
	
	public Cliente(int iIDCliente, String sCliente, long lDNI, String sDireccion) {
		this.iIDCliente = iIDCliente;
		this.sCliente = sCliente;
		this.lDNI = lDNI;
		this.sDireccion = sDireccion;
	}

	public int getiIDCliente() {
		return iIDCliente;
	}

	protected void setiIDCliente(int iIDCliente) {
		this.iIDCliente = iIDCliente;
	}

	public String getsCliente() {
		return sCliente;
	}

	public void setsCliente(String sCliente) {
		this.sCliente = sCliente;
	}

	public long getlDNI() {
		return lDNI;
	}

	public void setlDNI(long lDNI) {
		this.lDNI = lDNI;
	}

	public String getsDireccion() {
		return sDireccion;
	}

	public void setsDireccion(String sDireccion) {
		this.sDireccion = sDireccion;
	}

	@Override
	public String toString() {
		return "Cliente [ID= " + iIDCliente + ", Nombre= " + sCliente + ", DNI= " + lDNI + ", Direccion="
				+ sDireccion + "]";
	}
	
	public boolean equals(Cliente c) {
		return (iIDCliente == c.iIDCliente && sCliente == c.sCliente && lDNI == c.lDNI && sDireccion == c.sDireccion) ? true : false;
	}
}
