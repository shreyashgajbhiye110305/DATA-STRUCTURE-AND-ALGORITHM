import java.util.Scanner;

class MinimumSorted{
	
	public static int minimumSorted(int[] arr, int n){
		int low = 0, high = n-1, mid = 0;
		while(low <= high){
			mid = (low+high)/2;
			if(arr[low] < arr[high])high = mid-1;
			else low++;
		}
		return arr[mid];
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter element: ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Minimum element is: " + minimumSorted(arr, size));
	}

}