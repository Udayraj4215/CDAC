package in.diagram;

import java.util.Scanner;

abstract class Shape{
	protected float area;
	
	Shape(){
	}
	public abstract void acceptRecord(Scanner sc);
	public abstract void calculatarea();
	public final void printRecord() {
		System.out.println("Area: "+this.area);
	}
	
}

class Rectangle extends Shape{
	private float length;
	private float bredth;
	Rectangle(){
		
	}
	
	public void setlength(float length) {
		this.length=length;
	}
	
	public void setbredth(float bredth) {
		this.bredth=bredth;
	}
	
	public float getlength() {
		return length;
	}
	
	public float getbredth() {
		return bredth;
	}
	
	@Override
	public void acceptRecord(Scanner sc) {
		System.out.println("Length: ");
		this.length=sc.nextInt();
		System.out.println("breadth:");
		this.bredth=sc.nextInt();
	}

	@Override
	public void calculatarea() {
		this.area = this.length * this.bredth;
	}
}

class Circle extends Shape{
	private float radius;
	Circle(){
		
	}
	public void setradius(float radius) {
		this.radius=radius;
	}
	
	public float getradius() {
		return radius;
	}
	
	public void acceptRecord(Scanner sc) {
		System.out.println();
		this.radius=sc.nextInt();
	}
	
	@Override
	public void calculatarea() {
		this.area= (float) (Math.PI * Math.pow(this.radius, 2));
		
	}
}

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.circle");
		System.out.println("Enter choice: ");
		return sc.nextInt();
	}
public static void main(String[] args) {
	int choice;
//	try {
	while((choice = Main.menuList()) !=0 ) {
		Shape shape = null;
		switch( choice ) {
		case 1:
			shape = new Rectangle();
			break;
		case 2:
			shape = new Circle();
			break;
		}
		if(shape != null) {
			shape.acceptRecord(sc);
			shape.calculatarea();
			shape.printRecord();
		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
	}
}
}
