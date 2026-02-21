import java.util.Scanner;
class Pattern17{

public static void Pattern(int n){
	for(int i = 0; i < n; i++){
		for(int k = 0; k < n-i-1; k++){
			System.out.print(" ");
}
	for(int j = 0; j <= i; j++){
		System.out.print((char)(j+65));
	}

	for(int s = 0; s <= i-1; s++){
		System.out.print((char)(i-s+64));
}
	System.out.println();
}

}

	
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size");
	int size = sc.nextInt();
	Pattern(size);

}


}