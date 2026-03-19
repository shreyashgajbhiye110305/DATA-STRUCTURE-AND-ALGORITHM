import java.util.Scanner;

class InsertAtBeginning{
		
	Node head;
	
	class Node{
		int data;
		Node next;
	
		Node(int data){
			this.data = data;
			next = null;
		}
	}

	void insertAtBeginning(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	void printLL(){
		Node current = head;
		while(current != null){
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args){
		InsertAtBeginning s = new InsertAtBeginning();
		Scanner sc = new Scanner(System.in);
		s.insertAtBeginning(0);
		s.insertAtBeginning(1);
		s.insertAtBeginning(2);
		s.printLL();
		char c = ' ';
		while(c != 's'){
			System.out.println("Enter element: ");
			int data = sc.nextInt();
			s.insertAtBeginning(data);
			System.out.println("Press 's' to stop otherwise input any element: ");
			c = sc.next().charAt(0);
		}
		s.printLL();
	}

}