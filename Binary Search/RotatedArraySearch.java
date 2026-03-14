import java.util.Scanner;

class RotatedArraySearch{
	
	public static int findElement(int[] arr, int n, int k){
		if(n == 0)return -1;
        int low = 0, high = n-1, mid = 0;
        while(low <= high){
            mid = (low+high)/2;
            if(arr[mid] ==k)return mid;
            if(arr[low] <= arr[mid]){
                if(arr[low] <= k && k < arr[mid]){
                    high = mid -1 ;
                }else {
                    low = mid + 1;
                }
            }else {
                if(arr[mid] < k && k <= arr[high]){
                    low = mid+1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter element: ");
		for(int i  = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Search element: ");
		int k = sc.nextInt();
		System.out.println("The index is: "+ findElement(arr, size, k));
	}

}