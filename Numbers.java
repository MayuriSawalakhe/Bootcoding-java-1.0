import java.util.Scanner;
 
class Numbers{
 public static void main (String arg[]) {
  int num1,num2;
 
  System.out.print ("\n Enter the Number = ");
  Scanner S1=new Scanner (System.in);
  num1=S1.nextInt();
  num2=S1.nextInt();
 
  if (num1==num2)
   System.out.print ("\n Both numbers are equal ");
  else if (num1>num2)
   System.out.println ("\n num1 is greater than num2 ");
  else 
   System.out.println ("\n num2 is greater than num1 ");
  }
}