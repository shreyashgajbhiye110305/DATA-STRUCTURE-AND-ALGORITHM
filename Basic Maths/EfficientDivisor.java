import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class EfficientDivisor{

        public static void findDivisors(int n){
		int size = 0;
		ArrayList<Integer> divisors = new ArrayList<>();
                for(int i = 1; i *i <= n; i++){
			if(n%i == 0){
				divisors.add(i);
				if((n/i) != i){
					divisors.add(n/i);
				}	
			}
		}
		Collections.sort(divisors);
		System.out.print("[");
		size = divisors.size();
		for(int j = 0; j < size ; j++){
			System.out.print(divisors.get(j) + " ");
		}
		System.out.print("]");
		
        }

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter number:");
                int number = sc.nextInt();
                findDivisors(number);
        }


}