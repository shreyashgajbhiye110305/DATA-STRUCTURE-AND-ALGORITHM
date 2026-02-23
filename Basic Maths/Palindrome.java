import java.util.Scanner;

class Palindrome{

public static String checkPalindrome(int num){

	int reverse = 0, digit = 0, original = num;
	while(num > 0){
		digit = num % 10;
		reverse = reverse * 10 + digit;
		num = num / 10;

	}
	return (original == reverse) ? "Palindrome Number" : "Not Palindrome"; 

}
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number:");
	int number = sc.nextInt();
	System.out.println(checkPalindrome(number));

}

}