package modelo;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Mercancia> lstMercancia;

	//Constructor:
	public Sistema() {
		this.lstMercancia = new ArrayList<Mercancia>();
	}

	//Metodos:
	public Mercancia traerMercancia(String sCodMercancia) {
		Mercancia mercancia = null;
		boolean bEncontrado = false;
		int i = 0;
		
		while (i<lstMercancia.size() && !bEncontrado) {
			
			if(sCodMercancia.equals(lstMercancia.get(i).getsCodMercancia())) {
				bEncontrado = true;
				mercancia = lstMercancia.get(i);
			}
			
			i++;	
		}
		
		return mercancia;
	}
	
	public List<Mercancia> traerMercancias(boolean bEnOferta){
		List<Mercancia> lstResultado = new ArrayList<Mercancia>();
		
		for (int i = 0; i < lstMercancia.size(); i++) {
			Mercancia mercancia = lstMercancia.get(i);
			
			if(mercancia instanceof Servicio) {
				if (bEnOferta == ((Servicio)mercancia).isbEnPromocion()) {
					lstResultado.add(mercancia);
				}
			}else if (mercancia instanceof Produto) {
				if (bEnOferta == ((Produto)mercancia).isbEsDescuentoEn2daUnidad()) {
					lstResultado.add(mercancia);
				}
			}
			
		}
		
		return lstResultado;
	}
	
	private boolean comprobarSiYaExiste(String sCodMercancia) {
		int i = 0;
		boolean bEncontrado = false;
		
		while(i<lstMercancia.size() && !bEncontrado) {
			if(sCodMercancia.equals(lstMercancia.get(i).getsCodMercancia())) bEncontrado = true;
			
			i++;
		}
		
		return bEncontrado;
	}
	
	public boolean agregarProducto(String sCodMercancia, String sProducto, double dPPrecioProducto, double dPorcentajeDescuento, boolean bEsDescuentoEn2daUnidad) throws Exception {
		
		if(comprobarSiYaExiste(sCodMercancia)) throw new Exception("El elemento que desea ingresar ya existe en el sistema.");
		
		return lstMercancia.add(new Produto(sCodMercancia, sProducto, dPPrecioProducto, dPorcentajeDescuento, bEsDescuentoEn2daUnidad));
	}
	
	public boolean agregarServicio(String sCodMercancia, String sServicio, double dPresupuesto, double dPorcentajeDescuento, boolean bEnPromocion) throws Exception {
		
		if(comprobarSiYaExiste(sCodMercancia)) throw new Exception("El elemento que desea ingresar ya existe en el sistema.");
		
		return lstMercancia.add(new Servicio(sCodMercancia, sServicio, dPresupuesto, dPorcentajeDescuento, bEnPromocion));
	}
	
	public String traerMercanciasEnOferta(){
		Sistema s = new Sistema();
		
		s.setLstMercancia(traerMercancias(true));
		
		return s.toString();
	}
	
	//Basico:
	public List<Mercancia> getLstMercancia() {
		return lstMercancia;
	}
	
	private void setLstMercancia(List<Mercancia> lstMercancia) {
		this.lstMercancia = lstMercancia;
	}

	@Override
	public String toString() {
		String sTexto = "Sistema:";
		
		for(int i=0; i<lstMercancia.size(); i++) {
			sTexto += "\n\n\t" + lstMercancia.get(i).toString();
		}
		
		return sTexto;
	}
	
	public boolean equals(Sistema s) {
		return this.toString().equals(s.toString());
	}
}
