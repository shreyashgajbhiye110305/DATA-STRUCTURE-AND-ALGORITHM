import java.util.Scanner;

class DoublyLL{

	Node head;
	Node currentNode;
	
	class Node{
		int data;
		Node prev;
		Node next;

		Node(int data){
			this.data = data;
			prev = null;
			next = null;
		}
	}

	void insertDLL(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}
		currentNode = head;
		while(currentNode.next != null){
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
		newNode.prev = currentNode;
	}

	void printDLL(){
		if(head == null){
			System.out.println("Empty list: ");
			return;
		}
		currentNode = head;
		while(currentNode != null){
			System.out.print(currentNode.data + " <--> ");
			currentNode = currentNode.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args){
		DoublyLL s = new DoublyLL();
		Scanner sc = new Scanner(System.in);
		char end = ' ';
		s.printDLL();
		while(end != 'q'){
			System.out.println("Enter element: ");
			int data = sc.nextInt();
			s.insertDLL(data);
			System.out.println("Enter 'q' to quit or anything to insert: ");
			end = sc.next().charAt(0);
		}
		s.printDLL();
	}
}