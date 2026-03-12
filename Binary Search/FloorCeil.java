import java.util.Scanner;

class FloorCeil{

	public static void floorCeil(int[] arr, int n, int k){
		int low = 0, high = n - 1, mid = 0;
		while(low <= high){
			mid = (low+high)/2;
			if(arr[mid] == k){
				System.out.println("Floor: " + k + " Ceil: " + k);
				return;
			}else if(arr[mid] < k)low = mid + 1;
			else high = mid - 1;
		}
		System.out.println("Floor: " + arr[mid-1] + " Ceil: " + arr[mid]);
		return;
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
		floorCeil(arr, size, k);
	}

}