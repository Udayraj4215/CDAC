import java.util.Arrays;  // Import java.util.Arrays for Arrays.toString()

class Program {
	static int[] getarray() {
		int[] arr = {1, 2, 5, 4, 3, 6, 7, 5, 4};
		return arr;
	}
	
	static void printRecord(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}

public class sortingArrays {  // Renamed class to avoid conflict with java.util.Arrays
	public static void main(String[] args) {
		int[] array = Program.getarray();  // Call static method directly
		Program.printRecord(array);        // Call static method directly to print
		Arrays.sort(array);
		Program.printRecord(array);
		
	}
}
