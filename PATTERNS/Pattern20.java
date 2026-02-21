import java.util.Scanner;
class Pattern20{

public static void Pattern(int n){
	for(int i = 0; i < 2*n; i++){
		if(i<n){
			for(int j = 0; j <= i; j++){
				System.out.print("*");
}
			for(int k = 0; k < 2*(n-i-1); k++){
			System.out.print(" ");
}
			for(int s = 0; s <= i ; s++){
			System.out.print("*");
}

}else{
			for(int j = 0; j < 2*n-i-1; j++){
				System.out.print("*");
}
			for(int k = 0; k < 2*(i%n) + 2; k++){
			System.out.print(" ");
}
			for(int s = 0; s < 2*n-i-1; s++){
			System.out.print("*");
}
	
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