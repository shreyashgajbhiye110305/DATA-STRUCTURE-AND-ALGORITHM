import java.util.Scanner;

class GCD{
	
	public static int GCDFounder(int n1, int n2){
		while(n1 > 0 && n2 > 0){
			if(n1 > n2)n1 = n1 % n2;
			else n2 = n2 % n1;
		}
		
		return n1 == 0 ? n2 : n1;

	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  N1");
		int N1 = sc.nextInt();
		System.out.println("Enter N2");
		int N2  = sc.nextInt();
		System.out.println(GCDFounder(N1, N2));
	}

}