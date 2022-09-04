package modelo;

public class Genero {
	private int iIDGenero;
	private String sGenero;
	
	public Genero(int iIDGenero, String sGenero) {
		this.iIDGenero = iIDGenero;
		this.sGenero = sGenero;
	}
	
	public int getiIDGenero() {
		return iIDGenero;
	}

	protected void setiIDGenero(int iIDGenero) {
		this.iIDGenero = iIDGenero;
	}

	public String getsGenero() {
		return sGenero;
	}

	public void setsGenero(String sGenero) {
		this.sGenero = sGenero;
	}

	@Override
	public String toString() {
		return "(ID= " + iIDGenero + ", Genero= " + sGenero + ")";
	}
	
	public boolean equals(Genero g) {
		return ( (iIDGenero == g.iIDGenero) && (sGenero.equals(g.sGenero)) ) ? true : false;
	}
	
}
