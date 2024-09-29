class DQueue {
    
    int size = 5;
    int[] CQ = new int[size];
    int front, rear;
    
    DQueue() {
        front = -1; // Initialize front
        rear = 0;  // Initialize rear
    }
    
    boolean isEmpty() {
        return (front == -1);
    }
    
    boolean isFull() {
        return ((front == 0 && rear == size-1) || front == rear +1);
    }
    
	void insertfront(int key){
		if(isfull()){
			System.out.println("Queue is full");
		}
		if(front == -1){
			front = 0;
			rear = 0;
		}
		else if(front  == 0){
			front = size -1;
		} else {
			front = size -1;
			
		}
	}

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1; // Return -1 if queue is empty
        } else {
            int x = CQ[front]; // Get the front element
            System.out.println(x + " deleted");
            if (front == rear) { // Queue becomes empty after this dequeue
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size; // Circular increment
            }
            return x;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Empty Queue!");
        } else {
            System.out.print("Queue elements: ");
            int i = front;
            while (true) {
                System.out.print(CQ[i] + " ");
                if (i == rear) break; // Stop when we reach rear
                i = (i + 1) % size;   // Circular increment
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CQueue q1 = new CQueue();
        
        q1.enqueue(11);
        q1.enqueue(12);
        q1.enqueue(13);
        q1.enqueue(14);
        q1.enqueue(15); // Changed from duplicate 11 to 15 for testing
        
        q1.display(); // Display current state of queue
        
        q1.dequeue();
        q1.dequeue();
        
        q1.display(); // Display after dequeuing
        
        q1.enqueue(22);
        q1.enqueue(32);
        
        q1.display(); // Display current state of queue
        
        q1.dequeue();
        
        q1.display(); // Final display after dequeue
    }
}