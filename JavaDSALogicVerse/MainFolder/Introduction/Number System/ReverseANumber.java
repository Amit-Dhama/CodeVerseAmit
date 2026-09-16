import java.util.*;
public class ReverseANumber {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = scn.nextInt();
    int rev = 0;
    while(number>0)
    {
      int d = number%10;
      rev = rev*10+d;
      number = number/10;
    }
    System.out.println("The Reverse of a Given Number is : " + rev);
    scn.close();
  }
}