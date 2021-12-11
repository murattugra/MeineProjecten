package kleineProjecten;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ManavProject {

	public static void main(String[] args) {
		 /*
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         *           istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         *           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
        List<String> urunler=new ArrayList<>(Arrays.asList("Elma","Portakal","Armut","Uzum","Nar"));
        List<Double> fiyatlar=new ArrayList<>(List.of(       1.10,    0.90,     1.80, 2.00,  3.00));
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("**********************JAVA MANAVA HOSGELDINIZ********************");
		
		String urun="";
		double toplamTutar=0;
		double tutar=0;
		String alinanUrunler="";
		char ekstra;
		do {
			System.out.println("     **********************URUN LISTEMIZ********************");
			System.out.println(" Elma (1)  ,  Portakal (2)  ,  Armut  (3)  ,  Uzum (4)  ,  Nar (5)  ");
			System.out.println("        Lutfen almak istediginiz urununz numarasini giriniz");
			int secim=scan.nextInt();
			
			switch (secim){
			case 1:urun="Elma";
					tutar=fiyatlar.get(0);
			break;
			case 2:urun="Portakal";
			tutar=fiyatlar.get(1);
			break;
			case 3:urun="Armut";
			tutar=fiyatlar.get(2);
			break;
			case 4:urun="Uzum";
			tutar=fiyatlar.get(3);
			break;
			case 5: urun="Nar";
			tutar=fiyatlar.get(4);
			break;
			default:System.out.println("Yanlis secim yaptiniz");
			}
			
			System.out.println("        Lutfen almak istedigininz miktari kg cinsinden giriniz");
			double  miktar=scan.nextDouble();
			tutar=tutar*miktar;
			System.out.println("Baska urun almak istiyormusunuz   E/H");
			ekstra=scan.next().charAt(0);
			if (ekstra=='E') {
				alinanUrunler+=miktar+" Kg "+urun+" "+tutar+" Euro ";
				toplamTutar+=tutar;
				
			}else if (ekstra=='H') {
				alinanUrunler+=miktar+" Kg "+urun+" "+tutar+" Euro ";
				
				toplamTutar+=tutar;
				break;
			}else {
				System.out.println("Yanlis harf girdiniz");
				break;
			}
		} while (ekstra!='H');
		System.out.println("Alinan urunler :"+alinanUrunler);
		System.out.println("Toplam tutar "+toplamTutar+" EURO dur");
	}

}
