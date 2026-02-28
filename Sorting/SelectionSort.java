import java.util.Scanner;

class SelectionSort{

	public static int[] selectionSort(int[] arr, int n){
		boolean swap = false;
		for(int i = 0; i < n-1; i++){
			for(int j = i+1; j < n; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					swap = true;
				}
			
			}
			if(swap == false)return arr;

		}
		return arr;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array element:");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		arr = selectionSort(arr, size);
		for(int i = 0; i < size; i++){
			System.out.print(arr[i] + " ");
		}

	}

}