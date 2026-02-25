import java.util.Scanner;

class PrintToOne{

        public static void name(int n){
                if(n <= 0)return;
                System.out.print(n + " ");
                name(--n);
        }

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter N:");
                int n = sc.nextInt();
                name(n);
        }




}