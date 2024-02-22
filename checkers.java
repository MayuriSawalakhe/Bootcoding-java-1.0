import java.util.Scanner;
 
class checkers{
 public static void main (String arg[]) {
  int a;
 
  System.out.print ("\n Enter the Number = ");
  Scanner S1=new Scanner (System.in);
  a=S1.nextInt();
 
 
  if (a>0)
   System.out.print ("\n The number is positive ");
  else if (a<0)
   System.out.println ("\n The number is negative ");
  else 
   System.out.println ("\n The number is zero ");
  }
}