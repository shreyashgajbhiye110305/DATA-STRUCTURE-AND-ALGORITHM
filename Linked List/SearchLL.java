import java.util.Scanner;

class SearchLL{
	
	Node head;
	Node currentNode;

	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}

	void insertNode(int data){
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
	}

	void printLL(){
		currentNode = head;
		while(currentNode != null){
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.next;
		}
		System.out.println("null");
	}

	boolean searchElement(int ele){
		currentNode = head;
		while(currentNode.data != ele){
			currentNode = currentNode.next;
			if(currentNode == null)return false;
		}
		if(currentNode.data == ele)return true;
		else return false;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		SearchLL s = new SearchLL();
		s.insertNode(0);
		s.insertNode(1);
		s.insertNode(2);
		s.printLL();
		System.out.println("Enter element to search: ");
		int search = sc.nextInt();
		System.out.println("Element " +  search + " present is: " + s.searchElement(search));
	}

}