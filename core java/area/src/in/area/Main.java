package in.area;

class Rectangle{
	private float length;
	private float breadth;
	private float area;
	Rectangle(){
		
	}
	
	
	public void setlength(int length) {
		this.length=length;
	}
	
	public void setbreadth(int breadth) {
		this.breadth=breadth;
	}
	
	public void calculatedarea() {
		this.area=this.length*this.breadth;
	}
	
	public float getarea() {
		return this.area;
	}
	
	
}

class circle{
	private float radius;
	private float area;
	circle(){
		
	}
}

public class Main {
	public static void main(String[] args) {
		float radius = 10.5f;
		float area = (float) (Math.PI * Math.pow(radius, 2));
		System.out.println("circle: "+area);
	}
	
	
public static void main1(String[] args) {
	float length = 10;
	float breadth = 20;
	float area = length * breadth;
	System.out.println("length:	"+area);
}
}
