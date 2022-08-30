package consultorio;

public class Medico {
	private String sNombre;
	private String sApellido;
	private String sEspecialidad;
	private Paciente[] pPacientesFrecuentes;

	// Metodo constructor:
	public Medico(String sNombre, String sApellido, String sEspecialidad, Paciente[] PacientesFrecuentes) {
		this.sNombre = sNombre;
		this.sApellido = sApellido;
		this.sEspecialidad = sEspecialidad;
		this.pPacientesFrecuentes = PacientesFrecuentes;
	}

	// Metodos:
	public float calcularIMC(Paciente paciente) {
		return (float) ((double) paciente.getfPeso() / Math.pow((double) paciente.getfEstatura(), 2d));
	}

	public double traerPromedioPeso() {
		double dPromedio = 0;

		for (int i = 0; i < pPacientesFrecuentes.length; i++) {
			dPromedio += pPacientesFrecuentes[i].getfPeso();
		}

		return dPromedio / pPacientesFrecuentes.length;
	}
	
	public Paciente traerPacienteMayorEstatura() {
		Paciente retornoPaciente = pPacientesFrecuentes[0];
		
		for(int i=0; i<pPacientesFrecuentes.length; i++) {
			if(retornoPaciente.getfEstatura() < pPacientesFrecuentes[i].getfEstatura()) {
				retornoPaciente = pPacientesFrecuentes[i];
			}
		}
		
		return retornoPaciente;
	}
	
	public Paciente traerMenorIMC() {
		Paciente retornoPaciente = pPacientesFrecuentes[0];
		
		for(int i=0; i<pPacientesFrecuentes.length; i++) {
			if(this.calcularIMC(retornoPaciente) > this.calcularIMC(pPacientesFrecuentes[i])) {
				retornoPaciente = pPacientesFrecuentes[i];
			}
		}
		
		return retornoPaciente;
	}

	// Getters and setters
	public String getsNombre() {
		return sNombre;
	}

	public String getsEspecialidad() {
		return sEspecialidad;
	}

	public void setsEspecialidad(String sEspecialidad) {
		this.sEspecialidad = sEspecialidad;
	}

	public String getsApellido() {
		return sApellido;
	}

	public void setsApellido(String sApellido) {
		this.sApellido = sApellido;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public Paciente[] getpPacientesFrecuentes() {
		return pPacientesFrecuentes;
	}

	public void setpPacientesFrecuentes(Paciente[] pPacientesFrecuentes) {
		this.pPacientesFrecuentes = pPacientesFrecuentes;
	}

	@Override
	public String toString() {
		String sDatos = "Medico: " + this.sApellido + " " + this.sNombre + " - Especialidad: " + this.sEspecialidad
				+ "\nPacientes:\n";

		for (int i = 0; i < pPacientesFrecuentes.length; i++) {

			sDatos += (i + 1) + ") " + pPacientesFrecuentes[i].toString() + "\n";

		}

		return sDatos;
	}
}
