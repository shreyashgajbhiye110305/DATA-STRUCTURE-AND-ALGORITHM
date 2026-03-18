import java.util.Scanner;

class SingleSearch{
	
	public static int singleSearch(int[] arr, int n){
		int low = 0, high = n-1;
		while(low <= high){
			if(arr[low] == arr[low+1])low += 2;
			else return arr[low];
			if(arr[high] == arr[high-1])high -= 2;
			else return arr[high];
			if(low == high)return arr[low];
		}
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
		System.out.println("Single element is: " + singleSearch(arr, size));
	}

}