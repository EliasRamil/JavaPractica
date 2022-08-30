package modelo;

public class Circulo {
	private Punto origen;
	private double dRadio;
	
	
	public Circulo(Punto origen, double radio) {
		this.origen = origen;
		this.dRadio = radio;
	}
	
	//Metodos:
	public double calcularPerimetro() {
		return 2 * Math.PI * dRadio;
	}
	
	public double calcularArea() {
		return Math.PI * Math.pow(dRadio, 2);
	}
	
	public double calcularDistancia(Circulo c){
		return Math.sqrt(Math.pow(origen.getX() - c.getOrigen().getX(), 2) + Math.pow(origen.getY(), c.getOrigen().getY()));
	}

	//Getters and setters:
	public Punto getOrigen() {
		return origen;
	}


	public void setOrigen(Punto origen) {
		this.origen = origen;
	}


	public double getRadio() {
		return dRadio;
	}


	public void setRadio(double radio) {
		this.dRadio = radio;
	}
	
	
	public boolean equals(Circulo c) {
		return ((dRadio == c.getRadio()) && origen.equals(c.getOrigen())) ? true:false;
	}

	@Override
	public String toString() {
		return "Circulo [origen=" + origen + ", radio=" + dRadio + "]";
	}
	
	
	
}
