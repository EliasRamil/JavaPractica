package test;

import consultorio.Medico;
import consultorio.Paciente;

public class TestConsultorio {

	public static void main(String[] args) {

		Paciente[] vectorPacientes = new Paciente[3];

		vectorPacientes[0] = new Paciente("José", "Pérez", 1.80f, 85f);
		vectorPacientes[1] = new Paciente("Jorge", "Fernández", 1.90f, 90f);
		vectorPacientes[2] = new Paciente("Luciana", "Sachez", 1.62f, 79f);

		Medico medico1 = new Medico("Pedro", "Lopez", "Clinico", vectorPacientes);
		
		System.out.println(medico1.toString());
		
		System.out.println("\nDatos:\nPedo promedio: " + medico1.traerPromedioPeso());
		System.out.println("Paciente de mayor estatura: " + medico1.traerPacienteMayorEstatura().toString());
		System.out.println("Paciente de menor IMC: " + medico1.traerPacienteMayorEstatura().toString() + " con un IMC de " + medico1.calcularIMC(medico1.traerPacienteMayorEstatura()));
		
	}
}
