class SimpleQueue{
	int size = 5;
	int Q[] = new int[size];
	int front, rear;
	
	SimpleQueue(){
		front = -1;
		rear = -1;
	}
	
	boolean isEmpty(){
		return (front == -1);
	}

	boolean isFull(){
		return (rear == size-1);
	}
	
	//insertion
	void enqueue(int x){
		if(isFull()){
			System.out.println("Queue is full!");
		} 
		else {
			if(front == -1){
				front = 0;//set front to zero if queue is empty
			}
			rear++;
			Q[rear] = x;
			System.out.println(x+" Inserted");
		}
	}
	
	int dequeue(){
		//Already empty queue
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return -1;
		} else {
			int x = Q[front];
			System.out.println(x+" Deleted");
			if(front > rear){ // if front is greter means all the elements are deleted
				front = -1; 
				rear = -1;
			} else {
				front++;
			}
		}
		return 1;
		
	}
	void display(){
			if(isEmpty()){
				System.out.println("Empty Queue !");
			}
			else {
				System.out.print("Queue elements ");
				
				for(int i = front;i<= rear; i++){
					System.out.print(Q[i]+" ");
				}
				System.out.println();
			}
		}
	
	public static void main(String[] args){
		SimpleQueue q1 =  new SimpleQueue();
		q1.enqueue(11);
		q1.enqueue(13);
		q1.enqueue(14);
		q1.enqueue(15);
		
		q1.display();
		
		q1.dequeue();
		q1.display();
		
		q1.dequeue();
		q1.display();
		
		q1.dequeue();
		q1.display();
		
		q1.dequeue();
		q1.display();
		
		q1.dequeue();
		q1.display();
		
		q1.dequeue();
		q1.display();
		
		q1.enqueue(10);
		
		
	}
	
}