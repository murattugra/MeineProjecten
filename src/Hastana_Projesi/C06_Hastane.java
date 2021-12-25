package Hastana_Projesi;

public class C06_Hastane extends C02_VeriBankasi{

	private C05_Doktor doktor;
	private C04_Hasta hasta;
	
	C05_Doktor doktor1 = new C05_Doktor();
	C04_Hasta hasta1 = new C04_Hasta();

	
	
	public C05_Doktor getDoktor() {
		return doktor;
	}
	public void setDoktor(C05_Doktor doktor) {
		this.doktor = doktor;
	}
	public C04_Hasta getHasta() {
		return hasta;
	}
	public void setHasta(C04_Hasta hasta) {
		this.hasta = hasta;
	}
	
	
	
	
	
}
