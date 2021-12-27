package OnlineBanking;

public class Kullanici01 {

	String isim="Ali";
	String soyIsim="Can";
	String dogumTarih[]= {"10","9","1990"};
	String tc="123456789";
	String sifre="1234";
	String iban="TR123456789";
	
	double hesapMiktar=5000;
	double krediBorcu=15000;
	double krediEkstre=700;
	double kkBorcu=3620;
	double kkEkstre=310;
	int kalankkTaksitSayisi=11;
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
	public double getKrediEkstre() {
		return krediEkstre;
	}
	public double getKkEkstre() {
		return kkEkstre;
	}

	
	
	
	
	
	
	
	
	
}
