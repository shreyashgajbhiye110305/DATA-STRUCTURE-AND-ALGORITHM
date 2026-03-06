import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class UnionArray{

	public static void unionArray(int[] arr1, int[] arr2, int n1, int n2){
		List<Integer> union = new ArrayList<>();
		int i = 0,  j= 0;
		while(i < n1 && j < n2){
			if(arr1[i] <= arr2[j] ){
				if(union.contains(arr1[i]) == false || union.isEmpty() == true){
				union.add(arr1[i]);
				}
			i++;
			}else{
				if(union.contains(arr2[j]) == false || union.isEmpty() == true){
				union.add(arr2[j]);
			
				}
				j++;
			}
		}
		while(i < n1){
			if(union.contains(arr1[i]) == false || union.isEmpty() == true)				{
				union.add(arr1[i]);
			}
			i++;
		}
		while(j < n2){
			if(union.contains(arr2[j]) == false || union.isEmpty() == true)				{
				union.add(arr2[j]);
			}
			j++;
		}
		System.out.println(union);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size1: ");
		int size1 = sc.nextInt();
		System.out.println("Enter size2: ");
		int size2 = sc.nextInt();
		System.out.println("Enter sorted array1: ");
		int[] arr1 = new int[size1];
		for(int i = 0; i < size1; i++){
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter sorted array2: ");
		int[] arr2 = new int[size2];
		for(int i = 0; i < size2; i++){
			arr2[i] = sc.nextInt();
		}
		
		unionArray(arr1, arr2, size1, size2);
	}

}