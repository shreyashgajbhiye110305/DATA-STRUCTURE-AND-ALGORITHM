import java.util.Scanner;

class ReverseDLL{

        Node head;
        Node current;

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

        void insertNode(int data){
                Node newNode = new Node(data);
                if(head == null){
                        head = newNode;
                        return;
                }
                current = head;
                while(current.next != null){
                        current = current.next;
                }
                current.next = newNode;
                newNode.prev = current;
                return;
        }

        void printDLL(){
                current = head;
                while(current != null){
                        System.out.print(current.data + " <-> ");
                        current = current.next;
                }
                System.out.println("null");
                return;
        }

	void printRDLL(){
                current = head;
                while(current != null){
                        System.out.print(current.data + " <-> ");
                        current = current.prev;
                }
                System.out.println("null");
                return;
        }

	void reverseDLL(){
		current = head;
		while(current.next != null){
			current = current.next;
		}
		head = current;
	}

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                ReverseDLL LL = new ReverseDLL();
                System.out.println("Enter size of linked list: ");
                int size = sc.nextInt();
                System.out.println("Enter element: ");
                for(int i = 0; i < size; i++){
                        int data = sc.nextInt();
                        LL.insertNode(data);
                }
                LL.printDLL();
                LL.reverseDLL();
                LL.printRDLL();
        }


}