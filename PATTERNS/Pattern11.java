import java.util.Scanner;

class Pattern11{

public static void Pattern(int size){
	for(int i = 0; i < size; i++){
	for(int j = 0; j <=  i;j++){
		if((i+j) % 2 == 0){
			System.out.print("1");	
	}
	else{
		System.out.print("0");
}
}
	System.out.println();	
}
}

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size");
	int size = sc.nextInt();
	Pattern(size);
}


}