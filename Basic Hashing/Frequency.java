import java.util.Scanner;
import java.util.HashMap;

class Frequency{
	
	public static void countFrequency(Integer[] arr, int n){
		HashMap<Integer, Integer> freq = new HashMap<>();
		for(int i = 0; i < n; i++){
			freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
		}

		System.out.println(freq);
	}	


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array siez:");
		int size = sc.nextInt();
		Integer[] arr = new Integer[size];
		System.out.println("Enter array elements:");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		countFrequency(arr, size);
	}


}