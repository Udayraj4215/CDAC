package in.abstracts;

abstract class Test{
	public abstract void f1();
	public abstract void f2();
	public abstract void f3();
}

abstract class abstractTest extends Test {
	public void f1() {}
	public void f2() {}
	public void f3() {}
}

class A extends abstractTest{
	public void f1() {
		System.out.println("A.f1");
	}
}

class B extends abstractTest {
	public void f2() {
		System.out.println("A.f2");
	}
}

class C extends abstractTest{
	public void f3() {
		System.out.println("A.f3");
	}
}


public class Main {
public static void main(String[] args) {
	Test t1 = new A(); //upcasting
	t1.f1();  //dynamic method dispatch
	
	Test t2 = new B();
	t2.f2();
	
	Test t3 = new C();
	t3.f3();
}
}
