package SchulVerwaltung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javaProjects.okulYonetimi.Ogrenci;

public class Schuler {
	
	String name;
	String Idnummer;
	int alt;
	String nummer;
	String klasse;
	
	static List<Schuler> schulerList = new ArrayList<Schuler>();
	
	
	
	
	public Schuler() {
		
	}
	
	
	public Schuler(String name, String idnummer, int alt, String nummer, String klasse) {
		super();
		this.name = name;
		Idnummer = idnummer;
		this.alt = alt;
		this.nummer = nummer;
		this.klasse = klasse;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdnummer() {
		return Idnummer;
	}
	public void setIdnummer(String idnummer) {
		Idnummer = idnummer;
	}
	public int getAlt() {
		return alt;
	}
	public void setAlt(int alt) {
		this.alt = alt;
	}
	public String getNummer() {
		return nummer;
	}
	public void setNummer(String nummer) {
		this.nummer = nummer;
	}
	public String getKlasse() {
		return klasse;
	}
	public void setKlasse(String klasse) {
		this.klasse = klasse;
	}


	@Override
	public String toString() {
		return "Schuler [name=" + name + ", Idnummer=" + Idnummer + ", alt=" + alt + ", nummer=" + nummer + ", klasse="
				+ klasse + "]";
	}
	
	
}
