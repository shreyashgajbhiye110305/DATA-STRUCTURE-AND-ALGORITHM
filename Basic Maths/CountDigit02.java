import java.util.Scanner;
class CountDigit02{

public static int Digits(int n){
        int count = 0;
        count = (int)Math.log10(n) + 1;
        return count;
}

public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        System.out.println(Digits(number));

}




}