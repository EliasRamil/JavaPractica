package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
	private int iIDCarrito;
	private LocalDate fecha;
	private LocalTime hora;
	private List<ItemCarrito> lstItem;
	
	public Carrito(int iIDCarrito, LocalDate fecha, LocalTime hora, Producto producto, int iCantidad) {
		this.iIDCarrito = iIDCarrito;
		this.fecha = fecha;
		this.hora = hora;
		this.lstItem = new ArrayList<ItemCarrito>();
		
		lstItem.add(new ItemCarrito(1, producto, iCantidad));
	}
	
	//Metodos:
	

	//Basico
	public int getiIDCarrito() {
		return iIDCarrito;
	}

	protected void setiIDCarrito(int iIDCarrito) {
		this.iIDCarrito = iIDCarrito;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public List<ItemCarrito> getLstItem() {
		return lstItem;
	}

	public void setLstItem(List<ItemCarrito> lstItem) {
		this.lstItem = lstItem;
	}
	
	
	
}
