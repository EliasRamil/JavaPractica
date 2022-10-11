package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Dispositivo {
	private int iID;
	private String sNombre;
	private String sCodigo;
	private List<Metrica> lstMetricas;
	private Empresa ceEmpresa;
	
	public Dispositivo(int iID, String sNombre, String sCodigo, Empresa ceEmpresa) {
		this.iID = iID;
		this.sNombre = sNombre;
		this.sCodigo = sCodigo;
		this.lstMetricas = new ArrayList<Metrica>();
		this.ceEmpresa = ceEmpresa;
	}

	//Metodos:
	public boolean agregarMetrica(int iValor, LocalDate ldFecha, LocalTime ltHora) {
		return lstMetricas.add(new Metrica(iValor, ldFecha, ltHora));
	}
	
	public Metrica traerMetrica(LocalDate ldFecha, LocalTime ltHora) {
		Metrica cmAuxMetrica = null;
		int i = 0;
		boolean bEncontrada = false;
		
		while (!bEncontrada && i < lstMetricas.size()) {
			
			if(ldFecha.compareTo(lstMetricas.get(i).getLdFecha()) == 0 && ltHora.compareTo(lstMetricas.get(i).getLtHora()) == 0) {
				bEncontrada = true;
				cmAuxMetrica = lstMetricas.get(i);
			}
		
			i++;
		}
		
		return cmAuxMetrica;
	}
	
	public List<Metrica> traeMetricas(LocalDate ldFechaInicial, LocalDate ldFechaFinal) {
		List<Metrica> lstAux = new ArrayList<Metrica>();
		
		for(int i=0; i<lstMetricas.size(); i++) {
			if(ldFechaInicial.compareTo(lstMetricas.get(i).getLdFecha()) <= 0 && ldFechaFinal.compareTo(lstMetricas.get(i).getLdFecha()) >= 0) {
				lstAux.add(lstMetricas.get(i));
			}
		}
		
		return lstAux;
	}
	
	//Basico:
	public int getiID() {
		return iID;
	}

	public String getsNombre() {
		return sNombre;
	}

	public String getsCodigo() {
		return sCodigo;
	}

	public List<Metrica> getLstMetricas() {
		return lstMetricas;
	}

	public Empresa getCeEmpresa() {
		return ceEmpresa;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public void setsCodigo(String sCodigo) {
		this.sCodigo = sCodigo;
	}

	public void setCeEmpresa(Empresa ceEmpresa) {
		this.ceEmpresa = ceEmpresa;
	}

	@Override
	public String toString() {
		String sTexto = "Dispositivo:\n\tID: " + iID + "\n\tNombre: " + sNombre + "\n\tCodigo: " + sCodigo + "\n\tMetricas:\n";
		
		for (int i = 0; i < lstMetricas.size(); i++) {
			sTexto += "\t\t" + lstMetricas.get(i).toString() + "\n";
		}
		
		sTexto += "\t" + ceEmpresa.toString();
		
		return sTexto;
	}
	
	public boolean equals(Dispositivo d) {
		return (this.toString().equalsIgnoreCase(d.toString())) ? true : false;
	}
}
