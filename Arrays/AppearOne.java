import java.util.Scanner;

class MaximumOne{

        public static int maximumOne(int[] arr, int n){
		int[] ele = new int[10];
                int max = 0, n1 = ele.length;
                for(int i = 0; i < n; i++){
			ele[arr[i] - 1]++;                        
                }
		for(int i = 0; i < n1; i++){
			if(ele[i] == 1)return i+1;
		}
		return -1;               	
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