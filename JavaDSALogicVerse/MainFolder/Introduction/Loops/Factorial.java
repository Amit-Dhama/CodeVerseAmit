import java.util.*;
public class Factorial
{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a number for Factorial : ");
    int num = scn.nextInt();
    int fact=1;
    for(int i=num;i>=1;i--)
    {
      fact = fact*i;
    }
    System.out.println("The factorial is : " + fact);
  scn.close();
  }
}