import java.util.Scanner;

class MaxElement{

        public static double maxElement(int[] arr, int n){
                double max = Double.NEGATIVE_INFINITY;
                for(int i = 0; i < n; i++){
                        if(arr[i] > max)max = arr[i];
                }
                return max;
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
                System.out.print("Max element: " + maxElement(arr, size));
        }

}