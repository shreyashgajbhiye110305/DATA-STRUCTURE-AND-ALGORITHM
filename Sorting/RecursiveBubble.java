import java.util.Scanner;

class BubbleSort{

        public static void bubbleSort(int[] arr, int left, int right, int n){
                if(right > (n-1) ){
			if(n	>= 1){
				--n;
				left = 0;
				right = 1;
			}else return;
		}
		if(arr[left] > arr[right]){
			int temp = arr[left];	
			arr[left] = arr[right];
			arr[right] = temp;
		}
		bubbleSort(arr, ++left, ++right, n);
		
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
                bubbleSort(arr,0,  1, size);
                System.out.println("Sorted array:");
                for(int num: arr){
                        System.out.print(num + " ");
                }
        }


}