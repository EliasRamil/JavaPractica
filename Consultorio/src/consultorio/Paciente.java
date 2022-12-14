package consultorio;

public class Paciente {
	//atributos
	private String sNombre;
	private String sApellido;
	private float fEstatura;
	private float fPeso;
	
	//Constructor:
	public Paciente(String sNombre, String sApellido, float fEstatura, float fPeso) {
		this.sNombre = sNombre;
		this.sApellido = sApellido;
		this.fEstatura = fEstatura;
		this.fPeso = fPeso;
	}
	
	//Metodos getters y setters:
	public String getsNombre() {
		return sNombre;
	}
	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}
	public String getsApellido() {
		return sApellido;
	}
	public void setsApellido(String sApellido) {
		this.sApellido = sApellido;
	}
	public float getfEstatura() {
		return fEstatura;
	}
	public void setfEstatura(float fEstatura) {
		this.fEstatura = fEstatura;
	}
	public float getfPeso() {
		return fPeso;
	}
	public void setfPeso(float fPeso) {
		this.fPeso = fPeso;
	}

	@Override
	public String toString() {
		return "Paciente [Nombre=" + sNombre + ", Apellido=" + sApellido + ", Estatura=" + fEstatura + ", Peso="
				+ fPeso + "]";
	}
	
}
