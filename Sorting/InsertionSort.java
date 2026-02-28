import java.util.Scanner;

class InsertionSort{

        public static int[] insertionSort(int[] arr, int n){
		for(int i = 1; i < n; i++){
			for(int j = 0; j < i; j++){
				if(arr[j] > arr[i]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
				                
                return arr;
        }

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size:");
                int size = sc.nextInt();
                int[] arr = new int[size];
                System.out.println("Enter element:");
                for(int i = 0; i < size; i++){
                        arr[i] = sc.nextInt();
                }
                arr = insertionSort(arr, size);
                System.out.println("Sorted array:");
                for(int num: arr){
                        System.out.print(num + " ");
                }
        }


}