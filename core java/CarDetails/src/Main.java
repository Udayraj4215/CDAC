
class Vehical{
	private String name;
	private int year;
	
	Vehical(){
		this.name="";
		this.year=0;
	}
	
	Vehical(String name,int year){
		this.name=name;
		this.year=year;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public void setyear(int year) {
		this.year=year;
	}
	
	public String getname() {
		return name;
	}
	public int getyear() {
		return year;
	}
	
	public void getdata() {
		System.out.println("your car name is:	"+this.name);
		System.out.println("year for the car:	"+this.year);
	}
	
	
}

class car extends Vehical{
	private String model;
	
	car(){
		super();
		this.model= "";
	}
	
	car(String name, int year,String model){
		super(name,year);
		this.model="";
	}
	
	public void getdata() {
		
		System.out.println("model of the car"+this.model);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehical v1 = new car("car",2001,"red");
		v1.getdata();
		
	}

}
