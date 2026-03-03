import java.util.Scanner;

class QuickSort{
	
	public static void quickSort(int[] arr, int low, int high){
		if(low < high){
			int correct_element = sort(arr, low, high);	
			quickSort(arr, low, correct_element - 1);
			quickSort(arr, correct_element+1, high);
		}
	}
	
	public static int sort(int[] arr, int low, int high){
		int pivot = arr[low];
		int i = low, j = high;
		while(i < j){
			while(arr[i] <= pivot && i <= high - 1)i++;
			while(arr[j] > pivot && j >= low + 1)j--;
			if(i < j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
			int temp = arr[j];
				arr[j] = arr[low];
				arr[low] = temp;
		return j;
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
		quickSort(arr, 0, size-1);
		for(int num : arr)System.out.print(num + " ");
	}

}