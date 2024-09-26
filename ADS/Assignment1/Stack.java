// Array implementation: static
class Stack1 {
    
    static final int MAX = 10; // static constant value
    int top;
    int a[] = new int[MAX];
    
    // constructor
    Stack1() {
        top = -1; // initial value
    }
    
    // underflow check
    boolean isEmpty() {
        return (top < 0);
    }
    
    // push operation
    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack overflow");
            return false;
        }
        a[++top] = x;
        return true;
    }
    
    // pop operation
    int pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return 0;
        }
        return a[top--];  
    }
    
    // peek operation
    int peek() {
        return top < 0 ? 0 : a[top];
    }
    
    // display stack elements
    void display() {
        if (isEmpty()) { // Corrected from ifEmpty() to isEmpty()
            System.out.println("Empty stack!!");
        } else {
            System.out.println("Stack elements are: ");
            show(top);
            System.out.println();
        }
    }
    
    // recursive show method to print elements
    void show(int index) {
        if (index < 0) { // Correct base condition
            return;
        }
        System.out.print(a[index] + " ");
        show(index - 1); // recursive call
    }


class Stack{
	
	static void reverse(StringBuffer str){
			int n = str.length();
			
			
		}
	
    // main method to test the stack operations
    public static void main(String[] args) {
	
    }
}
