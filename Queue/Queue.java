class Queue{
	int size = 5;
	int Q[] = new int[size];
	int front, rear;
	
	Queue(){
		front = -1;
		rear = -1;
	}
	
	boolean isEmpty(){
		Return (front == -1);
	}
	
	boolean isFull(){
		return (rear == size -1);
	}
	
	void enqueue(int x){
		if(isFull()){
			System.out.println("Queue is Full!");
		}
		
		else {
			rear++;
			Q[rear] = x;
			System.out.println(x+"Inserted");
		}
	}
	
	int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return -1;
		} 
		else{
			int x = Q[rear];
			System.out.println(x+"Deleted");
		}
		if(front > rear){
			front = -1;
			rear = -1;
		}
		else{
			front++;
		}
		return x;
		
	}
	
	void display(){
		if(isEmpty()){
			System.out.println("Empty Queue!!!");
		}
		else{
			System.out.print("Queue elements:");
			
			for(int i =front; i<=rear; i++){
				System.out.print(Q[i]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		
	}
}