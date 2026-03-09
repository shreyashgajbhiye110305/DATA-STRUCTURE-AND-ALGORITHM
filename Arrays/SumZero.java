import java.util.Scanner;

class SumZero{
	
	public static int sumZero(int[] arr, int n){
		int len = n, sum = 0;
		while(len > 0){
			int k = n - len + 1;
			for(int i = 0; i < k; i++){
				sum = 0;
				for(int j = i; j < len; j++){
					sum += arr[j];
					if(sum == 0)return len;
				}
			}
			len--;
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
		System.out.println("The size is " + sumZero(arr, size));
	}

}