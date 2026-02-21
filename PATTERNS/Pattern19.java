import java.util.Scanner;
class Pattern19{

public static void Pattern(int n){
	for(int i = 0; i < 2*n; i++){

	for(int j = 0; j < n-i; j++){
		System.out.print("*");
}
	if(i < n){
		for(int k = 0; k < 2*i; k++){
		System.out.print(" ");
}
for(int p = 0; p <n- (i%n); p++){
		System.out.print("*");

}

}
	
	if(i >= n){

	for(int p = 0; p <= (i%n); p++){
		System.out.print("*");


}
	for(int h = 0; h < (2*(n-(i%n+1))); h++){
		System.out.print(" ");
}

	for(int g = 0; g <= (i%n); g++){
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