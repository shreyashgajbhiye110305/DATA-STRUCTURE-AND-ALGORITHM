import java.util.Scanner;

class OccurrenceSorted{
	
	public static int occurrenceSorted(int[] arr, int n, int k){
		if(n == 0)return -1;
		int low = 0, high = n-1, mid = 0, min = 0, max = 0;
		while(low <= high){
			mid = (low+high)/2;
			if(arr[mid] == k){
				min = mid;
				high = mid - 1;
			}
			else if(arr[mid] < k)low++;
			else high = mid -1;
		}
		low = 0; high = n-1;
		while(low <= high){
			mid = (low+high)/2;
			if(arr[mid] == k){
				max = mid;	
				low = mid + 1;
			}
			else if(arr[mid] > k)high--;
			else low = mid + 1;
		}
		if(arr[min] == k && arr[max] == k)return max-min+1;
		else if(arr[min] == k || arr[max] == k)return 1;
		return -1;
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
		System.out.println("Enter element: ");
		int k = sc.nextInt();
		System.out.println("Number of occurrence is: " + occurrenceSorted(arr, size, k));
	}
}