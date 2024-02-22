import java.util.Scanner;
class evenodd
{
	public static void main(String args[])
	{
		int n;
                Scanner S1 = new Scanner(System.in);
		System.out.print("Enter the number:");
	        n = S1.nextInt();			
		if(n%2==0)
			System.out.println("the number is even");
		else 
			System.out.println("the number is odd");
		
		
	}
}

