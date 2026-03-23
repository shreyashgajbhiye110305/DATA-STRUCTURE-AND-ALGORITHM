import java.util.Scanner;

class InsertEndDLL{
	
	Node head;
	Node currentNode;

	class Node{
		int data;
		Node next;
		Node prev;

		Node(int data){
			this.data = data;
			next = null;
			prev = null;
		}
	}

	void insertAtEnd(int data){
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
		currentNode = head;
		if(head == null){
			System.out.println("Empty list: ");
			return;
		}
		while(currentNode != null){
			System.out.print(currentNode.data + " <-> ");
			currentNode = currentNode.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args){
		InsertEndDLL s = new InsertEndDLL();
		Scanner sc = new Scanner(System.in);
		s.printDLL();
		System.out.println("How many element to insert: ");
		int num = sc.nextInt();
		System.out.println("Insert Element: ");
		for(int i = 0; i < num; i++){
			s.insertAtEnd(sc.nextInt());
		}
		s.printDLL();
	}

}