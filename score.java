import java.util.Scanner;
class score
{
	public static void main(String args[])
	{
		int per;
                Scanner S1 = new Scanner(System.in);
		System.out.print("Enter the score in percentage :");
	        per = S1.nextInt();			
		if(per>45)
			System.out.println("pass");
		else if(per<45)
			System.out.println("fail");
		else 
			System.out.println("pass");
		
	}
}

