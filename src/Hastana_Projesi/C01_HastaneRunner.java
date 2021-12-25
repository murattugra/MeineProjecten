package Hastana_Projesi;

import java.util.Scanner;

public class C01_HastaneRunner {

	private static C06_Hastane hastane = new C06_Hastane();

	static Scanner scan = new Scanner(System.in);

	static C03_Durum durumu =new  C03_Durum();
	
	public static void main(String[] args) {
	
		System.out.println(
		"Doktora yonlendirmek icin Lutfen hasta Durumunu asagidakilerdeki gibi  giriniz \nAlerji , Bas agrisi, Diabet, Soguk alginligi, Migren, Kalp hastaliklari");

		String hastaDurumu = scan.nextLine();

		String unvan = doktorUnvan(hastaDurumu);

		
		
		hastane.setDoktor(doktorBul(unvan));
		hastane.setHasta(hastaBul(hastaDurumu));
		hastaDurumuBul(hastaDurumu);
		System.out.println("Doktor ismi      : " + hastane.getDoktor().getIsim());
		System.out.println("Doktor Soyisim   : " + hastane.getDoktor().getSoyIsim());
		System.out.println("Doktor Unvani    : " + hastane.getDoktor().getUnvan());
		System.out.println();
		System.out.println("Hasta adi        : " + hastane.getHasta().getIsim());
		System.out.println("Hasta soyadi     : " + hastane.getHasta().getSoyIsim());
		System.out.println("Hasta ID         : " + hastane.getHasta().getHastaID());
		System.out.println("Aciliyet Durumu  : " + durumu.isAciliyet());
	}

	private static String doktorUnvan(String aktuelDurumu) {

		if (aktuelDurumu.equalsIgnoreCase("Alerji")) {
			return "Allergist";
		}

		else if (aktuelDurumu.equalsIgnoreCase("Bas Agrisi")) {
			return "Norolog";
		}

		else if (aktuelDurumu.equalsIgnoreCase("Diabet")) {
			return "Genel cerrah";
		} else if (aktuelDurumu.equalsIgnoreCase("Soguk alginligi")) {
			return "Cocuk doktoru";
		}

		else if (aktuelDurumu.equalsIgnoreCase("Migren")) {
			return "Dahiliye";
		}

		else if (aktuelDurumu.equalsIgnoreCase("Kalp Hastaliklari")) {
			return "Kardiolog";
		}else {
			System.out.println("Gecersiz Hasta durumu");
			return "yanlis Unvan";
		}

		

	}

	public static C05_Doktor doktorBul(String unvan) {

		C05_Doktor doktor = new C05_Doktor();

		for (int i = 0; i < hastane.unvanlar.length; i++) {

			if (unvan.equalsIgnoreCase(hastane.unvanlar[i])) {
				doktor.setIsim(hastane.doctorIsimleri[i]);
				doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
				doktor.setUnvan(unvan);
			}
		}

		return doktor;

	}

	public static C03_Durum hastaDurumuBul(String aktuelDurum) {
		
		aktuelDurum.toLowerCase();

		switch (aktuelDurum) {
		case "alerji":
			durumu.setAciliyet(false);
			break;
		case "bas agrisi":
			durumu.setAciliyet(false);
			break;
		case "diabet":
			durumu.setAciliyet(false);
			break;
		case "soguk alginligi":
			durumu.setAciliyet(false);
			break;
		case "migren":
			durumu.setAciliyet(true);
			break;
		case "kalp hastaliklari":
			durumu.setAciliyet(true);
			break;
		default:
			System.out.println("Gecerli bir durum degil");
			break;
		}
		System.out.println(durumu);
		return durumu;
		
	}

	public static C04_Hasta hastaBul(String aktuelDurum) {
		C04_Hasta hasta = new C04_Hasta();

		for (int i = 0; i < hastane.hastaIsimleri.length; i++) {
			if (aktuelDurum.equalsIgnoreCase(hastane.durumlar[i])) {
				hasta.setIsim(hastane.hastaIsimleri[i]);
				hasta.setSoyIsim(hastane.hastaSoyIsimleri[i]);
				//hasta.setHastaDurumu(hastane.durumlar[i]);
				hasta.setHastaID(hastane.hastaIDleri[i]);
			}
		}

		return hasta;

	}

}
