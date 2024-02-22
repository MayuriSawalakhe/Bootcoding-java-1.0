import java.util.Scanner;
class vowelconsonant
{
	public static void main(String args[])
	{
		char ch;
                Scanner S1 = new Scanner(System.in);
		System.out.print("Enter the character:");
	        ch = S1.nextChar();			
		if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println("char is vowel");
		else 
			System.out.println("char is consonant");
		
		
	}
}

