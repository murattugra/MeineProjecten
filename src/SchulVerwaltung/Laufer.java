package SchulVerwaltung;

public class Laufer {

	public static void main(String[] args) {
		
		Schuler schuler1=new Schuler("Moritz","432543",14,"345","11A");
		schuler1.schulerList.add(schuler1);
		Schuler schuler2=new Schuler("Felix","321234",14,"432","12A");
		schuler2.schulerList.add(schuler2);
		Schuler schuler3=new Schuler("Sasa","76543",13,"765","11A");
		schuler3.schulerList.add(schuler3);
		Schuler schuler4=new Schuler("Susanne","87654",14,"123","12A");
		schuler4.schulerList.add(schuler4);
		Schuler schuler5=new Schuler("Oli","973431",13,"345","11A");
		schuler5.schulerList.add(schuler5);
		
		Lehrern lehrer1=new Lehrern("Jana","1234",35,"200511a","Mathe");
		lehrer1.lehrernList.add(lehrer1);
		Lehrern lehrer2=new Lehrern("Menke","4321",40,"200012c","Biologie");
		lehrer2.lehrernList.add(lehrer2);
		Lehrern lehrer3=new Lehrern("Donner","2342",36,"200310b","Literatur");
		lehrer3.lehrernList.add(lehrer3);
		Lehrern lehrer4=new Lehrern("Steffani","1231",33,"20079f","Deutsch");
		lehrer4.lehrernList.add(lehrer4);
		Lehrern lehrer5=new Lehrern("Ellen","5424",45,"199510a","Allgemein");
		lehrer5.lehrernList.add(lehrer5);
		
		
		
		
		
		
		
		Formalien obj=new Formalien();
		obj.mainMenu();
		
	}

}
