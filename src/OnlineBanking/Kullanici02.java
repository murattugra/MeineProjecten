package OnlineBanking;

public class Kullanici02 {

	String isim="Mehmet";
	String soyIsim="Kerem";
	String dogumTarih[]= {"5","11","1985"};
	String tc="987654321";
	String sifre="4321";
	String iban="TR987654321";
	
	double hesapMiktar=7500;
	double krediBorcu=17500;
	double krediEkstre=650;
	double kkBorcu=2500;
	double kkEkstre=500;
	int kalankkTaksitSayisi=5;
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

	public String getTc() {
		return tc;
	}
	public void setTc(String tc) {
		this.tc = tc;
	}


	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	public double getHesapMiktar() {
		return hesapMiktar;
	}
	public void setHesapMiktar(double hesapMiktar) {
		this.hesapMiktar = hesapMiktar;
	}
	public double getKrediBorcu() {
		return krediBorcu;
	}
	public void setKrediBorcu(double kredeiBorcu) {
		this.krediBorcu = kredeiBorcu;
	}
	public double getKkBorcu() {
		return kkBorcu;
	}
	public void setKkBorcu(double kkBorcu) {
		this.kkBorcu = kkBorcu;
	}
	public String getIban() {
		return iban;
	}
	
	public int getKkTaksitSayisi() {
		return kalankkTaksitSayisi;
	}
	public void setKkTaksitSayisi(int kkTaksitSayisi) {
		this.kalankkTaksitSayisi = kkTaksitSayisi;
	}
	public int getKalankkTaksitSayisi() {
		return kalankkTaksitSayisi;
	}
	public void setKalankkTaksitSayisi(int kalankkTaksitSayisi) {
		this.kalankkTaksitSayisi = kalankkTaksitSayisi;
	}
	public double getKrediEkstre() {
		return krediEkstre;
	}
	public double getKkEkstre() {
		return kkEkstre;
	}
	
	
	
	
}
