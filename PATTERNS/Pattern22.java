import java.util.Scanner;
class Pattern22{

public static void Pattern(int n){
	for(int i = 0; i < 2*n-1; i++){
		for(int j = 0; j < 2*n-1; j++){
			int left = j;
			int top = i;
			int right = (2*n-2)-j;
			int bottom = (2*n-2)-i;
			System.out.print(n- Math.min(Math.min(left, right), Math.min(top, bottom)));
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