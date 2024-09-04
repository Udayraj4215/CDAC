import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a height");

        double height = sc.nextDouble();

        System.out.println("Enter a weight");
        double weigth = sc.nextDouble();

        if (weigth/height <= 18.4){
            System.out.println("you are underweight");
        }
        else if(weigth/height >=18.5 && weigth/height <=25){
            System.out.println("You are normal");
        }

        else if (weigth/height <= 26) {
            System.out.println("you are over weigth");
        }

        sc.close();
    }
    
}
