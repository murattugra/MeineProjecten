package kleineProjecten;

import java.util.Scanner;

public class AtmSwitchCase {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in)	;
		
		
		int bakiye=2000;
		
		int islem;
		
		
		System.out.println("1 : Bakiye goruntuleme");
		System.out.println("2 : Para yatirma");
		System.out.println("3 : Para cekme");
		System.out.println("4 : Cikis");
		
		islem=scan.nextInt();
		
		
		switch(islem) {
		
		case 1 : 
			System.out.println("bakiyeniz : "+ bakiye );
			break;
			
		case 2 : 
			System.out.println("Yatirmak istediginiz miktari girin");
			int miktar=scan.nextInt();
			
			System.out.println("bakiyeniz : " +(bakiye+miktar));
			break;
		case 3 : 
			System.out.println("Cekmek istediginiz miktari girin");
			miktar=scan.nextInt();
			if (miktar>bakiye) {
				System.out.println("Bakiyeniz bu miktar icin yetersiz");
			}
			else {
				System.out.println("bakiyeniz : " +(bakiye-miktar));
			
			}
			break;
		case 4 :
			System.out.println("Islem sonlandriliyor...");
			break;
			default:
				System.out.println("Lutfen gecerli bir numara giriniz");
			
	scan.close();
	
		
		
		
		
		}
		}
		
		
		
		
		
		
	}


