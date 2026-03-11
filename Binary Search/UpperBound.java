import java.util.Scanner;

class UpperBound{
	
	public static int upperBound(int[] arr, int size, int k){
		int low = 0, high = size-1, mid = 0;
		while(low <= high){
			mid = (low+high)/2;
			if(arr[mid] > k)return mid;
			else if(arr[mid] <= k)low = mid + 1;
			else high = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements: ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Upper Bound element:");
		int k = sc.nextInt();
		System.out.println("Upper bound index is: " + upperBound(arr, size, k));
		
	}

}