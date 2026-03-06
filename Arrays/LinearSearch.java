import java.util.Scanner;

class LinearSearch{
	
	public static int linearSearch(int[] arr, int k, int n){
		for(int i = 0; i < n; i++){
			if(arr[i] == k)return (i+1);
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
		System.out.println("Enter key to search: ");
		int k = sc.nextInt();
		System.out.println("Element " + k + " is at position of " + linearSearch(arr, k, size));
	}

}