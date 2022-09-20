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
	private Cliente cliente;
	
	//Constructor:
	public Carrito(int iIDCarrito, LocalDate fecha, LocalTime hora, Cliente cliente) {
		super();
		this.iIDCarrito = iIDCarrito;
		this.fecha = fecha;
		this.hora = hora;
		this.lstItem = new ArrayList<ItemCarrito>();
		this.cliente = cliente;
	}

	// Metodos:
	public boolean agregarItem(Producto producto, int iCantidad) {
		int iNumero;

		if (lstItem.size() != 0) {
			iNumero = 1;
		} else {
			iNumero = lstItem.get(lstItem.size() - 1).getiIDItem() + 1;
		}
		
		return lstItem.add(new ItemCarrito(iNumero, producto, iCantidad));
	}
	
	//Funciones:
	public int getiIDCarrito() {
		return iIDCarrito;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
