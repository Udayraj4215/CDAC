class CircularQueue(){
	int size = 5;
	int cq[] = new int[];
	int front, rear;
	
	CircularQueue(){
		front = -1;
		rear = -1;
	}
	
	boolean isEmpty(){
		if(front == -1)
	}

	boolean isFull(){
		return ((rear + 1)% size == front);
	}
	
	void enqueue(int x){
		is(isFull()){
			System.out.println("Queue is full");
		}
		else{
			if(front = -1){
				front = 0;
			}
			rear = (rear + 1)% size;
			CQ[rear] = x;
			System.out.println(X +"Inserted");
		}
	}
	
	

}