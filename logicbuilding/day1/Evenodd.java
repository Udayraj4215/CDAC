import java.util.Scanner;

class Evenodd{
public static void main(String args[]){
 
Scanner sc = new Scanner(System.in);

int num = sc.nextInt();

if(num%2 == 0){
System.out.println("It's a even number");
} else {
System.out.println("It's not a even number");
}

}
}