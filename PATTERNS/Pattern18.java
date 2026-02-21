import java.util.Scanner;
class Pattern18{

public static void Pattern(int n){
	for(int i = 0; i <n ; i++){
		for(int j = 0; j <= i; j++){
			System.out.print((char)(n-(i-j)+64));
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