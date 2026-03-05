import java.util.Scanner;

class RotateLeft{

        public static void zeroToLeft(int[] arr, int n){
               for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(arr[j] == 0){
					arr[j] = arr[j+1];
					arr[j+1] = 0;
				}
			}
		}
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
                zeroToLeft(arr, size-1);
                for(int num: arr)System.out.print(num + " ");
        }

}