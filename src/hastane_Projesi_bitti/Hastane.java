package hastane_Projesi_bitti;

public class Hastane extends VeriBankasi{

	
	private String isim;
	private String soyIsim;
	private int hastaID;
	private Durum hastaDurumu;

	
	
	
	
	Doktor doktor = new Doktor();
	Hasta hasta = new Hasta();
	
	
	
	
	
	
	
	
	
	

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyIsim() {
		return soyIsim;
	}

	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}

	public int getHastaID() {
		return hastaID;
	}

	public void setHastaID(int hastaID) {
		this.hastaID = hastaID;
	}

	public Durum getHastaDurumu() {
		return hastaDurumu;
	}

	public void setHastaDurumu(Durum hastaDurumu) {
		this.hastaDurumu = hastaDurumu;
	}

	public Doktor getDoktor() {
		return doktor;
	}

	public void setDoktor(Doktor doktor) {
		this.doktor = doktor;
	}

	public Hasta getHasta() {
		return hasta;
	}

	public void setHasta(Hasta hasta) {
		this.hasta = hasta;
	}
	
	
	
	
}
