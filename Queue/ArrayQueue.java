import java.util.Scanner;

class ArrayQueue{

	int[] Queue = new int[20];
	int front = -1, rear = -1;

	void push(int data){
		if(rear >= Queue.length){
			System.out.println("Queue is Full!");
			return;
		}
		if(rear == -1 && front == -1){
			front++;
			rear++;
			Queue[rear] = data;
			return;
		}
		rear++;
		Queue[rear] = data;
		return;
	}

	int pop(){
		if(front == -1 && rear == -1){
			System.out.println("Empty Queue!");
			return -1;
		}
		if(front >= rear){
			front = -1;
			rear = -1;
			return -1;
		}
		return Queue[front++];
	}

	int peek(){
		if(front == -1 && rear == -1){
			System.out.println("Queue is Empty!");
			return -1;
		}
		return Queue[front];	
	}

	boolean isEmpty(){
		if(front == -1 && rear == -1){
			return true;
		}
		return false;
	}

	public static void main(String[] args){
		ArrayQueue q = new ArrayQueue();
		q.peek();
		System.out.println("Is empty: " + q.isEmpty());
		q.push(5);
		System.out.println("Peek element: " + q.peek());
		q.push(10);
		q.push(15);
		q.push(20);
		System.out.println("Peek element: " + q.peek());
		System.out.println("Is empty: " + q.isEmpty());
		System.out.println("POP element: " + q.pop());
		System.out.println("Peek element: " + q.peek());
		System.out.println("POP element: " + q.pop());
		System.out.println("Peek element: " + q.peek());

	}
}