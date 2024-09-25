import java.util.Arrays;

class arr{
	public int[] getarr() {
		int[] array = {3,3,4,5,5,3,66,32,2,};
		return array;
	}
	
	public void printarray(int arr[]) {
		System.out.println(Arrays.toString(arr));
	}
}

public class Sorting {
public static void main(String[] args) {
	arr a = new arr();
	int[] newarr = a.getarr();
	a.printarray(newarr);
	Arrays.sort(newarr);
	a.printarray(newarr);
	
}
}
