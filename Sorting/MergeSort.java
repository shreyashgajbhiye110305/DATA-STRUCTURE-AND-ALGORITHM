import java.util.Scanner;
import java.util.ArrayList;

class MergeSort{
	
	public static void mergeSort(int[] arr, int low, int high){
		if(low >= high)return;
		int mid = (low + high)/2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid+1, high);
		merge(arr, low, high, mid);
	}

	public static void merge(int[] arr, int low, int high, int mid){
		ArrayList<Integer> temp = new ArrayList<>();
		int left = low;
		int right = mid+1;
		while(left <= mid && right <= high){
			if(arr[left] >= arr[right]){
				temp.add(arr[right]);
				right++;
			}else{
				temp.add(arr[left]);
				left++;
			}	
		}
		while(left <= mid){
			temp.add(arr[left]);
			left++;
		}
		while(right <= high){
			temp.add(arr[right]);
			right++;
		}

		for(int j = low; j <= high; j++){
			arr[j] = temp.get(j - low);
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter element:");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		mergeSort(arr, 0, size-1);
		System.out.println("Sorted array:");
		for(int num : arr)System.out.print(num + " ");
	}



}