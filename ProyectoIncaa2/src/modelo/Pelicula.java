package modelo;

public class Pelicula {
	private int iIDPelicula;
	private String sNombrePelicula;
	private Genero genero;
	

	public Pelicula(int iIDPelicula, String sNombrePelicula, Genero genero) {
		this.iIDPelicula = iIDPelicula;
		this.sNombrePelicula = sNombrePelicula;
		this.genero = genero;
	}


	public int getiIDPelicula() {
		return iIDPelicula;
	}
	
	
	protected void setiIDPelicula(int iIDPelicula) {
		this.iIDPelicula = iIDPelicula;
	}


	public String getsNombrePelicula() {
		return sNombrePelicula;
	}


	public void setsNombrePelicula(String sNombrePelicula) {
		this.sNombrePelicula = sNombrePelicula;
	}

	public Genero getGenero() {
		return genero;
	}
	

	protected void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	@Override
	public String toString() {
		return "Pelicula [ID= " + iIDPelicula + ", Nombre= " + sNombrePelicula + ", Genero= " + genero.getsGenero() + "]";
	}


	public boolean equals(Pelicula p) {
		return ( (iIDPelicula == p.iIDPelicula) && (sNombrePelicula.equalsIgnoreCase(p.sNombrePelicula)) && genero.equals(p.genero) ) ? true : false;
	}
}
