import java.util.Scanner;

public class FunctionalSum {

	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		c=addition(a,b);
		System.out.println(" Addition of two numbers is : "+c);
		sc.close();
		}
		static int addition(int x,int y)
		{
			return x+y;
	}

}
