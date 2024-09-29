import java.util.Scanner;
class Stringpalindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to cheak:");
		String str = sc.nextLine();
		
		StringBuffer buffstr = new StringBuffer(str);
		
		StringBuffer rev = new StringBuffer(buffstr);
		rev.reverse();
		
		if(str.equals(rev.toString())){
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}
}