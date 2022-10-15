package modelo;

public abstract class Mercancia {
	protected String sCodMercancia;

	//Constructor:
	public Mercancia(String sCodMercancia) throws Exception {
		setsCodMercancia(sCodMercancia);
	}

	//Metodos:
	public abstract double calcularPrecioFinal();
	
	//Basico:
	public String getsCodMercancia() {
		return sCodMercancia;
	}
	
	private void setsCodMercancia(String sCodMercancia) throws Exception {
		
		if(sCodMercancia.length() != 7) {
			throw new Exception("El codigo ingresado no es valido");
		}
		
		this.sCodMercancia = sCodMercancia;
		
	}

	@Override
	public String toString() {
		return "Codigo: " + sCodMercancia;
	}

	public boolean equals(Mercancia m) {
		return sCodMercancia.equals(m.sCodMercancia);
	}
}
