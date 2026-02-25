import java.util.Scanner;

class printName{
	
	public static void name(int n){
		if(n <= 0)return;
		System.out.print("Shreyash ");
		name(--n);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N:");
		int n = sc.nextInt();
		name(n);
	}




}