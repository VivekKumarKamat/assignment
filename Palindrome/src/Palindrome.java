import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		Scanner sec=new Scanner(System.in);
		System.out.println("Enter The Value");
		int no=sec.nextInt();
		int temp=no;
		int rev=0,rem;
		while(temp !=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println(no+" is Palindrome ");
		}
		else
		{
			System.out.println(no+" is not Palindrome ");
		}
			

	}

}
