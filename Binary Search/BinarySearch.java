import java.util.Scanner;

class BinarySearch{

	public static int binarySearch(int[] arr, int size, int k){
		int mid = 0, high = size, low = 0;
		while(low <= high){
			mid = (high+low) / 2;
			if(arr[mid] == k)return mid+1;
			if(arr[mid] > k){
				high = mid - 1;
			}else{
				low = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		System.out.println("Enter element: ");
		int[] arr = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to search: ");
		int k = sc.nextInt();
		System.out.println("The position of element is: " + binarySearch(arr, size, k));
	}


}