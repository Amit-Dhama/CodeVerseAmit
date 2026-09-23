import java.util.*;
public class TernaryOperator
{
  public static void main(String[] args)
  {
    System.out.println("Enter Two Numbers : ");
    Scanner scn = new Scanner(System.in);
    int num1 = scn.nextInt();
    int num2 = scn.nextInt();
    int max = num1>num2?num1:num2;
    System.out.println(max + " is a maximum number");
    scn.close();
  }
}