package OnlineBanking;

import java.util.Scanner;

public class Runner {

	static Scanner scan = new Scanner(System.in);
	static Kullanici01 obj1 = new Kullanici01();
	static Kullanici02 obj2 = new Kullanici02();

	public static void main(String[] args) {

		boolean onay = false;
		do {

			System.out.println("***Online Bankacilik Islemlerine Hosgeldiniz***");
			System.out.println("Lutfen TC kimlik numaranizi giriniz");
			String tc = scan.next();
			System.out.println("Lutfen sifrenizi giriniz");
			String sifre = scan.next();

			if (tc.equals(obj1.tc) && sifre.equals(obj1.sifre) || tc.equals(obj2.tc) && sifre.equals(obj2.sifre)) {
				kullaniciEkrani(tc);
				onay = true;
			} else {
				System.out.println("Tc nizi yada sifrenizi kontrol ediniz");
			}

		} while (onay != true);

	}

	private static void kullaniciEkrani(String tc) {
		System.out.println("****Kullanici Islemlerine Hosgeldiniz****");
		System.out.println("1->Hesap Durumu Goruntuleme\n2->Sifre Degistirme\n3->Para Transferi\n"
				+ "4-KrediKarti Ekstresi odeme\n5-Kredi Taksiti odeme\nQ->Cikis");
		String secim = scan.next();

		switch (secim) {
		case "1":
			hesapDurumu(tc);
			break;
		case "2":
			sifreDegisme(tc);
			kullaniciEkrani(tc);
			break;

		case "3":
			paraTrensferi(tc);
			kullaniciEkrani(tc);
			break;
		case "4":
			kkEkstreOdeme(tc);
			kullaniciEkrani(tc);
			break;
		case "5":

			break;
		case "Q":
			cikis();
			break;

		default:
			break;
		}

	}

	private static void kkEkstreOdeme(String tc) {
	int tcindex = 0;
		for (int i = 0; i < Banka.tcler.size(); i++) {
			if (tc.equals(Banka.tcler.get(i))) {
				tcindex=i;
			} 

		}
		double minOdeme=Banka.kkEkstresi.get(tcindex)/3;
		System.out.println("Bu ayki KK Ekstreniz "+Banka.kkEkstresi.get(tcindex)+
							"\nOdemeniz Gereken minimum Tutar "+minOdeme);
		System.out.println("Lutfen odemek istediginiz miktari giriniz");
		double miktar=scan.nextDouble();
		if (miktar==Banka.kkEkstresi.get(tcindex)) {
			System.out.println("Odemeniz Gerceklerstirilmistir");
			Banka.kkEkstresi.set(tcindex, Banka.kkEkstresi.get(tcindex)-miktar);
			System.out.println("Bu ayki kalan odeme Tutariniz "+Banka.kkEkstresi.get(tcindex)+" TL dir");
			
			
		} else if (miktar<Banka.kkEkstresi.get(tcindex)) {
			if (miktar>=minOdeme) {
				System.out.println("Minimum odemeniz gerceklestirilmistir");
				Banka.kkEkstresi.set(tcindex, Banka.kkEkstresi.get(tcindex)-miktar);
				System.out.println("Ay sonunda "+Banka.kkEkstresi.get(tcindex)+" TL tutar bir daha ki aya aktarilacaktir");
			}else {
				System.out.println("Odemeniz Gerceklerstirilmistir");
				Banka.kkEkstresi.set(tcindex, Banka.kkEkstresi.get(tcindex)-miktar);
				System.out.println("Bu ayki kalan odeme Tutariniz "+Banka.kkEkstresi.get(tcindex));
			}
			
			
		}else {
			System.out.println("Odemeniz Gerceklerstirilmistir");
			Banka.kkEkstresi.set(tcindex, Banka.kkEkstresi.get(tcindex)-miktar);
			System.out.println("Yatirilan "+Banka.kkEkstresi.get(tcindex)*-1+" TL fazla tutar gelecek ayki odemeden dusurulecektir");
		}{

		}
		
		
	}

	private static void paraTrensferi(String tc) {
		int a=1;
	while (a<2) {
		if (tc.equals(obj1.tc)) {
			System.out.println("Hesaptaki Paraniz          : " + obj1.getHesapMiktar() + " TL");
			System.out.println("Gondermek istediginiz IBAN no sunu giriniz");
			String iban=scan.next();
			System.out.println("Gondereceginiz miktari giriniz");
			double miktar=scan.nextDouble();
			if (obj2.getIban().equals(iban)) {
				if (miktar<=obj1.getHesapMiktar()) {
					obj2.setHesapMiktar(obj2.hesapMiktar+miktar);
					System.out.println("Transfer islemi Gerceklestirildi");
					obj1.setHesapMiktar(obj1.hesapMiktar-miktar);
					System.out.println("Hesabinizda "+obj1.getHesapMiktar()+" TL kalmistir");
					a=2;
				}else {
					System.out.println("Girdiginiz miktar Bakiyenizi asmaktadir");
				}
				
			}else {
				System.out.println("Girdiginiz Iban'i kontrol ediniz");
			}
		} else {
			System.out.println("Hesaptaki Paraniz          : " + obj2.getHesapMiktar() + " TL");
			System.out.println("Gondermek istediginiz IBAN no sunu giriniz");
			String iban=scan.next();
			System.out.println("Gondereceginiz miktari giriniz");
			double miktar=scan.nextDouble();
			if (obj1.getIban().equals(iban)) {
				if (miktar<=obj2.getHesapMiktar()) {
					obj1.setHesapMiktar(obj1.hesapMiktar+miktar);
					System.out.println("Transfer islemi Gerceklestirildi");
					obj2.setHesapMiktar(obj2.hesapMiktar-miktar);
					System.out.println("Hesabinizda "+obj2.getHesapMiktar()+" TL kalmistir");
					a=2;
				}else {
					System.out.println("Girdiginiz miktar Bakiyenizi asmaktadir");
				}
				
			}else {
				System.out.println("Girdiginiz Iban'i kontrol ediniz");
			}
		}
		
	}	
		
		
	}

	private static void sifreDegisme(String tc) {
		int sayac = 0;
		boolean a=false;
		do {
	
			if (tc.equals(obj1.tc)) {
				System.out.println("Sifrenizi Giriniz");
				if (obj1.sifre.equals(scan.next())) {
					System.out.println("Yeni sifrenizi giriniz");
					String yeniSifre = scan.next();
					
					for (String each : obj1.dogumTarih) {
						if (each.contains(yeniSifre)||yeniSifre.length()!=4) {
						
							a=true;
						} else {
							obj1.setSifre(yeniSifre);
						
							sayac=3;
						}
					}
					if (a==true) {
						System.out.println("Sifreniz Dogum Tarihinizi icermemeli ve dort karakter icermeli");
					}
					
					System.out.println("Sifreniz Basarila Degistirilmistir");
				} else {
					System.out.println("Sifrenizi Yanlis girdiniz");
					sayac++;
					if (sayac==3) {
						sayac=4;
					}
				}

			} else {
				
				System.out.println("Sifrenizi Giriniz");
				if (obj2.sifre.equals(scan.next())) {
					System.out.println("Yeni sifrenizi giriniz");
					String yeniSifre = scan.next();
					
					for (String each : obj2.dogumTarih) {
						if (each.contains(yeniSifre)||yeniSifre.length()!=4) {
							a=true;
						} else {
							obj2.setSifre(yeniSifre);
							sayac=3;
						}
					}
					if (a==true) {
						System.out.println("Sifreniz Dogum Tarihinizi icermemeli ve dort karakter icermeli");
					}else {
						System.out.println("Sifreniz Basarila Degistirilmistir");
				} 
				}else {
					System.out.println("Sifrenizi Yanlis girdiniz");
					sayac++;
					if (sayac==3) {
						sayac=4;
					}
			}
		} }while ((sayac < 3));
		if (sayac==4) {
			System.out.println("Sifrenizi 3 kere Yanlis girdiniz");
			cikis();
			
		}else {
			kullaniciEkrani(tc);
		}
	
		
		
	}

	private static void hesapDurumu(String tc) {
		if (tc.equals(obj1.tc)) {
			System.out.println(obj1.getIsim() + " " + obj1.getSoyIsim() + "\nIbanNo : " + obj1.getIban());
			System.out.println("Hesaptaki Paraniz          : " + obj1.getHesapMiktar() + " TL");
			System.out.println("Kredi Karti ekstreniz      : " + obj1.getKkEkstre() + " TL");
			System.out.println("Toplam Kredi Karti borcunu : " + obj1.getKkBorcu() + " TL" + " Kalan Taksit Sayisi :"
					+ obj1.getKkTaksitSayisi());
			System.out.println("Toplam Kredi Borcunuz      : " + obj1.getKrediBorcu() + " TL");
			System.out.println("Bu ayki Kredi Odemeniz     : " + obj1.getKrediEkstre() + " TL");
			System.out.println("Cikis icin 'Q' ya basiniz");
			if (scan.next()=="Q") {
				kullaniciEkrani(tc);
			}

		} else {
			System.out.println(obj1.getIsim() + " " + obj1.getSoyIsim() + "\nIbanNo : " + obj1.getIban());
			System.out.println("Hesaptaki Paraniz          : " + obj2.getHesapMiktar() + " TL");
			System.out.println("Kredi Karti ekstreniz      : " + obj2.getKkEkstre() + " TL");
			System.out.println("Toplam Kredi Karti borcunu : " + obj2.getKkBorcu() + " TL" + " Kalan Taksit Sayisi :"
					+ obj2.getKkTaksitSayisi());
			System.out.println("Toplam Kredi Borcunuz      : " + obj2.getKrediBorcu() + " TL");
			System.out.println("Bu ayki Kredi Odemeniz     : " + obj2.getKrediEkstre() + " TL");
			System.out.println("Cikis icin 'Q' ya basiniz");
			if (scan.next()=="Q") {
				kullaniciEkrani(tc);
			}
		}

	}

	private static void cikis() {
		System.out.println("Sistemten cikiliyor.....");

	}

}
