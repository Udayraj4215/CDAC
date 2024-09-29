class Parenthesis {
    
    static final int MAX = 10;
    int top;
    char[] arr = new char[MAX]; // Use char array instead of String array
    
    Parenthesis() {
        top = -1;
    }
    
    boolean isEmpty() {
        return top < 0;
    }
    
    boolean push(char x) {
        if (top >= MAX - 1) {
            System.out.println("Stack overflow");
            return false; // Return false if stack is full
        }
        arr[++top] = x;
        return true;
    }
    
    char pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return '\0'; // Return null character on underflow
        }
        return arr[top--];
    }
    
    boolean check(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            if (ch == '(' || ch == '{' || ch == '[') {
                push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (isEmpty()) {
                    return false; // Unmatched closing bracket
                }
                
                char toElement = pop();
                if ((ch == ')' && toElement != '(') ||
                    (ch == '}' && toElement != '{') ||
                    (ch == ']' && toElement != '[')) {
                    return false; // Mismatched brackets
                }
            }
        }
        return isEmpty(); // Check if all opened brackets are closed
    }
    
    public static void main(String[] args) {
        Parenthesis stack = new Parenthesis();
        String expression = "((()))";
        boolean result = stack.check(expression);
        
        if (result) {
            System.out.println("Parentheses are balanced");
        } else {
            System.out.println("Parentheses are not balanced");
        }
    }
}