import java.util.Scanner;
class Pattern12{

public static void Pattern(int size){
        for(int i = 0; i < size; i++){
		for(int j = 0; j <= i; j++){
		System.out.print(j+1);
		}
		for(int k = 0; k < (size - i - 1)*2; k++){
			System.out.print(" ");
		}
		for(int s = i; s >= 0; s--){
			System.out.print(s+1);
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