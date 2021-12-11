package MarketProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarketRunner {

	public static void main(String[] args) {
		
		List<String> sepetUrun=new ArrayList<>();
		List<Double> sepetFiyat=new ArrayList<>();
		List<Double> sepetKilo=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		
		double toplamTutar = 0;
		char devam='E';
		int noSecim;
		double kilo;
	 do {
		 System.out.println("*********ARSLAN MARKETE HOSGELDINIZ*******");
			
			UrunList obj=new UrunList();
			System.out.println("No         Urun         Fiyat");
			System.out.println("====      =======       ========");
			for (int i = 0; i <obj.urun.size() ; i++) {
				System.out.print(obj.no.get(i)+"         ");
				System.out.print(obj.urun.get(i)+"          ");
				System.out.print(obj.fiyat.get(i));
				System.out.println();
				
				}
			System.out.println();
			System.out.println("Lutfen urun nosuna gore usun seciniz");
			noSecim=scan.nextInt();
			sepetUrun.add(obj.urun.get(noSecim));
			System.out.println("Kac kilo almak istiyorsunuz");
			kilo=scan.nextDouble();
			sepetKilo.add(kilo);
			sepetFiyat.add(kilo*obj.fiyat.get(noSecim));
			toplamTutar+=kilo*obj.fiyat.get(noSecim);
			System.out.println("Baska urun almak istiyor musunuz E/H?");
			devam=scan.next().toUpperCase().charAt(0);
			
	 
	 }while (devam!='H');	
			System.out.println("********SEPETINIZ********");
			for (int i = 0; i < sepetKilo.size(); i++) {
				System.out.print(sepetUrun.get(i)+"         ");
				System.out.print(sepetKilo.get(i)+"Kg       ");
				System.out.println(sepetFiyat.get(i)+" $");
				System.out.println();
			}
			
			System.out.println("Toplam Tutar : "+toplamTutar+" $");
			System.out.println();
				double nakit = 0;
				String ek="";
				double nakit1;
	do {
		Scanner scan1=new Scanner(System.in);
		System.out.println("Lutfen "+ek+" Nakit Girininiz");
		nakit1=scan1.nextDouble();
		nakit+=nakit1;
		if (nakit<toplamTutar) {
			System.out.println("Lutfen "+(toplamTutar-nakit)+" $ daha odemeniz gerekiyor");
			ek=(toplamTutar-nakit)+" $ daha";
			
		}else {
			System.out.println("Para ustu "+(nakit-toplamTutar)+" $ dir");
		}
		
		
		
	} while (!(nakit==toplamTutar ||nakit>toplamTutar));	

		
	 
	}
}
