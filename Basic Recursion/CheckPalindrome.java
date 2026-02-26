import java.util.Scanner;

class CheckPalindrome{

	public static String checkPalindrome(String s, int n, int i){
		if(n <=  i)return "Palindrome!";
		if(s.charAt(i) != s.charAt(n-i))return "Not Palindrome!";
		return checkPalindrome(s, n, ++i);
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String palindrome = sc.nextLine();
		System.out.println("Given string is " + checkPalindrome(palindrome.toLowerCase(), palindrome.length() - 1, 0));
	}

}