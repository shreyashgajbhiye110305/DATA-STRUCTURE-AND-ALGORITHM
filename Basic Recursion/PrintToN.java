import java.util.Scanner;

class PrintToN{

        public static void name(int n, int i){
                if(i > n)return;
                System.out.print(i + " ");
                name(n, ++i);
        }

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter N:");
                int n = sc.nextInt();
                name(n, 1);
        }




}