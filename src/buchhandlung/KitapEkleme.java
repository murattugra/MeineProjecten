package buchhandlung;

import java.util.Scanner;

public class KitapEkleme {

	public static void main(String[] args) {

		CagirmaClassi obj=new CagirmaClassi();
		
		ekleme(CagirmaClassi.class);
		

		
	}

	private static void  ekleme(Class<CagirmaClassi> class1) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Eklemek istediginiz kitap ismini giriniz");
		Depo.kitapAdi.add(scan.nextLine());
		System.out.println("Kitabin yazarini yaziniz");
		Depo.kitapYazar.add(scan.nextLine());
		System.out.println("Kitabin fiyatini yaziniz");
		Depo.kitapFiyat.add(scan.nextDouble());
		Depo.kitapNo.add(Depo.kitapNo.get(Depo.kitapNo.size()-1)+1);
		
		
	
		
		
	}

}
