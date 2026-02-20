import java.util.Scanner;
class Solution {
    public static void pattern9(int n) {
        for(int i = 0; i < 2*n; i++)
        {
            if(i < n)
            {
                for(int k = 0; k < (n-i-1); k++)
                {
                    System.out.print(" ");
                }

                for(int j = 0; j < (2*i+1); j++)
                {
                    System.out.print("*");
                }

            }
            else
            {
                for(int k = 0; k < i%n; k++)
                {
                    System.out.print(" ");
                }
                for(int j = 0; j < 2*(n-(i%n))-1; j++)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

public static void main(String[] args)
{	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size: ");
	int size = sc.nextInt();
	if(size > 0) {pattern9(size);} else {System.out.println("Invalid size");}
	
}
}