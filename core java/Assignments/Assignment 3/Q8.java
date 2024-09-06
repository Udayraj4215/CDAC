import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // byte
        System.out.print("Enter a byte value (-128 to 127): ");
        byte byteVar = sc.nextByte();
        
        System.out.println(Byte.toString(byteVar));
        System.out.println(Byte.valueOf(byteVar));


        // short
        System.out.print("Enter a short value (-32,768 to 32,767): ");
        short shortVar = sc.nextShort();
        System.out.println(Short.toString(shortVar));
        System.out.println(Short.valueOf(shortVar));
        
        // int
        System.out.print("Enter an int value (-2^31 to 2^31-1): ");
        int intVar = sc.nextInt();
        System.out.println(Integer.toString(intVar));
        System.out.println(Integer.valueOf(intVar));
        
        // long
        System.out.print("Enter a long value (-2^63 to 2^63-1): ");
        long longVar = sc.nextLong();
        System.out.println(Long.toString(longVar));
        System.out.println(Long.valueOf(longVar));
        
        // float
        System.out.print("Enter a float value: ");
        float floatVar = sc.nextFloat();
        System.out.println(Float.valueOf(floatVar));
        System.out.println(Float.toString(floatVar));
        
        // double
        System.out.print("Enter a double value: ");
        double doubleVar = sc.nextDouble();
        System.out.println(Double.valueOf(doubleVar));
        System.out.println(Double.toString(doubleVar));

        
        // char
        System.out.print("Enter a character: ");
        char charVar = sc.next().charAt(0);
        System.out.println(Character.valueOf(charVar));
        System.out.println(Character.toString(charVar));
        
        // boolean
        System.out.print("Enter a boolean value (true or false): ");
        boolean boolVar = sc.nextBoolean();
        System.out.println(Boolean.valueOf(boolVar));
        System.out.println(Boolean.toString(boolVar));
    }
    
}
