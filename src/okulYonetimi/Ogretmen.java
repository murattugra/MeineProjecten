package okulYonetimi;

public class Ogretmen extends Kisi{

	String SicilNo;
	String Bolum;
	
	
	public Ogretmen() {
		
	}
	
	
	public Ogretmen(String adSoyad,String kimlikNo,int yas,String sicilNo, String bolum) {
		super();
		SicilNo = sicilNo;
		Bolum = bolum;
		this.adSoyad=adSoyad;
		this.kimlikNo=kimlikNo;
		this.yas=yas;
		
		
		
		
	}
	public String getSicilNo() {
		return SicilNo;
	}
	public void setSicilNo(String sicilNo) {
		SicilNo = sicilNo;
	}
	public String getBolum() {
		return Bolum;
	}
	public void setBolum(String bolum) {
		Bolum = bolum;
	}


	@Override
	public String toString() {
		return "Ogretmen [SicilNo=" + SicilNo + ", Bolum=" + Bolum + ", adSoyad=" + adSoyad + ", kimlikNo=" + kimlikNo
				+ ", yas=" + yas + "]";
	}
	
	
	

}
