import java.util.Scanner;

class CheckPrime2{

        public static String checkPrime(int n){
                for(int i = 2; i*i <= n; i++){
                        if(n%i == 0){
                                return "Not Prime";
                        }
                }

                return "Prime number";
        }

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter number:");
                int number = sc.nextInt();
                System.out.println(checkPrime(number));

        }



}