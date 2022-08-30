package modelo;

public class Punto {
	private double dX;
	private double dY;
	
	
	public Punto(double dX, double dY) {
		this.dX = dX;
		this.dY = dY;
	}

	
	//Getters and setters:
	public double getX() {
		return dX;
	}


	public void setX(double dX) {
		this.dX = dX;
	}


	public double getY() {
		return dY;
	}


	public void setY(double dY) {
		this.dY = dY;
	}
	
	public boolean equals(Punto p){
		return ((dX == p.getX()) && (dY == p.getY())) ? true:false;
	}

	//toStrings:
	@Override
	public String toString() {
		return "Punto [X=" + dX + ", Y=" + dY + "]";
	}
	

	
}
