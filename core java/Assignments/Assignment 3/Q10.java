import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1");
        int a = sc.nextInt();
        System.out.println("Enter a number 2");
        int b = sc.nextInt();
        System.out.println("Enter a operation to perform + - * /");
        char ch = sc.next().charAt(0);
        
        switch (ch) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            default:
            System.out.println("enter a valied operation on number");
                break;
        }


    }
    
}
