import java.util.Scanner;

class MaximumOne{

        public static int maximumOne(int[] arr, int n){
                int xor = 0;
		for(int num : arr){
			xor ^= num;
		}
		return xor;
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
                System.out.println("Element appears ones is: " + maximumOne(arr, size));
        }


}