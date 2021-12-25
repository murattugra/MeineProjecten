package hastane_Projesi_bitti;


public class HastaneRunner {
	
	
	private static Hastane hastane1 = new Hastane ();


	public static void main(String[] args) {

													// test datalari
		String hastaDurumu = "Diabet";	// Bas agrisi		Diabet		Soguk alginligi			Migren			Kalp hastaliklari		Allerji
		
		String unvan = doktorUnvan(hastaDurumu);
		
		
		hastane1.setDoktor(doktorBul(unvan));
		hastane1.setHasta(hastaBul(hastaDurumu));
		
		System.out.println("Doktor ismi: "+hastane1.getDoktor().getIsim());
        System.out.println("Doktor soy isim: "+hastane1.getDoktor().getSoyIsim());
        System.out.println("Doktor unvani: "+hastane1.getDoktor().getUnvan());
        System.out.println("Hasta ismi: "+hastane1.getHasta().getIsim());
        System.out.println("Hasta soy ismi: "+hastane1.getHasta().getSoyIsim());
		System.out.println("Hasta ID: "+hastane1.getHasta().getHastaID());
		System.out.println("Hasta durumu: "+hastaDurumu);
		
	}

	public static String doktorUnvan(String aktuelDurum) {
		
		if (aktuelDurum.equalsIgnoreCase("Allerji") || aktuelDurum.equalsIgnoreCase("Alerji")) {
			return "Allergist";
		} else if (aktuelDurum.equalsIgnoreCase("Bas agrisi") ){
			return "Norolog";
		}else if (aktuelDurum.equalsIgnoreCase("Diabet") || aktuelDurum.equalsIgnoreCase("Diyabet") ){
			return "Genel Cerrah";
		}else if (aktuelDurum.equalsIgnoreCase("Soguk alginligi") ){
			return "Cocuk Doktoru";
		}else if (aktuelDurum.equalsIgnoreCase("Migren") ){
			return "Dahiliye";
		}else if (aktuelDurum.equalsIgnoreCase("Kalp hastaliklari") ){
			return "Kardiolog";
		}else {
			return "yanlis unvan";
		}
		
	
		
	}
	
	
	public static Doktor doktorBul(String unvan){ 
		
		Doktor doktor= new Doktor();

		
		for (int i = 0; i < doktor.unvanlar.length; i++) {
			
			if (doktor.unvanlar[i].equalsIgnoreCase(unvan)) {
				
				doktor.setIsim(doktor.doktorIsimleri[i]);
				doktor.setSoyIsim(doktor.doktorSoyIsimleri[i]);
				doktor.setUnvan(doktor.unvanlar[i]);
				
			} 
		}
		
		
		
		 return doktor;

	}
	
	
	public static Durum hastaDurumuBul(String aktuelDurum) {
		
		
		Durum hastaDurumu = new Durum();
		
		
		if (aktuelDurum.equalsIgnoreCase("Allerji") || aktuelDurum.equalsIgnoreCase("Bas agrisi") || aktuelDurum.equalsIgnoreCase("Diabet") || aktuelDurum.equalsIgnoreCase("Diyabet") || aktuelDurum.equalsIgnoreCase("Soguk alginligi")) {
			
			hastaDurumu.setAciliyet(false);
			
		} else if(aktuelDurum.equalsIgnoreCase("Migren") || aktuelDurum.equalsIgnoreCase("Kalp hastaliklari")) {

			hastaDurumu.setAciliyet(true);
		}else {
			
			System.out.println("Gecerli bir durum degil");
		}
		
		
		return hastaDurumu;
		
	}
	
	
	public static Hasta hastaBul(String aktuelDurum) {
		
		Hasta hasta = new Hasta();
		
		
		
		for (int i = 0; i < hasta.durumlar.length; i++) {
			
			if (hasta.durumlar[i].equalsIgnoreCase(aktuelDurum)) {
				
				hasta.setIsim(hasta.hastaIsimler[i]);
				hasta.setSoyIsim(hasta.hastaSoyIsimleri[i]);
				hasta.setHastaID(hasta.hastaIDleri[i]);
				
				
			}
		}
		
		
		hastaDurumuBul(aktuelDurum).setAktuelDurum(aktuelDurum);
		
		
		
		return hasta;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
