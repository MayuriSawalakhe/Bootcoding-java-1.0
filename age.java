import java.util.Scanner;
class age
{
	public static void main(String args[])
	{
		System.out.println("Please enter your age:");

		Scanner in = new Scanner(System.in);
		int age = in.nextInt();

		if (age >= 1 && age <= 5) {
			System.out.println("infant");

		} else if (age >= 6 && age <= 10) {
			System.out.println("child");

		} else if (age >= 11 && age <= 20) {
			System.out.println("teenager");

		} else {
			System.out.println("Adult");

		}

	}
	
}

