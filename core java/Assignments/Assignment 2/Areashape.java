import java.util.Scanner;

public class Areashape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("for your shape press number:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.println("4. rectangle");

        int side = sc.nextInt();

        switch (side) {
            case 1:
                System.out.println("enter your radius");
                double radius = sc.nextDouble();
                double area = 3.147 * radius * radius;
                System.out.println("area of circule is: " + area);
                break;

            case 2:
                System.out.println("enter your breadth");
                double br = sc.nextDouble();
                System.out.println("enter your height");
                double he = sc.nextInt();

                double areat = (he * br) / 2;
                System.out.println("area of triangle is: " + areat);

            case 3:
                System.out.println("enter side length");
                double sidesq = sc.nextDouble();
                double areasq = sidesq * 4;
                System.out.println("area of square is: " + areasq);

            case 4:
                System.out.println("enter your length");
                double len = sc.nextDouble();
                System.out.println("enter yout breadth");
                double brd = sc.nextDouble();
                double areare = (len * brd);
                System.out.println("area of recatangle is: " + areare);

        }

        sc.close();

    }

}
