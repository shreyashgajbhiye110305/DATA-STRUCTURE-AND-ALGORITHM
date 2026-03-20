import java.util.Scanner;

class LengthOfLL{

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

        int countLengthLL(){
                int count = 0;
		if(head == null)return 0;
		Node current = head;
		while(current.next != null){
			count++;
			current = current.next;
		}
		return count+1;
        }

        public static void main(String[] args){
                LengthOfLL s = new LengthOfLL();
                s.printLL();
                s.createLL(12);
                s.createLL(5);
                s.createLL(7);
                s.printLL();
		System.out.println("Length of LL is: " + s.countLengthLL());
        }

}