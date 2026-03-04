import java.util.Scanner;

class RemoveDuplicate{

	public static void removeDuplicate(int[] arr, int n){
		int filled = 0, start = n-2;
		for(int i = start; i > -1; i--){
			if(arr[i] == arr[i+1]){
				arr[i+1] = 0;
			}
		}
		for(int num: arr)System.out.print(num + " ");
		System.out.println();
		for(int i = 0; i < n; i++){
			if(arr[i] == 0 && arr[filled] != 0){
				filled = i;
			}else if(filled > 0  && arr[i] > 0){
				arr[filled] = arr[i];
				arr[i] = 0;
				filled++;
			}
		}
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
		for(int num: arr)System.out.print(num + " ");
	}


}