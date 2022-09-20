package modelo;

import java.time.LocalDate;
import static modelo.Funciones.*;

public class Tarea {
	private int iIDTarea;
	private String sTarea;
	private LocalDate ldFechaInicio;
	private LocalDate ldFechaFin;
	private Empleado ceResponsable;
	private int iCantidadHorasDiarias;
	private boolean bHabil;
	
	public Tarea(int iIDTarea, String sTarea, LocalDate ldFechaInicio, LocalDate ldFechaFin, Empleado ceResponsable,
			int iCantidadHorasDiarias, boolean bHabil) {
		this.iIDTarea = iIDTarea;
		this.sTarea = sTarea;
		
		if(ldFechaFin.isAfter(ldFechaInicio)) {
			this.ldFechaInicio = ldFechaInicio;
			this.ldFechaFin = ldFechaFin;
		}else {
			this.ldFechaInicio = ldFechaFin;
			this.ldFechaFin = ldFechaInicio;
		}
		
		this.ceResponsable = ceResponsable;
		this.iCantidadHorasDiarias = iCantidadHorasDiarias;
		this.bHabil = bHabil;
	}

	//Metodos:
	public double calcularJornal() {
		double dResultado = iCantidadHorasDiarias * ceResponsable.getdValorHora();
		
		if(!bHabil) {
			dResultado *= 1.5;
		}
		
		return dResultado;
	}
	
	public int calcularCantidadDeDiasTrabajados(int iMes, int iAnio) {
		return cantidadDeDiasDeUnPeriodoTranscurridoEnUnMesEnDiasHabilesONoHabiles(ldFechaInicio, ldFechaFin, iMes, iAnio, bHabil);
	}
	
	public double calcularHonorarios(int iMes, int iAnio) {
		return calcularJornal() * calcularCantidadDeDiasTrabajados(iMes, iAnio);
	}
	
	//Basico:
	public int getiIDTarea() {
		return iIDTarea;
	}

	public String getsTarea() {
		return sTarea;
	}

	public void setsTarea(String sTarea) {
		this.sTarea = sTarea;
	}

	public LocalDate getLdFechaInicio() {
		return ldFechaInicio;
	}

	public void setLdFechaInicio(LocalDate ldFechaInicio) {
		this.ldFechaInicio = ldFechaInicio;
	}

	public LocalDate getLdFechaFin() {
		return ldFechaFin;
	}

	public void setLdFechaFin(LocalDate ldFechaFin) {
		this.ldFechaFin = ldFechaFin;
	}

	public Empleado getCeResponsable() {
		return ceResponsable;
	}

	public void setCeResponsable(Empleado ceResponsable) {
		this.ceResponsable = ceResponsable;
	}

	public int getiCantidadHorasDiarias() {
		return iCantidadHorasDiarias;
	}

	public void setiCantidadHorasDiarias(int iCantidadHorasDiarias) {
		this.iCantidadHorasDiarias = iCantidadHorasDiarias;
	}

	public boolean isbHabil() {
		return bHabil;
	}

	public void setbHabil(boolean bHabil) {
		this.bHabil = bHabil;
	}

	@Override
	public String toString() {
		return "Tarea [ID= " + iIDTarea + ", Tarea= " + sTarea + ", Fecha Inicio= " + ldFechaInicio
				+ ", Fecha Fin= " + ldFechaFin + ", Responsable= " + ceResponsable.toString() + ", Cantidad Horas Diarias= "
				+ iCantidadHorasDiarias + ", Habil= " + bHabil + "]";
	}
	
	public boolean equals(Tarea t) {
		return this.toString().equalsIgnoreCase(t.toString());
	}
}
