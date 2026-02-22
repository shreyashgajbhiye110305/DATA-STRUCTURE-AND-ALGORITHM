import java.util.Scanner;

class ReverseInteger{

public static int Reverse(int n){
   int reverse = 0, digit = 0;
  while(n > 0){
	reverse = reverse *10 + (n%10);
	n /= 10;
}
	return reverse;
}

public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        System.out.println(Reverse(number));

}
}