package in.soleconstructor;

abstract class Test{
	private int num;
	private int num2;
	
	Test(int num,int num2){ // sole constructor
		this.num=num;
		this.num2=num2;
	}
	
	public void printrecord() {
		System.out.println("num1: "+num);
		System.out.println("num2: "+num2);
	}
}

class Derived extends Test{
	private int num3;
	public Derived(int num1, int num2, int num3) {
		super(num1, num2);
		this.num3=num3;
	}
	
	public void printrecord() {
		super.printrecord();
		System.out.println("num3: "+num3);
	}
}

public class Main {
	public static void main(String[] args) {
		Derived derived = new Derived(3,5,9);
		derived.printrecord();
	}

}
