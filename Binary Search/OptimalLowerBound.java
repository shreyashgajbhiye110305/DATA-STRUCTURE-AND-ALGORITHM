import java.util.Scanner;

class LowerBound{

        public static int lowerBound(int[] arr, int size, int k){
		int high = size - 1, low = 0, mid = 0;
                while(low <= high){
			mid = (low+high)/2;
			if(arr[mid] >= k)return mid;
			else if(arr[mid] < k)low = mid + 1;
			else high = mid - 1;
		}
		return size;
        }

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size: ");
                int size = sc.nextInt();
                System.out.println("Enter element: ");
                int[] arr = new int[size];
                for(int i = 0; i < size; i++){
                        arr[i] = sc.nextInt();
                }
                System.out.println("Enter element to search: ");
                int k = sc.nextInt();
                System.out.println("The position of element is: " + lowerBound(arr, size, k));
        }


}