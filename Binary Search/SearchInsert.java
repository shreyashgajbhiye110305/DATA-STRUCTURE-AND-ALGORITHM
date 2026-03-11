import java.util.Scanner;

class SearchInsert{

        public static int searchInsert(int[] arr, int size, int k){
                int low = 0, high = size-1, mid = 0;
                while(low <= high){
                        mid = (low+high)/2;
                        if(arr[mid] == k)return mid;
                        else if(arr[mid] <= k)low = mid + 1;
                        else high = mid - 1;
                }
                if(target > nums[mid])return mid + 1;
        	return mid == 0 ? 0 : mid ;
        }

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size: ");
                int size = sc.nextInt();
                int[] arr = new int[size];
                System.out.println("Enter elements: ");
                for(int i = 0; i < size; i++){
                        arr[i] = sc.nextInt();
                }
                System.out.println("Search element:");
                int k = sc.nextInt();
                System.out.println("Search index is: " + searchInsert(arr, size, k));

        }

}