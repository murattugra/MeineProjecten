package LebensMittelAutomat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner extends Lager{

 	List<String> sepetUrun=new ArrayList<>();
 	List<Double> sepetFiyat=new ArrayList<>();
 	static double toplamFiyat=0;
	public static void main(String[] args) {
		
		
	
			urunList();
			urunsecme();
			odeme(toplamFiyat);
			
		
		
	}

	
	

	public static void odeme(double toplamFiyat2) {
		double odeme;
		double ekodeme;
		boolean cikis=false;
	do {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen odenecek Miktari giriniz");
		odeme=scan.nextDouble();
		
		if (odeme!=1&&odeme!=5&&odeme!=10&&odeme!=20) {
			System.out.println("Otomat sadece 1 tl , 5 tl, 10 tl, 20 tl kabul etmektedir");
			System.out.println("lutfen paranizi aliniz ve 1 tl , 5 tl, 10 tl, 20 tl ile odeme yapiniz");
			cikis=true;
			
		}else if (odeme<toplamFiyat) {
			System.out.println("Lutfen "+(toplamFiyat-odeme)+" TL ekleme yapin");
			ekodeme=scan.nextDouble();
			if (ekodeme!=1&&ekodeme!=5&&ekodeme!=10&&ekodeme!=20) {
				System.out.println("Otomat sadece 1 tl , 5 tl, 10 tl, 20 tl kabul etmektedir");
				System.out.println("lutfen paranizi aliniz ve 1 tl , 5 tl, 10 tl, 20 tl ile odeme yapiniz");
				cikis=true;
				break;
			}
			odeme+=ekodeme;
			System.out.println("Para ustunuz "+(odeme-toplamFiyat)+" TL dir");
			cikis=false;
			if (odeme<toplamFiyat) {
				System.out.println("Lutfen "+(toplamFiyat-odeme)+" TL ekleme yapin");
				ekodeme=scan.nextDouble();
				if (ekodeme!=1&&ekodeme!=5&&ekodeme!=10&&ekodeme!=20) {
					System.out.println("Otomat sadece 1 tl , 5 tl, 10 tl, 20 tl kabul etmektedir");
					System.out.println("lutfen paranizi aliniz ve 1 tl , 5 tl, 10 tl, 20 tl ile odeme yapiniz");
					cikis=true;
					break;
				}
				odeme+=ekodeme;
				System.out.println("Para ustunuz "+(odeme-toplamFiyat)+" TL dir");
				cikis=false;
				
		}
		
	}	else {
		System.out.println("Para ustunuz "+(odeme-toplamFiyat)+" TL dir");
		cikis=false;
	}
	
	} while (cikis!=false);
	System.out.println("===============================");
		System.out.println("****Afiyet Olsun****");
	}


	
	
	
	
	public static void urunsecme() {
		char devam;
		do {
			
			int secim;
			Runner obj=new Runner();
			Scanner scan=new Scanner(System.in);
			System.out.println("Lutfen almak istediginiz urunun numarasini giriniz");
			secim=scan.nextInt();
			obj.sepetUrun.add(obj.urunler.get(secim));
			obj.sepetFiyat.add(obj.fiyatlar.get(secim));
			toplamFiyat+=obj.fiyatlar.get(secim);
			System.out.println("Urun eklemek istiyor musunuz E/H");
			devam=scan.next().toUpperCase().charAt(0);
			
		} while (devam!='H');
		Runner obj=new Runner();
		System.out.println("Sectiginiz Urunler "+ toplamFiyat+" TL tutarindadir");
	}

	

}
