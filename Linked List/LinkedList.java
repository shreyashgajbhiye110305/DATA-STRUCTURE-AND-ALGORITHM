import java.util.Scanner;

class LinkedList{
	
	Node head;
	
	class Node{
		
		int data;
		Node next;
		
		Node(int data){
				this.data = data;
				this.next = null;
				return;
		}
	}
	
	void insertNode(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}
		Node current = head;
		while(current.next != null){
			current = current.next;				
		}
		current.next = newNode;
		return;
	}

	void printLinkedList(){
		Node current = head;
		while(current != null){
			System.out.print(current.data + " -> " );
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args){
		LinkedList link = new LinkedList();
		link.insertNode(1);
		link.insertNode(2);
		link.insertNode(3);
		link.insertNode(4);
		link.insertNode(5);
		link.printLinkedList();
	}			

}