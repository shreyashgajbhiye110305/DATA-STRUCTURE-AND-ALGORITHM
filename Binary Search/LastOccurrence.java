import java.util.Scanner;

class LastOccurrence{

	public static int lastOccurrence(int[] arr, int n, int k){
		int low = 0, high = n - 1, mid = 0, ans=0;
		while(low <= high){
			mid = (low+high)/2;
			if(arr[mid] == k){
				ans = mid;
				low = mid + 1;
			}
			else if(arr[mid] < k)low = mid + 1;
			else high = mid - 1;
		}
		if(arr[ans] == k)return ans;
		else return -1;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter element: ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter search: ");
		int k  = sc.nextInt();
		System.out.println("Last occurrence: " + lastOccurrence(arr, size, k));
	}

}