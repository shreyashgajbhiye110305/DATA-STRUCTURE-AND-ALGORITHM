import java.util.Scanner;

class MaximumOne{

	public static int maximumOne(int[] arr, int n){
		int count = 0, max = 0;
		for(int i = 0; i < n; i++){
			if(arr[i] == 1)count++;
			else{
				if(max < count)max = count;
				count = 0;
			}
		}
		return max < count ? count : max;
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
		System.out.println("Maximum consicutive ones are: " + maximumOne(arr, size));
	}


}