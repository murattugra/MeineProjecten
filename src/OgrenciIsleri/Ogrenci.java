package OgrenciIsleri;

import java.util.ArrayList;
import java.util.List;

public class Ogrenci {

	String numara;
	
	String adi;
	String soyadi;
	double ortalama;
	
	static List<Ogrenci> lst=new ArrayList<Ogrenci>();
	
	public Ogrenci() {
		
	}
	
	
	public Ogrenci(String numara, String adi, String soyadi, double ortalama) {
		super();
		this.numara = numara;
		this.adi = adi;
		this.soyadi = soyadi;
		this.ortalama = ortalama;
	}
	public String getNumara() {
		return numara;
	}
	public void setNumara(String numara) {
		this.numara = numara;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public double getOrtalama() {
		return ortalama;
	}
	public void setOrtalama(double ortalama) {
		this.ortalama = ortalama;
	}


	@Override
	public String toString() {
		return " Ogrenci numara= " + numara +"\t"+ " adi=" + adi +"\t"+ " soyadi=" + soyadi +"\t"+ " ortalama=" + ortalama +"\n";
	}
	
	
	
	
	
	
	
	
	
}
