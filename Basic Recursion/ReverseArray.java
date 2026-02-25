import java.util.Scanner;

class ReverseArray{
	
        public static void reverse(int[] arr, int n, int i){
		if((i==(n-i)) || (n < i))return;
		int temp = arr[i];
		arr[i] = arr[n-i];
		arr[n-i] = temp;
		printArray(arr, n);
		System.out.println();
		reverse(arr, n, ++i);
        }

	public static void printArray(int[] arr, int n){
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
	}

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array:");
                int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array element:");
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
                reverse(arr, n-1, 0);
		printArray(arr, n);
        }
}