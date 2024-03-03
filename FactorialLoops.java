import java.util.Scanner;
class FactorialLoops 
{
  public static void main(String[] args)
 { 
   int i,num,fact=1;
   System.out.print("Enter the number for the factorial :");
   Scanner S1= new Scanner (System.in);
   num=S1.nextInt();
   for(i=1; i<=num ; i++);
   {
     fact = fact*i;
   }
    System.out.println("Factorial of number "+fact);
  }
 }
   
