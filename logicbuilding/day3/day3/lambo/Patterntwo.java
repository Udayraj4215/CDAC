class Patterntwo {
    public static void main(String[] args) {
        int n = 5; // This is the number of rows for the pattern
        
        for (int i = 1; i <= n; i++) {
            // Print spaces to center-align the stars
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}