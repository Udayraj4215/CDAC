import java.util.Scanner;
class ReverseString{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int num = str.length();
		System.out.println(num);
		String newstr = "";
		
		for(int i = str.length()-1; i>= 0;i--){
			char ch = str.charAt(i);
			newstr = newstr+ch;
		}
		
		System.out.println(newstr);
		sc.close();
	}
}