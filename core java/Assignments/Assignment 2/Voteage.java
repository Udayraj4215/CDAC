import java.util.Scanner;
public class Voteage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = sc.nextInt();

        if (age < 18){
            System.out.println("you are underage for voting");
        } 
        else if(age >=18){
            System.out.println("you ar eligible for voting");
        }

        sc.close();
    }
    
}
