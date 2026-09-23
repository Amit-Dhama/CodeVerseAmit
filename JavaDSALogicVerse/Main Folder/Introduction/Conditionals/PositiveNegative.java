import java.util.*;
public class PositiveNegative
{
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int number = scn.nextInt();
    if(number>0)
    {
      System.out.println(number + " is a Positive Number");
    }
    else if(number<0)
    {
      System.out.println(number + " is a Negative Number");
    }
    else
    {
      System.out.println(number + " NOR Positive neither Negative Number");
    }
    scn.close();
  }
}