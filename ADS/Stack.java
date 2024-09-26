class Stack{
    static final int MAX = 10;
    int top;
    int arr[] = new int[MAX];

    Stack(){
        top = -1;
    }

    boolean isEmpty(){
        if(top < 0){
            System.out.println("Stack is empty");
            return true;
        }
        System.out.println("Stack is not empty");
        return false;
    }

    boolean push(int x){
        if(top >= (MAX-1)){
            System.out.println("Stack overflow");
            return false;
        }
        arr[++top] = x;
        return true;
    }

    int peek(){
        return top<0?0:arr[top];
    }

    void show(int index){
        if(index<0){
            return;
        }

        System.out.println(arr[index]+"");
        show(index-1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.isEmpty();
        stack.push(20);
        stack.push(20);
        stack.show(stack.top);
    }
}