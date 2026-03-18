import java.util.Scanner;

class SingleSearch{

        public static int peakElement(int[] arr, int n){
                int low = 0, high = n-1, mid = 0;
                while(low < high){
                        mid = (low+high)/2;
			if(arr[mid] > arr[mid+1])high = mid;
			else low = mid + 1;		
                }
                return arr[mid+1];
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
                System.out.println("Peak element is: " + peakElement(arr, size));
        }

}