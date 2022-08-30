package modelo;

public class Numero {
	private int iNumero;
	
	//Constructor:
	public Numero(int iNumero) {
		this.iNumero = iNumero;
	}
	
	//Metodos:
	public int sumar(int iNumero) {
		return this.iNumero + iNumero;
	}
	
	public int multiplicar(int iNumero) {
		return this.iNumero * iNumero;
	}
	
	public boolean esPar() {
		return (this.iNumero%2 == 0) ? true:false;
	}
	
	public boolean esPrimo() {
		boolean bResultado = true;
		
		for (int divisor = 2; divisor < iNumero / 2 && bResultado; divisor++) {
		    if ((iNumero % divisor) == 0)
		    {
		        bResultado = false; // Si no es primo, dejamos de buscar.
		    }
		}
		
		return bResultado;
	}
	
	public String convertirAString() {
		return String.valueOf(this.iNumero);
	}
	
	public double convertirDouble() {
		return Double.parseDouble(this.convertirAString());
	}
	
	public double calcularPotencia(double iExponente) {
		return Math.pow(this.convertirDouble(), iExponente);
	}
	
	public String pasarBase2() {
		return Integer.toBinaryString(iNumero);
	}
	
	public int calcularFactorial() {
		int iResultado = 1;
		
		if(this.iNumero > 1) {
			for(int i=0; i < iNumero; i++) {
				iResultado = iResultado * (i+1);
			}
		}
		
		return iResultado;
	}
	
	public int numeroCombinatorio(int iNumero) {
		Numero iNumero1 = new Numero(iNumero);
		Numero iNumero2 = new Numero(this.iNumero - iNumero);
		
		return this.calcularFactorial()/(iNumero1.calcularFactorial()*iNumero2.calcularFactorial());
	}

	//Getters, setters:
	public int getiNumero() {
		return iNumero;
	}

	public void setiNumero(int iNumero) {
		this.iNumero = iNumero;
	}
	
	
	
}
