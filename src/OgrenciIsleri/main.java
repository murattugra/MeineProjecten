package OgrenciIsleri;

import java.util.Scanner;

public class main {

	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
	
		mevcutOgrenciler();

		anaMenu();
		
		
		
		
	}

	private static void mevcutOgrenciler() {
		Ogrenci ogr1=new Ogrenci("123","Ali","Duran",80.6);
		Ogrenci.lst.add(ogr1);
		Ogrenci ogr2=new Ogrenci("124","Veli","Akin",80.6);
		Ogrenci.lst.add(ogr2);
		Ogrenci ogr3=new Ogrenci("125","Murat","Akca",80.6);
		Ogrenci.lst.add(ogr3);
		Ogrenci ogr4=new Ogrenci("126","Hasan","Gelir",80.6);
		Ogrenci.lst.add(ogr4);
		Ogrenci ogr5=new Ogrenci("127","Seyfullah","Dogan",80.6);
		Ogrenci.lst.add(ogr5);
		Ogrenci ogr6=new Ogrenci("128","Filiz","Nice",80.6);
		Ogrenci.lst.add(ogr6);
				
		
	}

	private static void anaMenu() {
		System.out.println("======++==**OGRENCI ISLEMLERINE HOSGELDINIZ**==++==========");
		System.out.println("1-OGRENCI KAYIT\n2-OGRENCI SILME\n3-OGRENCI LISTELEME\n4-CIKIS");
		System.out.println("Lutfen yapmak istediginiz  islemi seciniz");
		String secim=scan.next();
		
		switch(secim) {
		case "1":
			kayit();
			
		case "2":
			silme();
			
		case "3":
			System.out.println(Ogrenci.lst.toString());
			anaMenu();
		case "4":
			System.out.println("CIKILIYOR......");
			break;
		default:
			System.out.println("Yanlis islem sectiniz");
			anaMenu();
		
		
		
		
		}
		
		
		
		
	}

	

	private static void silme() {
		System.out.println("Silmek istedginiz ogrencini numarasini giriniz");
		String numara=scan.next();
		
		boolean a=false;
		Ogrenci obj=new Ogrenci();
		for (Ogrenci i :obj.lst ) {
			if (i.numara.equalsIgnoreCase(numara)) {
				i.lst.remove(i);
				a=true;
				anaMenu();
			}
		} if(a==false) {
			System.out.println("Ogrenci bulunamadi");
			anaMenu();
			
		}
		
	}

	private static void kayit() {
		System.out.println("Kaydetmek istedginiz ogrencini numarasini giriniz");
		String numara=scan.next();
		
		System.out.println("Kaydetmek istedginiz ogrencini adini giriniz");
		String ad=scan.next();
	
		System.out.println("Kaydetmek istedginiz ogrencini soyadini giriniz");
		String soyad=scan.next();
		
		System.out.println("Kaydetmek istedginiz ogrencini ortalamasini giriniz");
		double ortalama=scan.nextDouble();
		
		Ogrenci ogr=new Ogrenci(numara,ad,soyad, ortalama);
		
		ogr.lst.add(ogr);
		System.out.println("Ogrenci basariyla kaydedildi...");
		
		anaMenu();
		
		
	}

}
