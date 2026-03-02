import java.util.Scanner;

class RecursiveInsertion{

	public static void recursiveInsertion(int[] arr, int n, int header){
		if(header > n)return;
		int i = header - 1, j = header;
		while(i >= 0){
			if(arr[i] > arr[j]){
				int swap = arr[i];
				arr[i] = arr[j];
				arr[j] = swap;
			}
			i--;
			j--;
		}
		recursiveInsertion(arr, n, ++header);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter element:");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		recursiveInsertion(arr, size-1, 1);
		for(int num: arr)System.out.print(num + " ");
	}

}