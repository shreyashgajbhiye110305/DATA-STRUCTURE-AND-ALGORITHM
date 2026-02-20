import java.util.Scanner;
class Pattern10
{
	public static void Pattern10(int n)
	{
		for(int i = 0; i < 2*n-1; i++)
		{
			if(i < n)
			{	
				for(int j = 0; j <= i; j++)
				{
					System.out.print("*");
				}
			}
			else
			{
				for(int j = 0; j < n-(i%n)-1; j++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size");
	int size =  sc.nextInt();
	Pattern10(size);
}
}