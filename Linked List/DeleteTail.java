import java.util.Scanner;

class LL{

	Node head;
	
	class Node{
		int data;
		Node next;

		Node(int data){
			this.data = data;
			next = null;
		}
	}

	void createLL(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}
		Node current = head;
		while(current.next != null)current = current.next;
		current.next = newNode;
	}
	
	void printLL(){
		Node current = head;
		if(current == null){
			System.out.println("Empty list!");
			return;
		}
		while(current != null){
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}	

	void deleteTail(){
		Node current = head;
		Node previous = current;
		if(current == null){
			System.out.println("Empty list!");
			return;
		}

		while(current.next != null){
			previous = current;
			current = current.next;
		}
		previous.next = null;
	}

	public static void main(String[] args){
		LL s = new LL();
		s.printLL();
		s.createLL(12);
		s.createLL(5);
		s.createLL(8);
		s.createLL(7);
		s.printLL();
		s.deleteTail();
		s.printLL();
	}

}