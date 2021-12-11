package buchhandlung;

import java.util.Scanner;

public class CagirmaClassi {

	
	public static void main(String[] args) {
		
		
	
		int secim=0;
		do {
			
			secim=menu(secim);
			int noileArama=0;
			String bilgiileArama="";
			switch(secim) {
			
			case 1:
				
				KitapEkleme ekle=new KitapEkleme();
				
				ekle.main(args);
		
				break;
			case 2:
				Scanner scan1=new Scanner(System.in);
				System.out.println("Goruntulemek istediginiz kitabin numarasini giriniz");
				noileArama=scan1.nextInt();
				boolean c=false;
				for (int i = 0; i < Depo.kitapNo.size(); i++) {
					if (noileArama== Depo.kitapNo.get(i)) {
						System.out.println("KitapNo : "+Depo.kitapNo.get(i));
						System.out.println("Kitap Adi : "+Depo.kitapAdi.get(i));
						System.out.println("Yazari : "+Depo.kitapYazar.get(i));
						System.out.println("Fiyati : "+Depo.kitapFiyat.get(i)+" Tl");
						c=true;
						break;
					}
				}if (c==false) {
					System.out.println("Yanlis no giridiniz");
				}
				noileArama=0;
				break;
				case 3:
					Scanner scan2=new Scanner(System.in);
					System.out.println("Goruntulemek istediginiz Kitabin adini,Yazarini  giriniz");
					bilgiileArama=scan2.nextLine();
					boolean a=false;
					for (int i = 0; i < Depo.kitapAdi.size(); i++) {
						if (Depo.kitapAdi.get(i).equalsIgnoreCase(bilgiileArama)||
							Depo.kitapYazar.get(i).equalsIgnoreCase(bilgiileArama)) {
							System.out.println("KitapNo : "+Depo.kitapNo.get(i));
							System.out.println("Kitap Adi : "+Depo.kitapAdi.get(i));
							System.out.println("Yazari : "+Depo.kitapYazar.get(i));
							System.out.println("Fiyati : "+Depo.kitapFiyat.get(i)+" Tl");
							a=true;
							break;
						
						}
						
					}if(a==false) {
						System.out.println("Bu kitap mevcut degildir");
					}
				
					bilgiileArama="";
				break;
			case 4:
				Scanner scan3=new Scanner(System.in);
				System.out.println("Silmek istediginiz kitabin numarasini giriniz");
				noileArama=scan3.nextInt();
				boolean b=false;
				for (int i = 0; i < Depo.kitapNo.size(); i++) {
					if (noileArama==Depo.kitapNo.get(i)) {
						Depo.kitapAdi.remove(i);
						
						Depo.kitapFiyat.remove(i);
						Depo.kitapNo.remove(i);
						Depo.kitapYazar.remove(i);
						b=true;
					}
				}if (b==false) {
					System.out.println("Yanlis numara girdiniz");
				}
				noileArama=0;
				break;
			
			case 5:
				for (int i = 0; i < Depo.kitapAdi.size(); i++) {
					System.out.println("KitapNo   : "+Depo.kitapNo.get(i));
					System.out.println("Kitap Adi : "+Depo.kitapAdi.get(i));
					System.out.println("Yazari    : "+Depo.kitapYazar.get(i));
					System.out.println("Fiyati    : "+Depo.kitapFiyat.get(i)+" Tl");
					System.out.println();
				}
		
				break;
			case 6:
				System.out.println("Tesekkurler Cikis Yapiliyor........");
				break;
			default:
				System.out.println("Yanlis giris yaptiniz");
	
			
		} 
		}while (secim!=6);
		
	}

	public static int menu(int secim) {
		System.out.println("************JAVA KITAPCISINA HOSGELDINIZ**************");
		System.out.println("********Lutfen yapmak istediginiz islemi giriniz******");
		System.out.println("1-kitap ekle");
		System.out.println("2-numara ile kitap goruntule");
		System.out.println("3-bilgi ile kitap goruntule");
		System.out.println("4-numara ile kitap sil");
		System.out.println("5-tum kitaplari listele");
		System.out.println("6-cikis");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		secim=scan.nextInt();
		
		
		return secim;
	
		
	}
	


}
		
		
		
		
		
		
		
		
		
		
	


