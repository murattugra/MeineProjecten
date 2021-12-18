package okulYonetimi;

import java.util.List;
import java.util.Scanner;

public class Ogretmen extends Kisiler{

	
	
	String bolum;
	String sicilNo;
	
	
	public Ogretmen (){
		
	}
	
	
	
	public Ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo) {
		
		
		this.adSoyad=adSoyad;
		this.kimlikNo=kimlikNo;
		this.yas=yas;
		this.bolum=bolum;
		this.sicilNo=sicilNo;
	
		
	}
	
	
	
	public static void ekle() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Eklemek istediginiz Ogretmenin,\nAdini ve Soyadini giriniz:");
		String adSoyad=scan.nextLine();
		System.out.println("Kimlik Numarasini giriniz:");
		String kimlikNo = scan.next();
		System.out.println("Yasini giriniz:");
		int yas = scan.nextInt();
		System.out.println("Bolumunu giriniz");
		String bolum = scan.next();
		System.out.println("Sicil numarasini giriniz");
		String sicilNo = scan.next();
		
		Ogretmen ogretmen = new Ogretmen(adSoyad,kimlikNo,yas,bolum,sicilNo);
		
		OkulYonetimi.ogretmen.add(ogretmen);
		
		
		
		System.out.println("====>Ogretmen Eklendi.<====");
		Methodlar.ogretmenIslemleri();
		
	}

	
	
	public static void ara(List<Ogretmen> liste) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen aramak istediginiz Ogretmenin adini veya kimlik numarasini giriniz");
		String isim =scan.nextLine();
		boolean kontrol =true;
		for (Ogretmen each : liste) {
			
			if (each.adSoyad.equalsIgnoreCase(isim) || each.kimlikNo.equals(isim)) {
				System.out.println(each.toString());
				kontrol=false;
			}
		}
		if (kontrol) {
			System.out.println("====>Ogretmen bulunamadi!<====");
		}
		Methodlar.ogretmenIslemleri();
		
	}

	
	
	public static void listele(List<Ogretmen> liste) {

		for (Ogretmen each : liste) {
			System.out.println(each.toString());
		}
												
		Methodlar.ogretmenIslemleri();;
        }
		
	
	

	public static void sil(List<Ogretmen> liste) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen silmek istediginiz Ogretmenin kimlik numarasini giriniz:");
		String kimlik = scan.next();
		boolean kontrol = true;
		for (Ogretmen each : liste) {
			if (each.kimlikNo.equalsIgnoreCase(kimlik)) {
				liste.remove(each);
				kontrol = false;
				System.out.println("====>Islem basarili<====");
				Methodlar.ogretmenIslemleri();		

			}
		}
		if (kontrol) {
			System.out.println("====>Girilen kimlik numarasina sahip ogretmen bulunamadi<====");
			Methodlar.ogretmenIslemleri();
		}
		
	}

	
	

	@Override
	public String toString() {
		return "Ogretmen [bolum=" + bolum + ", sicilNo=" + sicilNo + ", adSoyad=" + adSoyad + ", kimlikNo=" + kimlikNo
				+ ", yas=" + yas + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
