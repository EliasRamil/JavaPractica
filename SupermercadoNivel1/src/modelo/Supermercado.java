package modelo;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private List<Producto> gondola;
	
	public Supermercado(String sPrimerProducto, float fPrecioPrimerProducto) {
		gondola = new ArrayList<Producto>();
		
		gondola.add(new Producto(1, sPrimerProducto, fPrecioPrimerProducto));
	}
	
	//Metodos:
	public boolean agregarProducto(String sProducto, float fPrecio) throws Exception {
		for (int i = 0; i < gondola.size(); i++) {
			
			if( gondola.get(i).getsNombreProducto().equalsIgnoreCase(sProducto) )
				throw new Exception("El producto \"" + sProducto + "\" ya existe en la gondola.");
				
		}
		
		return gondola.add(new Producto(gondola.size() + 1, sProducto, fPrecio));
	}
	
	public Producto traerProducto(int iIDProducto) {
		Producto producto = null;
		
		for (int i = 0; i < gondola.size(); i++) {
			if(iIDProducto == gondola.get(i).getiIDProducto()) {
				producto = gondola.get(i);
			}
		}
		
		return producto;
	}
	
	public boolean modificarProducto(int iIDProducto, String sProducto, float fPrecio) throws Exception {
		boolean bModificado = false;
		Producto producto = traerProducto(iIDProducto);

		if (producto != null) {
			producto.setfPrecio(fPrecio);
			producto.setsNombreProducto(sProducto);
			bModificado = true;
		} else {
			throw new Exception("El producto con id " + iIDProducto + " no existe.");
		}

		return bModificado;
	}
	
	public boolean eliminarProducto(int iIDProducto) throws Exception {
		boolean bEliminado = false;
		Producto producto = traerProducto(iIDProducto);
		
		if (producto != null && gondola.size() > 1) {
			bEliminado = true;
			gondola.remove(iIDProducto-1);
			
			for(int i = producto.getiIDProducto(); i<=gondola.size(); i++) {
				if(gondola.get(i).getiIDProducto() != i) {
					gondola.get(i).setiIDProducto(i);
				}
			}
			
		} else if (gondola.size() == 1) {
			throw new Exception("No se puede eliminar el producto de ID \"" + iIDProducto + "\" ya que es el unico archivo minimo y obligatorio que queda.");
		} else {
			throw new Exception("No se puede eliminar el producto de ID \"" + iIDProducto + "\" ya que no existe dicho elemento.");
		}
		
		return bEliminado;
	}
	
	//Funciones basicas:
	public List<Producto> getGondola() {
		return gondola;
	}	

	@Override
	public String toString() {
		String sTexto = "Productos en la Gondola:\n";
		
		for (int i = 0; i < gondola.size(); i++) {
			sTexto += "\t" + (i+1) + ") " + gondola.get(i).toString() + "\n";
		}
		
		return sTexto;
	}
	
	public boolean equals(Supermercado s) {
		return this.toString().equalsIgnoreCase(s.toString());
	}
	
}
