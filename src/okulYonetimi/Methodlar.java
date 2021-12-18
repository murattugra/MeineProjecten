package okulYonetimi;

import java.util.List;
import java.util.Scanner;

public class Methodlar {

	
	
	public static void anaMenu() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("====================================\n OGRENCI VE OGRETMEN YONETIM PANELI\n===================================="
				+ "\n1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");
		
		System.out.print("Yapmak istediginiz islemi giriniz:");
		
		char secim = scan.next().toUpperCase().charAt(0);
		
		switch (secim) {
		case '1':
			ogrenciIslemleri();
			
			break;
		case '2':
			ogretmenIslemleri();
			
			break;
		case 'Q':
			cikis();
			break;
		default:
			System.out.println("====>Lutfen gecerli giris yapiniz!<====");
			anaMenu();
			break;
		}
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	}

	
	
	
	private static void cikis() {
		System.out.println("====>Cikis Basarili<====");

	}

	
	
	
	public static void ogrenciIslemleri() {
		Scanner scan = new Scanner(System.in);

		System.out.println("============= \nOGRENCI ISLEMLERI\n=============\n1-EKLEME"
				+ "\n2-ARAMA\n3-LISTELEME\n4-SILME\n5-ANA MENU\nQ-CIKIS");
		
		System.out.print("Yapmak istediginiz islemi giriniz:");

		char secim = scan.next().toUpperCase().charAt(0);
		
		
		switch (secim) {
		case '1':
			Ogrenci.ekle();
			break;
		case '2':
			Ogrenci.ara(OkulYonetimi.ogrenci);
			break;
			
		case '3':
			Ogrenci.listele(OkulYonetimi.ogrenci);
			break;
			
		case '4':
			Ogrenci.sil(OkulYonetimi.ogrenci);
			break;
			
		case '5':
			anaMenu();
			break;
			
		case 'Q':
			cikis();
			break;
			
		default:
			System.out.println("====>Lutfen gecerli giris yapiniz!<====");
			ogrenciIslemleri();
			break;
		}
		
		
		
	
		
		
	}
	
	
	
	
	public static void ogretmenIslemleri() {
		Scanner scan = new Scanner(System.in);

		System.out.println("============= \nOGRETMEN ISLEMLERI\n=============\n1-EKLEME"
				+ "\n2-ARAMA\n3-LISTELEME\n4-SILME\n5-ANA MENU\nQ-CIKIS");
		
		System.out.print("Yapmak istediginiz islemi seciniz:");

		char secim = scan.next().toUpperCase().charAt(0);
		
		
		switch (secim) {
		case '1':
			Ogretmen.ekle();
			break;
		case '2':
			Ogretmen.ara(OkulYonetimi.ogretmen);
			break;
			
		case '3':
			Ogretmen.listele(OkulYonetimi.ogretmen);
			break;
			
		case '4':
			Ogretmen.sil(OkulYonetimi.ogretmen);
			break;
			
		case '5':
			anaMenu();
			break;
			
		case 'Q':
			cikis();
			break;
			
		default:
			System.out.println("====>Lutfen gecerli giris yapiniz!<====");
			ogretmenIslemleri();
			break;
		}
		
		
		
	}
	
	
	
	
	

	
	
	
}
