package kleineProjecten;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class MarketProject {
	static List<String> gunler = new ArrayList<>(
			List.of("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));
	static List<Double> gunlerinKazanclari = new ArrayList<>();
	static List<String> ortalamaniUstundekiGunler = new ArrayList<>();
	static List<String> ortalamaniAltindakiGunler = new ArrayList<>();
	static double ortalamaKazanc = 0;

	public static void main(String[] args) {
		/*
		 * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
		 * yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
		 * method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
		 * gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
		 * kazandığını gösteren bir method yazınız.
		 *
		 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler) 
		 * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun.
		 * (gunlukKazanclar)
		 *  3. *  * Adım : While döngüsü ile kullanıcıdan 7 günlük
		 * kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle. 
		 * 4. Adım : * getOrtalamaKazanc() adlı method ile ortalama kazancı alın. 
		 * 5. Adım :	 * getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile
		 * tüm günleri ortalama kazanç ile karşılaştır ortalama kazançtan yüksekse o
		 * günleri return yap. 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı
		 * method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
		 * ortalama kazançtan aşağıysa o günleri return yap.
		 */

		int dongu = 0;
		double gunlukKazanc = 0;
		int i = 0;
		while (dongu != 7) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen " + gunler.get(i) + " gununun Kazancini giriniz");
			gunlukKazanc = scan.nextDouble();
			gunlerinKazanclari.add(gunlukKazanc);
			dongu++;
			i++;
		}
		System.out.println(gunlerinKazanclari);
		System.out.println("Haftalik Ortama Kazanciniz :"+getOrtalamaKazanc(gunlerinKazanclari));
		System.out.println("OrtalamaninAltindaKazancGünleri :"+getOrtalamaninAltindaKazancGünleri(i, gunlerinKazanclari));
		System.out.println("OrtalamaninUstundeKazancGünleri: "+getOrtalamaninUstundeKazancGünleri(i, gunlerinKazanclari));

	}

	

	private static double getOrtalamaKazanc(List<Double> gunlerinKazanclari) {

	for (int i = 0; i < gunlerinKazanclari.size(); i++) {
		ortalamaKazanc+=gunlerinKazanclari.get(i);
	}
		ortalamaKazanc=ortalamaKazanc/7;
		return ortalamaKazanc;

	}
	private static List<String> getOrtalamaninAltindaKazancGünleri(double ortalamaKazanc2, List<Double> gunlerinKazanclari2) {
		for (int i = 0; i < gunlerinKazanclari.size(); i++) {
			if (gunlerinKazanclari.get(i) < ortalamaKazanc) {
				ortalamaniAltindakiGunler.add(gunler.get(i));

			}
		}
		return ortalamaniAltindakiGunler;
		
	}
	
	private static List<String> getOrtalamaninUstundeKazancGünleri(double ortalamaKazanc,
			List<Double> gunlerinKazanclari) {
		
		for (int i = 0; i < gunlerinKazanclari.size(); i++) {
			if (gunlerinKazanclari.get(i) > getOrtalamaKazanc(gunlerinKazanclari)) {
				ortalamaniUstundekiGunler.add(gunler.get(i));

			}
		}

		return ortalamaniUstundekiGunler;

	}

}
