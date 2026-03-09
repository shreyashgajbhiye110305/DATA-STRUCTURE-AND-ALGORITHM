import java.util.Scanner;

class SumZero{
	
	public static boolean twoSum(int[] arr, int n, int k){
		for(int i = 0; i < n; i++){
			for(int j = i; j < n; j++){
				if(arr[i] + arr[j] == k)return true;
			}
		}
		return false;
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
		System.out.println("Enter the k: ");
		int k = sc.nextInt();
		boolean ans = twoSum(arr, size, k);
		if(ans == false)System.out.println("No");
		else System.out.println("Yes");
	}

}