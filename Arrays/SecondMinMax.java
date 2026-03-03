import java.util.Scanner;

class MaxElement{

        public static void secondMinMax(int[] arr, int n){
                double max = Double.NEGATIVE_INFINITY;
		double min = Double.POSITIVE_INFINITY;
		double prev_min = 0;
		double prev_max = 0;
                for(int i = 0; i < n; i++){
                        if(arr[i] > max){prev_max = max; max = arr[i];};
			if(arr[i] < min){prev_min = min; min = arr[i];};
                }
		if(prev_max == prev_min){
			System.out.println("Their is no element.");
		}else{
			                System.out.println("Second max element: " + prev_max);
System.out.println("Second min element: "  + prev_min);
		}
                
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
		secondMinMax(arr, size);
		
        }

}