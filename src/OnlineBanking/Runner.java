package OnlineBanking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Runner {

	static Scanner scan = new Scanner(System.in);
	static Kullanici01 obj1 = new Kullanici01();
	static Kullanici02 obj2 = new Kullanici02();
	static int tcindex = 0;
	static double minOdeme =0;
	static double kalanOdeme=0;
	static boolean minKalan=false;
	public static void main(String[] args) {

		boolean onay = false;
		do {

			System.out.println("***Online Bankacilik Islemlerine Hosgeldiniz***");
			System.out.println("Lutfen TC kimlik numaranizi giriniz");
			String tc = scan.next();
			System.out.println("Lutfen sifrenizi giriniz");
			String sifre = scan.next();
			boolean c = false;
			for (int i = 0; i < Banka.tcler.size(); i++) {
				if (Banka.tcler.get(i).equals(tc) && Banka.sifreler.get(i).equals(sifre)) {
					onay = true;
					tcindex = i;
					c = true;
					 minOdeme = Banka.kkEkstresi.get(tcindex) / 3;
					kullaniciEkrani();
				
				}
			}
			if (c == false) {
				System.out.println("Tc nizi yada sifrenizi kontrol ediniz");
			}

		} while (onay != true);
		scan.close();

	}

	private static void kullaniciEkrani() {
		System.out.println("****Kullanici Islemlerine Hosgeldiniz****");
		System.out.println("1->Hesap Durumu Goruntuleme\n2->Sifre Degistirme\n3->Para Transferi\n"
				+ "4-KrediKarti Ekstresi odeme\n5-Kredi Taksiti odeme\nQ->Cikis");
		String secim = scan.next();

		switch (secim) {
		case "1":
			hesapDurumu();
			break;
		case "2":
			sifreDegisme();
			break;

		case "3":
			paraTrensferi();
			kullaniciEkrani();
			break;
		case "4":
			kkEkstreOdeme();
			kullaniciEkrani();
			break;
		case "5":
			krediOdeme();
			kullaniciEkrani();
			break;
		case "Q":
			cikis();
			break;

		default:
			System.out.println("Yanlis ecim yaptiniz");
			kullaniciEkrani();
			break;
		}

	}

	private static void krediOdeme() {

		System.out.println("Bu ayki kalan kredi odemeniz " + Banka.krediEkstresi.get(tcindex) + " TL dir");
		System.out.println("Lutfen odemek istediginiz miktari giriniz");
		double miktar = scan.nextDouble();
		if (miktar < 0) {
			System.out.println("Yanlis giris yaptiniz");

		} else {
			if (miktar == Banka.krediEkstresi.get(tcindex)) {
				System.out.println("Odemeniz Gerceklerstirilmistir");
				Banka.krediEkstresi.set(tcindex, Banka.krediEkstresi.get(tcindex) - miktar);
				System.out.println("Bu ayki kalan odeme Tutariniz " + Banka.krediEkstresi.get(tcindex) + " TL dir");

			} else if (miktar < Banka.krediEkstresi.get(tcindex)) {
				Banka.krediEkstresi.set(tcindex, Banka.krediEkstresi.get(tcindex) - miktar);
				System.out.println("Odemeniz Gerceklerstirilmistir\nBu ay icin kalan odemeniz "
						+ Banka.krediEkstresi.get(tcindex) + " TL dir");
			} else {
				Banka.krediEkstresi.set(tcindex, Banka.krediEkstresi.get(tcindex) - miktar);
				System.out.println("Odediginiz " + Banka.krediEkstresi.get(tcindex) * -1
						+ " TL fazla tutar bir sonraki aya aktarilmistir");
			}
		}

		{

		}
	}

	private static void kkEkstreOdeme() {

		Runner obj=new Runner();
		
		System.out.println("Bu ayki kalan KK Ekstreniz " + Banka.kkEkstresi.get(tcindex) + "\nMinimum Odeme Tutariniz "
				+minOdeme );
		if (minKalan) {
			System.out.println("Bu ayki min Odeme tutariniz gerceklesmistir");
		}
		System.out.println("Lutfen odemek istediginiz miktari giriniz");
		double miktar = scan.nextDouble();
		
		if (miktar <= 0) {
			System.out.println("Yanlis giris yaptiniz");

		} else {
			if (miktar == Banka.kkEkstresi.get(tcindex)) {
				System.out.println("Odemeniz Gerceklerstirilmistir");
				minKalan=true;
				Banka.kkEkstresi.set(tcindex, Banka.kkEkstresi.get(tcindex) - miktar);
				System.out.println("Bu ayki kalan odeme Tutariniz " + Banka.kkEkstresi.get(tcindex) + " TL dir");
				Banka.kkBorcu.set(tcindex, Banka.kkBorcu.get(tcindex)-miktar);

			} else if (miktar < Banka.kkEkstresi.get(tcindex)) {
				if (miktar >= minOdeme) {
					System.out.println("Minimum odemeniz gerceklestirilmistir");
					minKalan=true;
					Banka.kkEkstresi.set(tcindex, Banka.kkEkstresi.get(tcindex) - miktar);
					System.out.println(
							"Ay sonunda " + Banka.kkEkstresi.get(tcindex) + " TL tutar bir daha ki aya aktarilacaktir");
					Banka.kkBorcu.set(tcindex, Banka.kkBorcu.get(tcindex)-miktar);
				} else {
					if (obj.kalanOdeme>0) {
						if (obj.kalanOdeme<=miktar) {
							System.out.println("Minimum odemeniz gerceklestirilmistir");
							minKalan=true;
							Banka.kkEkstresi.set(tcindex, Banka.kkEkstresi.get(tcindex) - miktar);
							System.out.println(
									"Ay sonunda " + Banka.kkEkstresi.get(tcindex) + " TL tutar bir daha ki aya aktarilacaktir");
						}else {
							obj.kalanOdeme=obj.kalanOdeme-miktar;
							System.out.println("Ay sonuna kadar "+kalanOdeme+" TL daha odeme yapmalisiniz");
							Banka.kkEkstresi.set(tcindex, Banka.kkEkstresi.get(tcindex) - miktar);
						}
						
					}else {
						obj.kalanOdeme=minOdeme-miktar;
						System.out.println("Ay sonuna kadar min Odeme icin "+kalanOdeme+" TL daha odeme yapmalisiniz");
						Banka.kkEkstresi.set(tcindex, Banka.kkEkstresi.get(tcindex) - miktar);
					}
						
					}
				
				
					
				}

			 else {
				System.out.println("Odemeniz Gerceklerstirilmistir");
				Banka.kkEkstresi.set(tcindex, Banka.kkEkstresi.get(tcindex) - miktar);
				System.out.println("Yatirilan " + Banka.kkEkstresi.get(tcindex) * -1
						+ " TL fazla tutar gelecek ayki odemeden dusurulecektir");
			}
		}

		{

		}

	}

	private static void paraTrensferi() {
		int a = 1;
		int ibanIndex = 0;
		while (a < 2) {
			boolean d = true;
			do {
				System.out.println("Hesaptaki Paraniz          : " + Banka.hesapMiktarlari.get(tcindex) + " TL");
				System.out.println("Gondermek istediginiz IBAN no sunu giriniz");
				String iban = scan.next();

				for (int i = 0; i < Banka.ibanlar.size(); i++) {
					if (iban.equals(Banka.ibanlar.get(i))) {
						ibanIndex = i;
						d = false;
					}
				}
				if (d) {
					System.out.println("Girdiginiz Iban'i kontrol ediniz");
				}
			} while (d);

			System.out.println("Gondereceginiz miktari giriniz");
			double miktar = scan.nextDouble();

			if (miktar <= Banka.hesapMiktarlari.get(tcindex)) {
				Banka.hesapMiktarlari.set(ibanIndex, Banka.hesapMiktarlari.get(ibanIndex) + miktar);
				System.out.println("Transfer islemi Gerceklestirildi");
				Banka.hesapMiktarlari.set(tcindex, Banka.hesapMiktarlari.get(tcindex) - miktar);
				System.out.println("Hesabinizda " + Banka.hesapMiktarlari.get(tcindex) + " TL kalmistir");
				a = 2;
			} else {
				System.out.println("Girdiginiz miktar Bakiyenizi asmaktadir");
			}

		}

	}

	private static void sifreDegisme() {

		int sayac = 0;
		boolean a = false;
		do {

			System.out.println("Sifrenizi Giriniz");
			if (Banka.sifreler.get(tcindex).equals(scan.next())) {
				System.out.println("Yeni sifrenizi giriniz");
				String yeniSifre = scan.next();
				String dt = Banka.dogumTarihleri.get(tcindex);
				String arr[] = dt.split(",");	//["10","09","1990"]
				for (String each : arr) {
					if (each.contains(yeniSifre) || yeniSifre.length() != 4) {

						a = true;
					} else {
						Banka.sifreler.set(tcindex, yeniSifre);
						sayac = 3;
					
					}
				}
				if (a == true) {
					System.out.println("Sifreniz Dogum Tarihinizi icermemeli ve en az dort karakter icermeli");
				}

				System.out.println("Sifreniz Basarila Degistirilmistir");
			
			} else {
				System.out.println("Sifrenizi Yanlis girdiniz");
				sayac++;
				if (sayac == 3) {
					sayac = 4;
				}
			}

		} while ((sayac < 3));
		if (sayac == 4) {
			System.out.println("Sifrenizi 3 kere Yanlis girdiniz");
			cikis();

		} else {
			kullaniciEkrani();
		}

	}

	private static void hesapDurumu() {
		
		System.out.println(Banka.isimSoyisimler.get(tcindex));
		System.out.println(Banka.ibanlar.get(tcindex));
		System.out.println("Hesaptaki Paraniz          : " + Banka.hesapMiktarlari.get(tcindex) + " TL");
		System.out.println("Kredi Karti ekstreniz      : " + Banka.kkEkstresi.get(tcindex) + " TL");
		System.out.println("Toplam Kredi Karti borcunu : " + Banka.kkBorcu.get(tcindex) + " TL");
		System.out.println("Toplam Kredi Borcunuz      : " + Banka.krediBorcu.get(tcindex));
		System.out.println("Bu ayki Kredi Odemeniz     : " + Banka.krediEkstresi.get(tcindex));
		System.out.println("Cikis icin 'Q' ya basiniz");
		String secim = scan.next();
		if (secim.equals("Q")) {
			kullaniciEkrani();
		} else {
			System.out.println("Yanlis secim yaptiniz");
			hesapDurumu();
		}

	}

	private static void cikis() {
		System.out.println("Sistemden cikiliyor.....");

	}

}
