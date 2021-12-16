package SchulVerwaltung;

import java.util.ArrayList;
import java.util.List;

import okulYonetimi.Ogretmen;

public class Lehrern {

	String name;
	String Idnummer;
	int alt;
	String Personalaktenummer;
	String abteilung;
	
	static List<Lehrern> lehrernList = new ArrayList<Lehrern>();
	
	
	Lehrern (){
		
	}

	public Lehrern(String name, String idnummer, int alt, String personalaktenummer, String abteilung) {
		super();
		this.name = name;
		Idnummer = idnummer;
		this.alt = alt;
		Personalaktenummer = personalaktenummer;
		this.abteilung = abteilung;
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

	public String getPersonalaktenummer() {
		return Personalaktenummer;
	}

	public void setPersonalaktenummer(String personalaktenummer) {
		Personalaktenummer = personalaktenummer;
	}

	public String getAbteilung() {
		return abteilung;
	}

	public void setAbteilung(String abteilung) {
		this.abteilung = abteilung;
	}

	@Override
	public String toString() {
		return "Lehrern name=" + name + "\t"+" Idnummer=" + Idnummer + "\t"+" alt=" + alt +"\t"+ " Personalaktenummer="
				+ Personalaktenummer +"\t"+ " abteilung=" + abteilung + "\n";
	}
	
	
	
	
	
}
