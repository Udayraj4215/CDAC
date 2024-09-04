import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a month number");

        int num = sc.nextInt();

        switch(num){
            case 1 : case 2: case 12 :
            System.out.println("it's Winter");
            break;
            case 3: case 4: case 5:
            System.out.println("It's a Spring");
            break;
            case 6: case 7:case 8:
            System.out.println("It's a Summer");
            break;
            case 9: case 10: case 11:
            System.out.println("it's a Autumn"); 
            break;
        }
        sc.close();
    }
    
}
