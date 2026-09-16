import java.util.*;
public class InversedNumber {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int number = scn.nextInt();
    int pos = 1;
    int inversedNumber = 0;
    while(number>0)
    {
      int lastdigit = number%10;
      int multiplier = (int)Math.pow(10,lastdigit-1);
      inversedNumber = inversedNumber+(pos*multiplier);
      number = number/10;
      pos++;
    }
    System.out.println(inversedNumber + " is a inverse ofa Number");
    scn.close();
  }
}