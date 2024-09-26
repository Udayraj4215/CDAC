class UniqueString {
    static void display(String str, String res) {
        // Base case: If str is empty, print the result
        if (str.length() == 0) {
            System.out.println(res);
            return; // Ensure the function exits here
        }
        
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get current character
            // Remaining string excluding the current character
            String ros = str.substring(0, i) + str.substring(i + 1);
            // Recursive call with the remaining string
            display(ros, res + ch);
        }
    }

    public static void main(String[] args) {
        String s = "ABC";
        display(s, "");
    }
}
