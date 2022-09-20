package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Empleado> lstEmpleados;
	private List<Tarea> lstTareas;
	
	public Sistema() {
		lstEmpleados = new ArrayList<Empleado>();
		lstTareas = new ArrayList<Tarea>();
	}
	
	//Metodos:
	public Empleado traerEmpleado(String sNroLegajo) {
		Empleado ceRetornadoEmpleado = null;
		boolean bEncontrado = false;
		
		int i = 0;
		while (i < lstEmpleados.size() && !bEncontrado) {
			
			if(sNroLegajo.equalsIgnoreCase(lstEmpleados.get(i).getsNroLegajo())) {
				bEncontrado = true;
				ceRetornadoEmpleado = lstEmpleados.get(i);
			}
			
			i++;
		}
		
		return ceRetornadoEmpleado;
	}
	
	public Tarea traerTarea(int iID) {
		Tarea ctTarea = null;
		boolean bEncontrado = false;
		
		int i = 0;
		while (i < lstTareas.size()  && !bEncontrado) {
			
			if(iID == lstTareas.get(i).getiIDTarea()) {
				bEncontrado = true;
				ctTarea = lstTareas.get(i);
			}
			
			i++;
		}
		
		return ctTarea;
	}
	
	public boolean agregarEmpleado(String apellido, String nombre, String nroLegajo, double valorHora) {
		return lstEmpleados.add(new Empleado(apellido, nombre, nroLegajo, valorHora));
	}

	public boolean agregarTarea(String tarea,LocalDate fechaInicio,LocalDate fechaFin, Empleado responsable, int cantHorasDiarias, boolean habil) {
		int iID = 1;
		
		if(lstTareas.size() > 0) {
			iID = lstTareas.get(lstTareas.size() - 1).getiIDTarea() + 1;
		}
	
		return lstTareas.add(new Tarea(iID, tarea, fechaInicio, fechaFin, responsable, cantHorasDiarias, habil));
	}
	
	//Basico:
	public List<Empleado> getLstEmpleados() {
		return lstEmpleados;
	}

	public List<Tarea> getLstTareas() {
		return lstTareas;
	}

	@Override
	public String toString() {
		String sTexto = "Sistema: \n\tLista de empleados:\n";
		
		for (int i = 0; i < lstEmpleados.size(); i++) {
			sTexto += "\t\t" + lstEmpleados.get(i).toString() + "\n";
		}
		
		sTexto += "\n\tLista de tareas:\n";
		
		for (int i = 0; i < lstTareas.size(); i++) {
			sTexto += "\t\t" + lstTareas.get(i).toString() + "\n";
		}
		
		return sTexto;
	}
	
	public boolean equals(Sistema s) {
		return this.toString().equalsIgnoreCase(s.toString());
	}
}
