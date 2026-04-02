import java.util.Scanner;

class ArrayStack{
	
	int pointer = -1;
	int[] stack = new int[10];
	
	void push(int data){
		if(pointer >= stack.length){
			System.out.println("Stack overflow!");
			return;
		}
		pointer++;
		stack[pointer] = data;
		return;
	}

	int pop(){
		if(pointer <= -1){
			System.out.println("Stack is empty!");
			return -1;
		}
		return stack[pointer--];
	}

	boolean isEmpty(){
		if(pointer <= -1)return true;
		return false;
	}

	int top(){
		if(pointer <= -1){
			System.out.println("Stack is empty!");
			return -1;
		}
		return stack[pointer];
	}

	public static void main(String[] args){
		ArrayStack ss = new ArrayStack();
		System.out.println("Top is : " + ss.top());
		System.out.println("Stack is empty: " + ss.isEmpty());
		ss.push(5);
		ss.push(10);
		ss.push(15);
		ss.push(20);
		System.out.println("Top is : " + ss.top());
		System.out.println("POP element is : " + ss.pop());
		System.out.println("Stack is empty: " + ss.isEmpty());
		System.out.println("POP element is : " + ss.pop());
		System.out.println("Top is : " + ss.top());
		return;
	}

}