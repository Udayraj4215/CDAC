

class Animal{
	private String name;
	
	Animal(){
	}
	
	Animal(String name){
		this.name=name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public String getname() {
		return this.name;
	}
	
	public void printData() {
		System.out.println("Animal name is:	"+this.name);
	}
}


class Dog extends Animal{
	
	Dog(String name){
		super(name);
	}
	
	public void bark() {
		
		System.out.println("baw baw!!!");
	}
	
}

public class Main {
public static void main(String[] args) {
	Animal ani = new Dog("Dog");
	Dog dg = (Dog) ani;
	ani.printData();
	dg.bark();
}
}
