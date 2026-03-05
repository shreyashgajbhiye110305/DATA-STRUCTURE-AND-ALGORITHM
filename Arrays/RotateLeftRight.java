import java.util.Scanner;

class RotateLeftRight{

        public static void rotateLeft(int[] arr, int n, int k){
                while(k > 0){
			int temp = arr[0];
			for(int i = 1; i < n; i++){
				arr[i-1] = arr[i];
			}
			arr[n-1] = temp;
			--k;
		}
        }

	public static void rotateRight(int[] arr, int n, int k){
		while(k > 0){
			int temp = arr[n-1];
			for(int i = n-1; i > 0; i--){
				arr[i] = arr[i-1];
			}
			arr[0] = temp;
			--k;
		}
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
		sc.nextLine();
		System.out.println("Rotate direction left or right: \n");
		String s = sc.nextLine();
		System.out.println("How many position:");
		int k = sc.nextInt();
		s = s.toLowerCase();
                if(s.equals("right"))rotateRight(arr, size, k);
		else if(s.equals("left"))rotateLeft(arr, size, k);
		else {System.out.println("Invalid entry!");}
                for(int num: arr)System.out.print(num + " ");
        }

}