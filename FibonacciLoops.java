import java.util.Scanner;
class fibonacciLoops 
{
  public static void main(String[] args)
 { 
  int t1=0,t2=1;
  System.out.print("enter the number");
  Scanner S1=new Scanner (System.in);
  int n= S1.nextInt();
  System.out.print("first" +n+ "terms of fibonacci series:");
  for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}