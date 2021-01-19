import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
		Scanner sec=new Scanner(System.in);
		System.out.println("Enter thae value");
		int no=sec.nextInt();
		int fact=1;
		
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+no+"is"+fact);
	}

}
