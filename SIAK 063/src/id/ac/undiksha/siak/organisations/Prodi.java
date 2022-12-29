package id.ac.undiksha.siak.organisations;

import id.ac.undiksha.siak.entities.*;
public class Prodi {

	private String NamaProdi;
	private String KodeProdi;
	private Dosen KoordinatorProdi;
	
	
	
	public Prodi(String namaProdi, String kodeProdi, Dosen koordinatorProdi) {
		super();
		NamaProdi = namaProdi;
		KodeProdi = kodeProdi;
		KoordinatorProdi = koordinatorProdi;
	}
	
	public String getNamaProdi() {
		return NamaProdi;
	}
	public void setNamaProdi(String namaProdi) {
		NamaProdi = namaProdi;
	}
	public String getKodeProdi() {
		return KodeProdi;
	}
	public void setKodeProdi(String kodeProdi) {
		KodeProdi = kodeProdi;
	}
	public Dosen getKoordinatorProdi() {
		return KoordinatorProdi;
	}
	public void setKoordinatorProdi(Dosen koordinatorProdi) {
		KoordinatorProdi = koordinatorProdi;
	}
	
	
	
}
