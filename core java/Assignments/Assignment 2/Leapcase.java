import java.util.Scanner;

public class Leapcase {
    public static void main(String[] args) {
        System.out.println("Enter a year to check if it's a leap year or not:");

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int a = year % 400 == 0 ? 1 : 0;
        int b = year % 100 == 0 ? 1 : 0;
        int c = year % 4 == 0 ? 1 : 0;

        switch (a) {
            case 1:
                System.out.println("It's a leap year");
                break;
            default:
                switch (b) {
                    case 1:
                        System.out.println("It's not a leap year");
                        break;
                    default:
                        switch (c) {
                            case 1:
                                System.out.println("It's a leap year");
                                break;
                            default:
                                System.out.println("It's not a leap year");
                                break;
                        }
                }
        }

        sc.close();
    }
}