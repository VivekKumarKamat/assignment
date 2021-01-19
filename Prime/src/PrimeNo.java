import java.util.Scanner;

public class PrimeNo 
{

	public static void main(String[] args) 
	{
		Scanner sec=new Scanner(System.in);
		System.out.println("Enter the value");
		int no=sec.nextInt();
		int no1=7; 
		int temp=0;
		for(int i=2;i<=no1-1;i++)
		{
		 if(no1%i==00)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.print("it is prime number");
		}
			else
			{
				System.out.print("it is not prime number");
			
	}
		
	}
	
}

