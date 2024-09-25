import java.util.Arrays;

class A{
	
	public int[] get() {
		int[] arr = {3,4,5,6,3,3,2,2,3};
		return arr;
	}
	
	public void printarr(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}

public class sortingmethod {
	public static void main(String[] args) {
		A a = new A();
		int[] array = a.get();
		a.printarr(array);
		Arrays.sort(array);
		a.printarr(array);
		
	}
}
