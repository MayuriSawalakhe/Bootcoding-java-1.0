import java.util.Scanner;
 
class weather{
 public static void main (String arg[]) {
  int a;
 
  System.out.print ("\n\t Enter the temprature in Celcious = ");
  Scanner S1=new Scanner (System.in);
  a=S1.nextInt();
 
  if (a<=20)
   System.out.print ("\n Weather is Cool ");
  else if (a<=30 && a>=21)
   System.out.println ("\n\t Weather is Fine ");
  else if (a<=40 && a>=31)
   System.out.println ("\n\t Weather is Hot ");
  else
   System.out.println ("\n\t Weather is very Hot ");
 }
}