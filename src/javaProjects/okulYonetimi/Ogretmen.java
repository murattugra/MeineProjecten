package javaProjects.okulYonetimi;

public class Ogretmen extends Kisi{

	
	private String sicilNo;
	private String bolum;
	
	
	
	public Ogretmen() {
		
	}
	
	
	public Ogretmen(String adSoyad,int yas,String sicilNo, String bolum) {
		super();
		this.sicilNo = sicilNo;
		this.bolum = bolum;
	}
	public String getSicilNo() {
		return sicilNo;
	}
	public void setSicilNo(String sicilNo) {
		this.sicilNo = sicilNo;
	}
	public String getBolum() {
		return bolum;
	}
	public void setBolum(String bolum) {
		this.bolum = bolum;
	}
	
	
}
   