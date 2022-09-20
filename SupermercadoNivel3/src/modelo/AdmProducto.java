package modelo;

import java.util.ArrayList;
import java.util.List;


public class AdmProducto {
	private List<Producto> lstProducto;

	//Constructor:
	public AdmProducto() {
		lstProducto = new ArrayList<Producto>();
	}

	//Metodos:
	public boolean agregarProducto(String sProducto, float fPrecio) {
		int iNumero;
		
		if(lstProducto.size() != 0) {
			iNumero = 1;
		}else {
			iNumero = lstProducto.get(lstProducto.size() - 1).getiIDProducto() + 1;
		}
		
		return lstProducto.add(new Producto(iNumero, sProducto, fPrecio));
	}
	
	public Producto traerProducto(int iIDProducto) {
		Producto producto = null;
		
		for (int i = 0; i < lstProducto.size(); i++) {
			if (lstProducto.get(i).getiIDProducto() == iIDProducto) {
				producto = lstProducto.get(i);
			}
		}
		
		return producto;
	}
	
	public boolean eliminarProducto(int iIDProducto) {
		boolean bEliminado = false;
		
		for (int i = 0; i < lstProducto.size(); i++) {
			if (lstProducto.get(i).getiIDProducto() == iIDProducto) {
				lstProducto.remove(i);
				bEliminado = true;
			}
		}
		
		return bEliminado;
	}
	
	//Basico:
	public List<Producto> getLstProducto() {
		return lstProducto;
	}

	@Override
	public String toString() {
		String sTexto = "Lista de Productos:\n";
		
		for (int i = 0; i < lstProducto.size(); i++) {
			sTexto += "\t" + lstProducto.get(i).toString() + "\n";
		}
		
		return sTexto;
	}

	public boolean eaequals(AdmCarrito a) {
		return (this.toString().equalsIgnoreCase(a.toString())) ? true : false;
	}
}
