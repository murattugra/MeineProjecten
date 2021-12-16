package javaProjects.okulYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
	BİR OKUL YÖNETİM PLATFORMU KODALYINIZ.

	1.	Bu programda, Öğrenci ve Öğretmen Kayıtları ile ilgili işlemler yapılabilmelidir.
		Kayıtlarda şu bilgiler olabilmelidir.

		Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
		Öğrenci: Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.

	2.	Program başladığında Kullanıcıya, Öğretmen ve Öğrenci işlemlerini seçebilmesi için
		Aşağıdaki gibi bir menü gösterilsin.

	====================================
	 ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
	====================================
	 1- ÖĞRENCİ İŞLEMLERİ
	 2- ÖĞRETMEN İŞLEMLERİ
	 Q- ÇIKIŞ

	3.	Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.

	============= İŞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LİSTELEME
		 4-SİLME
		 5-ANA MENÜ
		 Q-ÇIKIŞ

	SEÇİMİNİZ:

	4.	İşlemler menüsünde seçilen işleme göre bir önceki menüde seçilen Kişi türü ile ilgili
	    ekleme, kimlik no ile silme ve arama, var olan tüm kişileri listeleme gibi işlemler yapılabilmelidir.
		Bunun yanında bir üst menüye dönme veya çıkış işlemleri de yapılabilmelidir.

 */

public class Islemler {

	static List<Kisi> ogrenciList = new ArrayList<Kisi>();
	static List<Kisi> ogretmenList = new ArrayList<Kisi>();

	static Scanner scan = new Scanner(System.in);

	static String kisiTuru;

	public static void anaMenu() {

		System.out.println(
				"====================================\nOGRENCI VE OGRETMEN YONETIM PANELI\n====================================\n"
						+ "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");

		System.out.println("isleminizi seciniz : ");
		String secim = scan.next().toUpperCase();

		switch (secim) {

		case "1":
			kisiTuru = "OGRENCI";
			islemMenusu();
			break;

		case "2":
			kisiTuru = "OGRETMEN";
			islemMenusu();
			break;

		case "q":
			cikis();
			break;

		default:
			break;
			anaMenu();

		}

	}

	private static void cikis() {
		System.out.println("Uygulamayi kullandiginiz icin Tesekkurler");

	}

	private static void islemMenusu() {

		System.out.println("\n" + "	============= İŞLEMLER =============\n" + "		 1-EKLEME\n" + "		 2-ARAMA\n"
				+ "		 3-LİSTELEME\n" + "		 4-SİLME\n" + "		 0-ÇIKIŞ");

		System.out.println("Islem tercihinizi seciniz");
		int islemTercihi = scan.nextInt();

		switch (islemTercihi) {

		case 0:
			anaMenu();
			break;
		case 1:
			ekleme();
			islemMenusu();
			break;
		case 2:
			arama();
			islemMenusu();
			break;
		case 3:
			listeleme();
			islemMenusu();
			break;

		case 4:
			silme();
			islemMenusu();
			break;

		default:
			System.out.println("Hatali giris yaptiniz");
			islemMenusu();
			break;

		}

	}

	private static void arama() {

		System.out.println("*****"+kisiTuru+"arama sayfasi ****");
		if (kisiTuru.equals("ogrenci")) {
			System.out.println("aradiginiz ogrenci kimlik No giriniz");
			String ogrenciKimlik = scan.next();
			for(Kisi k:ogrenciList) {
				if (k.getKimlikNo().contains(ogrenciKimlik)) {
					System.out.println("aradiginiz ogrenci : "+ k.getAdSoyad());
				}else {
					System.out.println("Aradiginiz ogrenci mevcut degil");
				}
				
			}
			
			
			
		}
		
		
	}

	private static void ekleme() {

	System.out.println("*****"+kisiTuru+"ekleme sayfasi ****");
		System.out.println("Ad soyad giriniz : ");
		String adSoyad = scan.nextLine();
		System.out.println("Kimlik No Giriniz");
		String kimlikNo=scan.next();
		System.out.println("Yas giriniz : ");
		int yas=scan.nextInt();
		
		if (kisiTuru.equals("ogrenci")) {
			System.out.println("Ogrenci No giriniz : ");
			String numara=scan.next();
			System.out.println("Sinif giriniz");
			String sinif =scan.next();
			
			Ogrenci ogrenci = new Ogrenci(adSoyad,kimlikNo,yas,numara,sinif);
			ogrenciList.add(ogrenci);
		}
		
		else {
			
		
			
			
		}
		
		
		
	}

}
