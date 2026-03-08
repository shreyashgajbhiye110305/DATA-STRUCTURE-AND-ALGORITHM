import java.util.Scanner;

class LongestSubarray{

	public static int longestSubarray(int[] arr, int n, int key){
		int c = n + 1, b, sum, m;
		while(n > 0){
			b = c - n;
			for(int i = 0; i  < b; i++){
				sum = 0;
				m = i;
				for(int j = i; j < n+m; j++){
					if(sum > key)break;
					sum += arr[j];
				}
				if(sum == key)return n;
			}
			n--;
		}
		return 0;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		System.out.println("Enter element: ");
		int[] arr = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the key: ");
		int key = sc.nextInt();
		System.out.println("Length of longest subarray is: " + longestSubarray(arr, size, key));
	}

}