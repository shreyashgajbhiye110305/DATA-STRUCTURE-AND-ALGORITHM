import java.util.Scanner;

class SumofNatural{

        public static int sum(int n){
                if(n <= 1)return 1;
                return n + sum(--n);
        }

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter N:");
                int n = sc.nextInt();
                System.out.println("The sum is " + sum(n));
        }




}