package modelo;

public class Empresa {
	private int iID;
	private String sNombre;
	
	public Empresa(int iID, String sNombre) {
		this.iID = iID;
		this.sNombre = sNombre;
	}

	public int getiID() {
		return iID;
	}

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	@Override
	public String toString() {
		return "Empresa [ID= " + iID + ", Nombre= " + sNombre + "]";
	}
	
	public boolean equals(Empresa e) {
		return (iID == e.getiID() && sNombre.equalsIgnoreCase(e.getsNombre())) ? true : false;
	}
}
