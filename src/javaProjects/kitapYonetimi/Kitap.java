package javaProjects.kitapYonetimi;

public class Kitap {

	int no;
	private String kitapAdi;
	private String yazarAdi;
	private int yayinyili;
	private double fiyat;
	
	Kitap(){
		
	}
	
	public Kitap(int no, String kitapAdi, String yszrAdi, int yayinyili, double fiyat) {
		super();
		this.no = no;
		this.kitapAdi = kitapAdi;
		this.yazarAdi = yszrAdi;
		this.yayinyili = yayinyili;
		this.fiyat = fiyat;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getKitapAdi() {
		return kitapAdi;
	}
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	public String getYszrAdi() {
		return yazarAdi;
	}
	public void setYszrAdi(String yszrAdi) {
		this.yazarAdi = yszrAdi;
	}
	public int getYayinyili() {
		return yayinyili;
	}
	public void setYayinyili(int yayinyili) {
		this.yayinyili = yayinyili;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	@Override
	public String toString() {		//bu metot objenin field lerini yazdirir
		return "Kitap [no=" + no + 
				", kitapAdi=" + kitapAdi +
				", yazaAdi=" + yazarAdi + 
				", yayinyili=" + yayinyili
				+ ", fiyat=" + fiyat + "]";
	}
	
		
}
