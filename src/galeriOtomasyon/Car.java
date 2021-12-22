package galeriOtomasyon;

public class Car extends Runner{

	protected String make;
	 
	protected String model;
	
	protected int year;
	
	
	 public Car() {

	    }

	
	public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
	
	
	
	
	
	
	
	public  String arabaMarkasi() {
		
		
		return make;
		
		
		
	}
	
	 public String arabaModel() {
	
		 return make;
		 
	 }
	 
	 
	 public int arabaYili() {
	
		 
		 
		 return year;
		 
		 
	 }
	
}
