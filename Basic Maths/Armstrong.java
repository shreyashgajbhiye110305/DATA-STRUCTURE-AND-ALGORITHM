import java.util.Scanner;

class Armstrong{
		
	public static boolean checkArmstrong(int n){
		int number = n, power = 0, sum = 0, d = 0;
		while(n > 0){
			d = n % 10;
			++power;
			n /= 10;
		}
		n = number;
		while(n > 0){
			sum += Math.pow(n%10, power);
			n /= 10;	
		}
		return sum == number ? true : false;
	}

	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		System.out.println(checkArmstrong(number));
	
	}



}