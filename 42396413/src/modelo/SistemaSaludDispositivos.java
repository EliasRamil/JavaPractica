package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaSaludDispositivos {
	private List<Empresa> lstEmpresas;
	private List<Dispositivo> lstDispositivos;
	
	public SistemaSaludDispositivos() {
		this.lstEmpresas = new ArrayList<Empresa>();
		this.lstDispositivos = new ArrayList<Dispositivo>();
	}

	//Metodos:
	public boolean agregarEmpresa(String sNombre) {
		int iNum = 1;
		
		if(lstEmpresas.size() > 0) {
			iNum = lstEmpresas.get(lstEmpresas.size() - 1).getiID() + 1;
		}
		
		return lstEmpresas.add(new Empresa(iNum, sNombre));
	}
	
	public Empresa traerEmpresa(String sNombre) {
		Empresa  ceAux= null;
		boolean bEncontrado = false;
		int i = 0;
		
		while (!bEncontrado && i < lstEmpresas.size()) {
			if(sNombre.equalsIgnoreCase(lstEmpresas.get(i).getsNombre())) {
				bEncontrado = true;
				ceAux = lstEmpresas.get(i);
			}
			
			i++;
		}
		
		return ceAux;
	}
	
	public boolean agregarDispositivo(String sNombre, String sCodigo, Empresa ceEmpresa) throws Exception {
		int iNum = 0;
		/*boolean bNoEsValido = false;
		
		if((sCodigo.charAt(0) == 'A' || sCodigo.charAt(0) == 'B') && sCodigo.length() == 5) {
			
			int iAux1 = 1;
			boolean bNumero = true;
			while (bNumero) {
				if(iAux1 < 6 && esLetra(sCodigo.charAt(iAux1))) {
					bNumero = false;
				}
				iAux1++;
			}
			
			if (!bNumero) {
				bNoEsValido = true;
			}
			
			if(!bNoEsValido) {
				int iTemp = 0;
				
				for(int i=1; i<sCodigo.length()-1; i++) {
					System.out.println(iTemp);
					iTemp += ((int) sCodigo.charAt(i+1));
				}
				
				if(sCodigo.charAt(0) == 'A' && iTemp%2 != 0) {
					bNoEsValido = true;
				}else if(sCodigo.charAt(0) == 'B' && iTemp%2 == 0){
					bNoEsValido = true;
				}
			}
			
			
		}else {
		bNoEsValido = true;
	}
		
		if(!bNoEsValido) {
			if(lstDispositivos.size() > 0) {
				iNum = lstDispositivos.get(lstDispositivos.size() -1).getiID() + 1;
			}
		}else {
			throw new Exception("El Codido ingresado no es valido");
		}*/
		
		if(lstDispositivos.size() > 0) {
				iNum = lstDispositivos.get(lstDispositivos.size() -1).getiID() + 1;
			
		}
		
		return lstDispositivos.add(new Dispositivo(iNum, sNombre, sCodigo, ceEmpresa));
	}
	
	public Dispositivo traerDispositivo(String sCodigo) {
		Dispositivo  cdAux= null;
		boolean bEncontrado = false;
		int i = 0;
		
		while (!bEncontrado && i < lstDispositivos.size()) {
			if(sCodigo.equalsIgnoreCase(lstDispositivos.get(i).getsCodigo())) {
				bEncontrado = true;
				cdAux = lstDispositivos.get(i);
			}
			
			i++;
		}
		
		return cdAux;
	}
	
	public List<Metrica> traerMetricas(Dispositivo dispositivo, LocalDate ldFechaInicial, LocalDate ldFechaFinal, int iMenorAValor) {
		List<Metrica> lstAux = new ArrayList<Metrica>();
		
		for(int i=0; i<dispositivo.getLstMetricas().size(); i++) {
			if(dispositivo.getLstMetricas().get(i).getiValor() < iMenorAValor && ldFechaInicial.compareTo(dispositivo.getLstMetricas().get(i).getLdFecha()) <= 0 && ldFechaFinal.compareTo(dispositivo.getLstMetricas().get(i).getLdFecha()) >= 0) {
				lstAux.add(dispositivo.getLstMetricas().get(i));
			}
		}
		
		return lstAux;
	}
	
	
	//Basico:
	public List<Empresa> getLstEmpresas() {
		return lstEmpresas;
	}

	public List<Dispositivo> getLstDispositivos() {
		return lstDispositivos;
	}

	@Override
	public String toString() {
		String sTexto = "Sistema de Salud de Dispositivos:\n\tEmpresas:\n";
		
		for (int i = 0; i < lstEmpresas.size(); i++) {
			sTexto += "\t\t" + lstEmpresas.get(i).toString() + "\n";
		}
		
		sTexto += "\n\tDispositivos:\n";
		
		for (int i = 0; i < lstDispositivos.size(); i++) {
			sTexto += "\t\t" + lstDispositivos.get(i).toString() + "\n";
		}
		
		return sTexto;
	}
	
	public boolean equals(SistemaSaludDispositivos s) {
		return this.toString().equalsIgnoreCase(s.toString());
	}
}
