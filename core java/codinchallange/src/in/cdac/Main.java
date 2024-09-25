package in.cdac;
class Base{
	Base(){
		System.out.println("First constructor");
	}
}

class Derived extends Base{
	Derived(){
		System.out.println("Second constructor");
	}
}

class Deriderives extends Derived{
	Deriderives(){
		System.out.println("Deriderives constructor");
	}
}

public class Main {
	public static void main(String[] args) {
		new Deriderives();
	}

}
