package Hastana_Projesi;

import java.util.Scanner;

public class C01_HastaneRunner {

	private static C06_Hastane hastane = new C06_Hastane();

	static Scanner scan=new Scanner(System.in);	

	public static void main(String[] args) {
		
		System.out.println("Lutfen hasta Durumunu asagidakilerdeki gibi  giriniz \nAllerji , Bas agrisi, Diabet, Soguk alginligi, Migren, Kalp hastaliklari");
		
		String hastaDurumu=scan.nextLine();
	
	
		String unvan=doktorUnvan(hastaDurumu);
		
		hastane.setDoktor(doktorBul(unvan));
		
	System.out.println("Doktor ismi : " +hastane.getDoktor().getIsim());
	System.out.println("Doktor Soyisim : "+hastane.getDoktor().getSoyIsim());		
	System.out.println("Doktor Unvani : "+hastane.getDoktor().getUnvan());
	}

	private static String doktorUnvan(String aktuelDurumu) {
	 
	
		if (aktuelDurumu.equalsIgnoreCase("Alerji")) {
			return hastane.unvanlar[0];
		}

		else if (aktuelDurumu.equalsIgnoreCase("Bas Agrisi")) {
			return hastane.unvanlar[1];
		}

		else if (aktuelDurumu.equalsIgnoreCase("Diabet")) {
			return hastane.unvanlar[2];
		}
		else if (aktuelDurumu.equalsIgnoreCase("Soguk alginligi")) {
			return hastane.unvanlar[3];
		}

		else if (aktuelDurumu.equalsIgnoreCase("Migren")) {
			return hastane.unvanlar[4];
		}

		else if (aktuelDurumu.equalsIgnoreCase("Kalp Hastaliklari") ){
			return hastane.unvanlar[5];
		}
		
			return "yanlis Unvan";
		
		
		
		
	}
	
	
	
	public static C05_Doktor doktorBul(String unvan) {
		
		C05_Doktor doktor=new C05_Doktor();
	
	for (int i = 0; i < hastane.unvanlar.length; i++) {
		
		
		
		
		
		if (unvan.equalsIgnoreCase(hastane.unvanlar[i])) {
			doktor.setIsim(hastane.doctorIsimleri[i]);
			doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
			doktor.setUnvan(unvan);
		}
	}

		return doktor;
		
	
		
	
	


}

	
	
}
