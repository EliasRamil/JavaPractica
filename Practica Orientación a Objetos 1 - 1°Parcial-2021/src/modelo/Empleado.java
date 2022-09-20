package modelo;

public class Empleado {
	private String sApellido;
	private String sNombre;
	private String sNroLegajo;
	private double dValorHora;
	
	public Empleado(String sApellido, String sNombre, String sNroLegajo, double dValorHora) {
		this.sApellido = sApellido;
		this.sNombre = sNombre;
		this.sNroLegajo = sNroLegajo;
		this.dValorHora = dValorHora;
	}

	public String getsApellido() {
		return sApellido;
	}

	public void setsApellido(String sApellido) {
		this.sApellido = sApellido;
	}

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public String getsNroLegajo() {
		return sNroLegajo;
	}

	public double getdValorHora() {
		return dValorHora;
	}

	public void setdValorHora(double dValorHora) {
		this.dValorHora = dValorHora;
	}

	@Override
	public String toString() {
		return "Empleado [Apellido= " + sApellido + ", Nombre= " + sNombre + ", NroLegajo= " + sNroLegajo
				+ ", ValorHora= " + dValorHora + "]";
	}
	
	public boolean equals(Empleado e) {
		return (sApellido.equalsIgnoreCase(e.getsApellido()) && sNombre.equalsIgnoreCase(e.getsNombre()) && sNroLegajo.equalsIgnoreCase(e.getsNroLegajo()) && dValorHora == e.getdValorHora()) ? true : false;
	}
}
