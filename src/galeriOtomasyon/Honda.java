package galeriOtomasyon;

public class Honda extends Car{


	protected String make="Honda";
	 
	protected String model="Accord";
	
	protected int year=2012;
	
	public static void main(String[] args) {
		
		Honda newHonda=new Honda();
		
		System.out.println("Araba Markasi  :   "+newHonda.arabaMarkasi());
		System.out.println("Arabas model   :   "+newHonda.arabaModel());
		System.out.println("Araba Yil      :   "+newHonda.arabaYili() );
		System.out.println();
		
		Honda honda2 = new Honda("Jazz",2019);
		System.out.println("Araba Markasi  :   "+honda2.arabaMarkasi());
		System.out.println("Arabas model   :   "+honda2.arabaModel());
		System.out.println("Araba Yil      :   "+honda2.arabaYili() );
		
		
		
		
		
	}

	 public Honda() {

	    }

	
	public Honda(String model, int year) {
       this.model = model;
       this.year = year;
   }
	
	
	
	public  String arabaMarkasi() {
		
		
		return make;
		
		
		
	}
	
	 public String arabaModel() {
	
		 return model;
		 
	 }
	 
	 
	 public int arabaYili() {
	
		 
		 
		 return year;
		 
		 
	 }
	
	
}
