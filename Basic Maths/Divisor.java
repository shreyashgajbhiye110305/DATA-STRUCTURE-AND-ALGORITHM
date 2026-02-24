import java.util.Scanner;

class Divisor{

	public static void findDivisors(int n){
		System.out.print("[1 ");
		for(int i = 2; i < n; i++){
			if(n % i == 0){
				System.out.print(i + " ");
			}
		}
		System.out.print(n + "]");
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		findDivisors(number);
	}


}