import java.util.Scanner;

class SortOrNot{

        public static boolean sortOrNot(int[] arr, int n){
		if(n < 1)return true;
		for(int i = 0; i < n; i++){
			if(arr[i] > arr[i+1])return false;
		}  
		return true;              
        }

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter array size:");
                int size = sc.nextInt();
                int[] arr = new int[size];
                System.out.println("Enter array element:");
                for(int i = 0; i < size; i++){
                        arr[i] = sc.nextInt();
                }
                System.out.println("The array is sorted : " + sortOrNot(arr, size-1));
        }

}