package modelo;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Servicio> lstServicio;

	public Sistema() {
		this.lstServicio = new ArrayList<Servicio>();
	}
	
	//Metodos:
	public boolean agregarGastronomia(String sCodServicio, double dPorcentajeDescuento, boolean bEnPromocion, String sGastronomia, double dPrecio, int iDiaSemDesc) throws Exception {
		return lstServicio.add(new Gastronomia(sCodServicio, dPorcentajeDescuento, bEnPromocion, sGastronomia, dPrecio, iDiaSemDesc));
	}
	
	
	public Servicio traerServicio(String sCodServico) {
		Servicio csRetorno = null;
		int i = 0;
		boolean bEncontrado = false;
		
		while (i< lstServicio.size() && !bEncontrado) {
			
			if(sCodServico.equals(lstServicio.get(i).getsCodServicio())) {
				bEncontrado = true;
				csRetorno = lstServicio.get(i);
			}
			
			i++;
		}
		
		return csRetorno;
	}
	
	//Basico
	public List<Servicio> getLstServicio() {
		return lstServicio;
	}

	@Override
	public String toString() {
		String sTexto = "Sistema:\n";
		
		for(int i = 0; i< lstServicio.size(); i++) {
			sTexto += "\n" + lstServicio.get(i);
		}
		
		return sTexto;
	}
	
	public boolean equals(Sistema s) {
		return this.toString().equals(s.toString());
	}
}
