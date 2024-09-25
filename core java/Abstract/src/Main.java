
abstract class A{
	public final void f1() {
		System.out.println("a.f1");
	}
	public void f2() {
		System.out.println("a.f2");
	}
	public abstract void f3(); 
}

class B extends A {
	public final void f2() {
		System.out.println("b.f2");
		}
	
	public void f3() {
		System.out.println("b.f3");
	}
}

class C extends B{
	public final void f3() {
		System.out.println("c.f3");
	}
}

public class Main {
	public static void main(String[] args) {
		C c = new C();
		c.f1();
		c.f2();
		c.f3();
	}
}
