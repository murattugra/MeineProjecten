package javaProjects.kitapYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
	1.	Kullanıcının Kitap ekleme, silme ve listeleme gibi
		işlemleri yapmasına imkan tanıyan bir uygulama yazınız.

	2.	Program, kitaplara 1001’den başlayarak sıralı ve otomatik numara vermeli.
		Bunun yanında, her bir kitap için Kitap Adı, Yazar Adı, Yayın Yılı ve Fiyat gibi bilgiler girilebilmelidir.

	3.	Programın başlangıcında Kullanıcıya aşağıdaki gibi bir menü sunulmalıdır.
		Kullanıcı programı bitirene kadar işlemlere devam edebilmelidir.

		========= KİTAP PROGRAMI =============
			1: Kitap ekle
			2: Numara ile kitap sil
			3: Tüm kitapları listele
			4: Bitir

 */
public class Kitapci {
	
	static List<Kitap> kitapListe= new ArrayList<>();
	
	

    public static void main(String[] args) {

    	KitapMethod.menu(kitapListe);
    	
    	
    }
/*
    public static void menu(List<Kitap> liste) {
        System.out.println("========= KİTAP PROGRAMI =============\n1: Kitap ekle"
        			+ "\n2: Numara ile kitap sil\n3: Tum kitaplari listele\n4: Bitir");

    	System.out.println("Isleminizi Seciniz : ");
    	int tercih=scan.nextInt();
    	
    	switch (tercih) {
    	
    	case 1:
    		kitapEkle(liste);
    		break;
    		
    	case 2:
    		noIleSil(liste);
    		break;
    	
    	case 3:
    		listele(liste);
    		break;
    		
    	case 4 :
    		bitir();
    		break;
    		default:
    			System.out.println("Yanlis giris yapildi tekrar deneyiniz");
    		break;
    		
    		
    	
    	}
    	
    }

	private static void listele(List<Kitap> liste) {
		
		for (Kitap k : liste) {
			System.out.println(k.toString());
			
		}
		menu(liste);
		
		
		
		
	}

	private static void noIleSil(List<Kitap> liste) {

		System.out.println("silinecek kitap no giriniz : ");
		
		int silinecekNo=scan.nextInt();
		for (Kitap k : liste) {
			if (k.getNo() == silinecekNo) {
				liste.remove(k);
				menu(liste);
			}
		}
		
		System.out.println(silinecekNo+ " ait kitap bulunamadi !!! ");
		menu(liste);
	}

	private static void kitapEkle(List<Kitap> liste) {
		System.out.println("Kitap adi:");
        String kitapAdi=scan.nextLine();
        scan.nextLine();
        System.out.println("Yazar adi:");
        String yazarAdi=scan.nextLine();
       
        System.out.println("Yayin yili:");
        int yayinYili = scan.nextInt();
        
        System.out.println("Kitap fiyati:");
        double kitapFiyati=scan.nextDouble();
        
        Kitap kitap=new Kitap(++kitapNo,kitapAdi,yazarAdi,yayinYili,kitapFiyati);
		liste.add(kitap);
		System.out.println(kitap.toString()+ " eklendi  : ");
		
		menu(liste);
	}

	private static void bitir() {
		System.out.println("Tesekkurler yine bekleriz");
		
	}
    */
    
    
}
