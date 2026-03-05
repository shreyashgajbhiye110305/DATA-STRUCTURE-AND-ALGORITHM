import java.util.Scanner;

class RotateLeft{

	public static void rotateLeft(int[] arr, int n){
		int temp = arr[0];
		for(int i = 0;  i < n; i++){
			arr[i] = arr[i+1];
		}
		arr[n] = temp;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter element: ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		rotateLeft(arr, size-1);
		for(int num: arr)System.out.print(num + " ");
	}

}