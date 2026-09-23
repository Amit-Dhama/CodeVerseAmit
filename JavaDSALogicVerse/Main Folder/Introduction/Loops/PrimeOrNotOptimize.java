import java.util.*;
public class PrimeOrNotOptimize {
  public static void main(String[] args) {
  System.out.println("Enter number");
  Scanner scn = new Scanner(System.in); 
  int num = scn.nextInt();
  int count=0;
    for(int i=1;i*i<=num;i++)
    {
      if(num%i==0)
      {
        count++;
      }
    }
    if(count>=2)
    {
        System.out.println(num + " is a Prime Number");
    }
    else{
      System.out.println(num + " is not a Prime Number");
    }
    scn.close();
  }
}