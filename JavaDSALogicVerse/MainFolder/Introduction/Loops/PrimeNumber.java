//Homework :- For Count Prime Number's till n Numbers.
import java.util.*;
public class PrimeNumber 
{
  public static void main(String[] args)
  {
  System.out.println("Enter n Number's Till where I have to Find Prime Number : ");
  Scanner scn = new Scanner(System.in);
  int num = scn.nextInt();
  int a =2;
  int primeCount=0;
  while (a<=num)
  {
    int count=0;
    for(int i=2;i*i<=a;i++)
    {
      if(a%i==0)
      {
        count++;
      }
    }
      if(count==0)
      {
        primeCount++;
      }
    a++;
  }
  System.out.println(primeCount + " is a total Prime Number's");
  scn.close();
}
}