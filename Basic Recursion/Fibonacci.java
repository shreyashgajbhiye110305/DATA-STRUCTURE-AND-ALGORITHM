import java.util.Scanner;

class Fibonacci{

        public static void fibonacci(int n1, int n2, int n){
                if(n == 1)return;
		int n3 = n1 + n2;
		System.out.print(n3 + " ");
		fibonacci(n1 = n2, n2 = n3, --n);
        }

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter N:");
                int n = sc.nextInt();
		System.out.print("0 1 ");
                fibonacci(0, 1, n);
        }




}