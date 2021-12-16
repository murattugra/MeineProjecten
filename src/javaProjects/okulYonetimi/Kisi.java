package javaProjects.okulYonetimi;

public class Kisi {

	protected String adSoyad;
	protected String  kimlikNo;
	protected int yas;

	public Kisi() {
		
	}
	
	public Kisi(String adSoyad, int yas) {
		super();
		this.adSoyad = adSoyad;
		this.yas = yas;
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public String getKimlikNo() {
		return kimlikNo;
	}

	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo = kimlikNo;
	}
	
	
	
}
