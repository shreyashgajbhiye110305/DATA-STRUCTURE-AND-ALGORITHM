import java.util.Scanner;

class BubbleSort{
	
	public static int[] bubbleSort(int[] arr, int n){
		boolean swap = false;
		for(int i = 0; i < n-1; i++){
			for(int j = 0; j < n-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
			}
			if(swap == false)return arr;
		}
		return arr;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter element:");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		arr = bubbleSort(arr, size);
		System.out.println("Sorted array:");
		for(int num: arr){
			System.out.print(num + " ");
		}
	}


}