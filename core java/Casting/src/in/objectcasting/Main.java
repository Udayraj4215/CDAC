package in.objectcasting;

class Parent {
	int num = 10;
	int num2 = 20;
	
	public void printdata(){
		System.out.println(num);
		System.out.println(num2);
	}
}

class Child extends Parent{
	int num3 = 30;
	
	
	@Override
	public void printdata() {
		super.printdata();
		System.out.println(num3);
	}
	
	public void sayhello() {
		System.out.println("Hello from child");
	}
}

public class Main {
public static void main(String[] args) {
	Parent p = new Child();
	Child c = (Child) p;
	p.printdata();
	c.sayhello();
//	c.printdata();
	System.out.println(c.num);
	System.out.println(c.num2);
	System.out.println(c.num3);
}
}
