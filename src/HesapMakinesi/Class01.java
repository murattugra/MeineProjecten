package HesapMakinesi;

import java.util.Scanner;

public class Class01 {

	static Scanner scan=new Scanner(System.in);
	
	static double kova;
	
	static String islem1 ="";
	
	public static void main(String[] args) {
		
		
		
		double sayi;
		System.out.println("Sayi giriniz");
		kova=scan.nextDouble();
		islem1=islemekrani();
		do {
		
			
			switch (islem1) {
			case "+":
				toplama(kova);
				System.out.println("ara sonuc :"+kova);
				islem1=islemekrani();
				break;
			case "-":
				cikarma(kova);
				System.out.println("ara sonuc :"+kova);
				islem1=islemekrani();
				break;
			case "/":
				bolme(kova);
				System.out.println("ara sonuc :"+kova);
				islem1=islemekrani();
				break;
			case "*":
				carpma(kova);
				System.out.println("ara sonuc :"+kova);
				islem1=islemekrani();
				break;
			case "=":
				break;
			default:
				break;
			}
			
	
		} while (!islem1.equals("="));
		System.out.println("Bitis sonuc : "+kova);
		
		
		

	}

	private static String islemekrani() {
		System.out.println("+ : toplama\n- : cikarma\n/ : bolme\n* : carpma\n= : sonuc");
		String islem = scan.next();
		return islem;
		
	}

	private static void carpma(double sayi) {
		System.out.println("Sayi giriniz");
		double sayi1=scan.nextDouble();
		kova=sayi*sayi1;
		
	}

	private static void bolme(double sayi) {
		System.out.println("Sayi giriniz");
		double sayi1=scan.nextDouble();
		kova=sayi/sayi1;
	}

	private static void cikarma(double sayi) {
		System.out.println("Sayi giriniz");
		double sayi1=scan.nextDouble();
		kova=sayi-sayi1;
	}

	private static void toplama(double sayi) {
		System.out.println("Sayi giriniz");
		double sayi1=scan.nextDouble();
		kova=sayi+sayi1;
		
	}

}
