package okulYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import SchulVerwaltung.Schuler;
import javaProjects.okulYonetimi.Kisi;
import javaProjects.okulYonetimi.Ogrenci;

public class Islemler {

	static String kisiTuru;
	static List<Ogrenci> ogrenciList = new ArrayList<Ogrenci>();
	
	static List<Ogretmen> ogretmenList = new ArrayList<Ogretmen>();
	
	
	public static void anaMenu() {
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================");
		System.out.println("******** ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ *********");
		System.out.println("======================================================");
		System.out.println("1-ÖĞRENCİ İŞLEMLERİ\n2-ÖĞRETMEN İŞLEMLERİ\nQ- ÇIKIŞ");
		String secim=scan.next();
		
		switch(secim) {
		
		case "1":
			kisiTuru="ogrenci";
			islemMenusu();
		case "2":
			kisiTuru="ogretmen";
			islemMenusu();
		case "Q":		
			cikis();
			break;
		default:
			System.out.println("Yanlis giris yaptiniz");
			anaMenu(); 
		}
		
		
		
	}
	public static void islemMenusu(){
		System.out.println("============= İŞLEMLER =============");
		System.out.println("1-EKLEME\n"
				+ "2-ARAMA\n"
				+ "3-LİSTELEME\n"
				+ "4-SİLME\n"
				+ "5-ANA MENÜ\n"
				+ "Q-ÇIKIŞ");
		Scanner scan=new Scanner(System.in);
		String secim=scan.next();
		
		switch(secim) {
		
		case "1":
			ekle();islemMenusu();break;
		case "2":
			ara();islemMenusu();break;	
		case "3":
			listele(ogrenciList);islemMenusu();break;
		case "4":
			sil();islemMenusu();break;
		case "5":
			anaMenu();break;
		case "Q":
			cikis();break;
		default:System.out.println("Yanlis Secim Yaptiniz");
			islemMenusu();break;
			
			
		
		}
		
		
		
		
	}
	public static void ekle(){
		Scanner scan=new Scanner(System.in);
		System.out.println("adSoyad giriniz");
		String adSoyad=scan.nextLine();
		System.out.println("Kimlik No giriniz");
		String kimlikNo=scan.next();
		System.out.println("Yas girinz");
		int yas=scan.nextInt();
		
		if (kisiTuru=="ogrenci") {
			System.out.println("Okul Numarasi giriniz");
			String numara=scan.next();
			System.out.println("Sinifini giriniz");
			String sinif=scan.next();
			Ogrenci ogrenci = new Ogrenci(adSoyad,kimlikNo,yas,numara,sinif);
			ogrenciList.add(ogrenci);
		}else {
			System.out.println("Sicil no giriniz");
			String sicilNo=scan.next();
			System.out.println("Bolumunu giriniz");
			String bolum=scan.next();
			Ogretmen ogretmen = new Ogretmen(adSoyad,kimlikNo,yas,sicilNo,bolum);
			ogretmenList.add(ogretmen);
		}
			
			
		
				
	}
	
	public static void ara(){
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Aramak istediginiz "+kisiTuru+" icin kimlik no yada adsoyad giriniz");
		String arama=scan.nextLine();
		if (kisiTuru.equalsIgnoreCase("ogrenci")) {
			boolean kontrol =true;
			for (Kisi each : ogrenciList) {
				if (each.getAdSoyad().equalsIgnoreCase(arama)||each.getKimlikNo().equalsIgnoreCase(arama)) {
					System.out.println(each.toString());
					kontrol=false;
					anaMenu();
				}
			
			} 
			
			
			if (kontrol) {
				System.out.println("====>Ogrenci bulunamadi!<====");
				anaMenu();
			}
		}
		
		
		
	}
	public static void listele(List<Ogrenci> liste) {
		if (kisiTuru.equals("ogrenci")) {
			for (Ogrenci each : liste) {
				System.out.println(each.toString());
			}
		}
		
	}
	public static void sil(){
		
	}
	public static void cikis(){
		
	}
	
	
	
	
	
	
	
	
}
