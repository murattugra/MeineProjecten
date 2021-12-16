package okulYonetimi;

import javaProjects.okulYonetimi.Ogrenci;

public class Runner {

	public static void main(String[] args) {
	
		Ogrenci ogrenci = new Ogrenci("Ali Yilmaz","15478541254", 14, "387"," 7");
		
		Islemler.ogrenciList.add(ogrenci);
		
		
		
		Islemler.anaMenu();
		
		
	}

}
