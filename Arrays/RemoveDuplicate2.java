import java.util.Scanner;

class RemoveDuplicate22{

	public static void removeDuplicate(int[] arr, int n){
		if(n <= 2)return ;
		int filled = 0;
		for(int i = 1; i < n; i++){
			if(arr[filled] != arr[i]){
				filled++;
				arr[filled] = arr[i];
			}
		}
		for(int num: arr)System.out.print(num + " ");
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements:");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		removeDuplicate(arr, size);
	}


}