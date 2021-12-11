package kleineProjecten;

import java.util.Scanner;

public class ATM2 {

	public static void main(String[] args) {
	 /*ATM 
		Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini
		 yanlis girerse tekrar isteyin.
		Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
		Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
		Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.
		Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
		Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
		 eger değilse menü ekranina geri donsun.
		Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
		*/
		
		String kk="12312";
		String sifre="3344";
		int bakiye=5000;
		
		Scanner scan=new Scanner(System.in);
	
		String kkGiris;
		String sifreGiris;
		int sayac=0;
		do {
			System.out.println("Lutfen KK numarasi giriniz");
			kkGiris=scan.nextLine();
			System.out.println("Lutfen sifrenizi giriniz");
			sifreGiris=scan.nextLine();
			sayac++;
			if (sayac==3) {
				System.out.println("Kredi kartiniz kilitlendi lutfen musteri hizmetleri ile gorusun");
				break;
				
			}
		}while(!kk.replaceAll(" ", "").equals(sifreGiris)&&!sifre.equals(sifreGiris));
		
	
		System.out.println("Girisiniz Tanimlandi");
			
		
		int islem;
		int miktar ;
		String IBAN="";
		do {
			System.out.println("Yapmak istediginiz islemin numrasiniz yaziniz");
			System.out.println("Bakiye sorgula(1)");
			System.out.println("Para yatirma(2)");
			System.out.println("Para çekme(3)");	
			System.out.println("Para gönderme(4)");
			System.out.println("sifre değiştirme(5)");
			System.out.println("Cikis(6)");
			islem=scan.nextInt();
			if (islem<1&&islem>6) {
				System.out.println("Lutfen gecerli numara giriniz");
				break;
			}
			switch(islem) {
			case 1:System.out.println("Bakiyeniz :"+bakiye+"TL dir");
			break;
			case 2:System.out.println("Yatirmak istediginiz miktari giriniz");
			miktar=scan.nextInt();
			if (miktar>bakiye) {
				System.out.println("Bakiyeniz yetersiz");
				break;
			}else {
				System.out.println(miktar+"TL Yatirildi");
				bakiye+=miktar;
				System.out.println("Bakiyeniz :"+bakiye+" TL dir");
				break;
			}
			case 3:System.out.println("Cekmek istediginiz miktarin giriniz");
			miktar=scan.nextInt();
			if (miktar>bakiye) {
				System.out.println("Bakiyeniz yetersiz");
				break;
			}else {
				System.out.println("Gule gule harcayim...");
				bakiye-=miktar;
				System.out.println("Bakiyeniz :"+bakiye);
				break;
			}
			case 4: 
				Scanner scan1=new Scanner(System.in);
				System.out.println("Gondermek istediginiz miktari yaziniz");
			miktar=scan1.nextInt();
			if (miktar<=bakiye) {
				Scanner scan11=new Scanner(System.in);
				System.out.println("Gondermek istediginiz IBAN i giriniz");
				IBAN=scan11.nextLine();
				if (IBAN.startsWith("TR")&&IBAN.replaceAll(" ","").length()==26) {
					bakiye-=miktar;
					System.out.println(miktar+"TL gosderidi");
					System.out.println("Bakiyeniz :"+bakiye);
					break;
				}else {
					System.out.println("IBAN TR ile baslamali ve 26 karakter olmali");
					break;
				}
		}	else {
			System.out.println("Bakiyeniz yetersiz");
			break;
		}case 5:Scanner scan11=new Scanner(System.in);
			int a=0;
			String yenisifre="";
			do {
				System.out.println("sifrenizi giriniz");
				yenisifre=scan11.nextLine();
				if (sifre.equals(yenisifre)) {
					System.out.println("Yeni sifre giriniz");
					sifre=scan11.nextLine();
					System.out.println("Sifreniz degistirildi");
					break;
				}else {
					System.out.println("Dogru sifre giriniz");
				}
				
				
			}while(a==3);
			break;
			case 6:System.err.println("Islem sonlandiriliyor.....");
			break;
			default:System.out.println("Lutfen dogru numara giriniz");
		}
		}while(islem!=6);
			
			scan.close();
}
}