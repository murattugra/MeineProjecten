package okulYonetimi;

import java.util.ArrayList;
import java.util.List;

public class OkulYonetimi {
	
	 static List<Ogretmen> ogretmen = new ArrayList<>();
	
	 static List<Ogrenci> ogrenci = new ArrayList<>();
	
	
	

	public static void main(String[] args) {
		
		ogrenciEkle(OkulYonetimi.ogrenci);
		
		ogretmenEkle(OkulYonetimi.ogretmen);
		
		Methodlar.anaMenu();
		
		
		
		
	
	}

	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void ogrenciEkle(List<Ogrenci> liste) {

		Ogrenci o1 = new Ogrenci("Ali Yilmaz","15478541254", 14, 387, 7);
		Ogrenci o2 = new Ogrenci("Ahmet Vural","25632145698", 15, 362, 8);
		Ogrenci o3 = new Ogrenci("Ayse Demir","21525478545", 13, 321, 6);
		Ogrenci o4 = new Ogrenci("Veli Can","21024580874", 16, 587, 9);
		Ogrenci o5 = new Ogrenci("Elif Fidan","56585412588", 8, 328, 2);
		
		liste.add(o1);
		liste.add(o2);
		liste.add(o3);
		liste.add(o4);
		liste.add(o5);
	}




	public static void ogretmenEkle(List<Ogretmen> liste) {


		Ogretmen og1 = new Ogretmen("Hakan Sahin","25452140088",36,"Matematik","200425");
		Ogretmen og2 = new Ogretmen("Ramazan Saygili","56541022891",42,"Ingilizce","198445");
		Ogretmen og3 = new Ogretmen("Saliha Demir","14520036577",29,"Muzik","202158");
		Ogretmen og4 = new Ogretmen("Ali Riza","25330256988",39,"Fen Bilgisi","200147");
		Ogretmen og5 = new Ogretmen("Fatma Yildirim","56541478954",45,"Sinif Ogretmeni","198254");
		
		liste.add(og1);
		liste.add(og2);
		liste.add(og3);
		liste.add(og4);
		liste.add(og5);
		
		
		
	}




	

}
