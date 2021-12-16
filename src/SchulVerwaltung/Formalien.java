package SchulVerwaltung;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Formalien {

	
	static String personArt;
	

	public static void mainMenu() {
		Scanner scan=new Scanner(System.in);
		System.out.println("======================================================");
		System.out.println("********SCHÜLER - UND LEHRERVERWALTUNGSFELD *********");
		System.out.println("======================================================");
		System.out.println("1-SCHULER DIENSTWEG\n2-LEHRER DIENSTWEG\nQ-AUSGANG");
		String wahl=scan.next();
		
		switch(wahl) {
		
		case "1":
			personArt="schuler";
			dienstweg();
		case "2":
			personArt="lehrern";
			dienstweg();
		case "Q":		
			ausgang();
			break;
		default:
			System.out.println("False Wahl");
			mainMenu(); 
		}
		
		
		
	}
	private static void ausgang() {
		System.out.println("*****A U F W I E D E R S E H E N*****");
		
	}
	public static void dienstweg(){
		System.out.println("============= DIENSTWEG =============");
		System.out.println("1-HINZUFUGEN\n"
				+ "2-SUCHEN\n"
				+ "3-LISTEN\n"
				+ "4-LOSCHEN\n"
				+ "5-MAIN MENU\n"
				+ "Q-AUSGANG");
		Scanner scan=new Scanner(System.in);
		String wahl=scan.next();
		
		switch(wahl) {
		
		case "1":
			hinzufugen();
		case "2":
			suchen();	
		case "3":
			listen();
		case "4":
			loschen();
		case "5":
			mainMenu();
		case "Q":
			ausgang();
			break;
		default:System.out.println("False Wahl");
		dienstweg();
		
			
			
		
		}
		
		
		
		
	}
	private static void loschen() {
		if (personArt.equals("schuler")) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Tippen Sie bitte  Idnummer des Schulers");
			String suchen=scan.nextLine();
			boolean a=false;
			for (Schuler i : Schuler.schulerList) {
				
				if (i.Idnummer.equals(suchen)) {
					Schuler.schulerList.remove(i);	
					a=true;
					dienstweg();
				}
				}if(a==false) {
					System.out.println("Der Schuler konnte nicht gefunden werden");
					dienstweg();
				}
			
		}else {
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Tippen Sie bitte  Idnummer des Lehrers");
			String suchen=scan.nextLine();
			boolean a=false;
			for (Lehrern i : Lehrern.lehrernList) {
				
				if (i.Idnummer.equals(suchen)) {
					Lehrern.lehrernList.remove(i);	
					a=true;
					dienstweg();
				}}if(a==false) {
					System.out.println("Der Lehrer konnte nicht gefunden werden");
					dienstweg();
				}
			
		}
		
		
	}
	private static void listen() {
		if (personArt.equals("schuler")) {
		System.out.println(Schuler.schulerList.toString());
		dienstweg();
		}else {
			System.out.println(Lehrern.lehrernList.toString());
			dienstweg();
		}
		
	}
	private static void suchen() {
	if (personArt.equals("schuler")) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Tippen Sie bitte name des Schulers oder Idnummer des Schulers");
		String suchen=scan.nextLine();
		boolean a=false;
		for (Schuler i : Schuler.schulerList) {
			
			if (i.name.equalsIgnoreCase(suchen)||i.Idnummer.equals(suchen)) {
				System.out.println(i.toString());
				a=true;
				dienstweg();
			}
		}if (a==false){
			System.out.println("Der Schuler konnte nicht gefunden werden");
			dienstweg();
		}
		}else {
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Tippen Sie bitte name des Lehrers oder Idnummer des Lehrers");
			String suchen=scan.nextLine();
			boolean b=false;
			for (Lehrern i : Lehrern.lehrernList) {
				
				if (i.name.equalsIgnoreCase(suchen)||i.Idnummer.equals(suchen)) {
					System.out.println(i.toString());
					b=true;
					dienstweg();
					
				}
			
			
			}if(b==false) {
				System.out.println("Der Lehrer konnte nicht gefunden werden");
				dienstweg();
			}
			
			}
	}
		
		
		
	
	private static void hinzufugen() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Tippen Sie bitte Name");
		String name=scan.nextLine();
		System.out.println("Tippen Sie bitte Idnummer");
		String Idnummer=scan.next();
		System.out.println("Tippen Sie bitte Alt");
		int alt=scan.nextInt();
		
			
		if (personArt.equals("schuler")) {
			System.out.println("Tippen Sie bitte SchulNummer");
			String nummer=scan.nextLine();
			scan.next();
			System.out.println("Tippen Sie bitte Klasse");
			String klasse=scan.next();
			
			Schuler schuler=new Schuler(name,Idnummer,alt,nummer,klasse);
			
			schuler.schulerList.add(schuler);
			dienstweg();
			
		}else {
			System.out.println("Tippen Sie bitte Personalaktenummer");
			String Personalaktenummer=scan.nextLine();
			scan.next();
			System.out.println("Tippen Sie bitte abteilung");
			String abteilung=scan.next();
			
			Lehrern lehrer=new Lehrern(name,Idnummer,alt,Personalaktenummer,abteilung);
			
			Lehrern.lehrernList.add(lehrer);
			dienstweg();
		}
		
		
	}
}
