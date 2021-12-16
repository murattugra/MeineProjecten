package okulYonetimi;

public class Ogrenci extends Kisi{

	String numara;
	String sinif;
	
	
	public Ogrenci(){
		
	}
	
	public Ogrenci(String adSoyad,String kimlikNo,int yas,String numara, String sinif) {
		super();
		this.numara = numara;
		this.sinif = sinif;
		this.adSoyad=adSoyad;
		this.kimlikNo=kimlikNo;
		this.yas=yas;
		
	}
	public String getNumara() {
		return numara;
	}
	public void setNumara(String numara) {
		this.numara = numara;
	}
	public String getSinif() {
		return sinif;
	}
	public void setSinif(String sinif) {
		this.sinif = sinif;
	}

	@Override
	public String toString() {
		return "Ogrenci [numara=" + numara + ", sinif=" + sinif + ", adSoyad=" + adSoyad + ", kimlikNo=" + kimlikNo
				+ ", yas=" + yas + "]";
	}
	
	
	

}
