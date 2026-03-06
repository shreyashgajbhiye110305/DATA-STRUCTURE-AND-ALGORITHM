import java.util.Scanner;

class MissingNumber{

        public static int missingNumber(int[] arr, int n){
		boolean find = false;
                for(int i = 1;  i <= n; i++){
			find = false;
                      for(int j = 0; j < n; j++){
				if(arr[j] == i)find = true;
			}
			if(find == false)return i;
                }
		return -1;
        }

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size: ");
                int size = sc.nextInt();
                int[] arr = new int[size];
                System.out.println("Enter element: ");
                for(int i = 0; i < size; i++){
                        arr[i] = sc.nextInt();
                }
                System.out.println("Missing number is " + missingNumber(arr, size));
                
        }

}