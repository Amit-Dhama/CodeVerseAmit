import java.util.*;
public class DigitsCount {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = scn.nextInt();
    int count = 0;
    while(number>0)
    {
      int d = number%10;
      count++;
      number = number/10;
    }
    System.out.println("The Number of Digit in a given Number : " +count);
    scn.close();
  }
}