package okulYonetimi;

import java.util.List;
import java.util.Scanner;

public class Ogrenci extends Kisiler {
	

	
	int numara;
	int sinif;
	
	
	public Ogrenci(){
		
	}
	
	
	
	public Ogrenci(String adSoyad, String kimlikNo, int yas, int numara, int sinif) {
		
		this.adSoyad=adSoyad;
		this.kimlikNo=kimlikNo;
		this.yas=yas;
		this.numara=numara;
		this.sinif=sinif;
		
	}
	
	
	
	
	public static void ekle() {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Eklemek istediginiz ogrencinin,\nAdini ve Soyadini giriniz:");
		String adSoyad=scan.nextLine();
		System.out.println("Kimlik Numarasini giriniz:");
		String kimlikNo = scan.next();
		System.out.println("Yasini giriniz:");
		int yas = scan.nextInt();
		System.out.println("Numarasini giriniz");
		int numara = scan.nextInt();
		System.out.println("Sinifini giriniz");
		int sinif = scan.nextInt();
		
		Ogrenci ogrenci = new Ogrenci(adSoyad,kimlikNo,yas,numara,sinif);
		
		OkulYonetimi.ogrenci.add(ogrenci);
		
		System.out.println("====>Ogrenci Eklendi.<====");
		Methodlar.ogrenciIslemleri();
		
	}

	
	
	
	public static void ara(List<Ogrenci> liste) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen aramak istediginiz ogrencinin adini veya kimlik numarasini giriniz");
		String isim =scan.nextLine();
		boolean kontrol =true;
		for (Ogrenci each : liste) {
			
			if (each.adSoyad.equalsIgnoreCase(isim)||each.kimlikNo.equals(isim)) {
				System.out.println(each.toString());
				kontrol=false;
			}
		}
		
		if (kontrol) {
			System.out.println("====>Ogrenci bulunamadi!<====");
		}
		
		Methodlar.ogrenciIslemleri();
		
		
		
	}

	
	
	
	public static void listele(List<Ogrenci> liste) {

		for (Ogrenci each : liste) {
			System.out.println(each.toString());
		}
												
		Methodlar.ogrenciIslemleri();
        }
    
		
	

	public static void sil(List<Ogrenci> liste) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen silmek istediginiz ogrencinin kimlik numarasini giriniz:");
		String kimlik = scan.next();
		boolean kontrol = true;
		
		for (Ogrenci each : liste) {
			if (each.kimlikNo.equals(kimlik)) {
				liste.remove(each);
				kontrol = false;
				System.out.println("====>Islem basarili<====");
				Methodlar.ogrenciIslemleri();
			}
		}
		if (kontrol) {
			System.out.println("====>Girilen kimlik numarasina sahip ogrenci bulunamadi<====");
			Methodlar.ogrenciIslemleri();
		}
		
		
		
		
		

		
		
	}

	
	
	
	public String toString() {
		return "Ogrenci [numara=" + numara + ", sinif=" + sinif + ", adSoyad=" + adSoyad + ", kimlikNo=" + kimlikNo
				+ ", yas=" + yas + "]";
	}


	
	
	
	
	
	
	
	
	
	
}
