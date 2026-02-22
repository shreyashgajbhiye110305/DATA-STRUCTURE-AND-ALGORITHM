import java.util.Scanner;
class CountDigit{

public static int Digits(int n){
	int count = 0;
	if(n < 0){
		n = -n;
	}
	while(n > 0){
		n = n / 10;
		count++;
	}
	return count;
}

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int number = sc.nextInt();
	System.out.println(Digits(number));

}




}