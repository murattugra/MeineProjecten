package galeriOtomasyon;

public class Toyota extends Car{

	protected String make="Toyota";
	
	protected String model="Accord";
	
	protected int year=2017;
	
	
	
	public static void main(String[] args) {
		
		Toyota araba1= new Toyota();
		
		System.out.println("Araba markasi  : "+araba1.arabaMarkasi());
		System.out.println("Araba modeli   : "+araba1.arabaModel());
		System.out.println("Araba yili     : "+araba1.arabaYil());
		
		System.out.println();
		
		Toyota araba2= new Toyota ("Corolla", 2017);
		
		System.out.println("Araba markasi  : "+araba2.arabaMarkasi());
		System.out.println("Araba modeli   : "+araba2.arabaModel());
		System.out.println("Araba yili     : "+araba2.arabaYil());
		
		
		
	}
	
	
	public Toyota(String make, String model,int year) {
		this.model=model;
		this.year=year;
	}
	
	
	
	
	
	public Toyota() {
		// TODO Auto-generated constructor stub
	}


	public Toyota(String string, int i) {
		// TODO Auto-generated constructor stub
	}


	public String arabaMarkasi() {
		
		return make;
		
	}
	
	
	public String arabaModeli() {
		
		return model;
		
	}
	
	public int arabaYil() {
		
		return year;
		
		
	}
	
	
	
}
