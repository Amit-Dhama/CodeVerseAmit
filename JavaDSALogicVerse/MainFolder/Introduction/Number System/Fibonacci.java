import java.util.*;
public class Fibonacci {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the Number's : ");
    int number = scn.nextInt();
    int fn = 0;
    int sn = 1;
    int tn = fn+sn;
    for(int i=0;i<number-2;i++)
    {
      fn=sn;
      sn=tn;
      tn=fn+sn;
    }
    System.out.println("The " + number + " Fibonacci series : " + tn);
    scn.close();
  }
}
//How to print full Serie's;