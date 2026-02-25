import java.util.Scanner;

class Factorial{

        public static int factorial(int n){
                if(n <= 1)return 1;
                return n * factorial(--n);
        }

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter N:");
                int n = sc.nextInt();
                System.out.println("The factorial is " + factorial(n));
        }




}