import java.util.*;
public class RotateANumber {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int number = scn.nextInt();
    System.out.println("Enter Number Of Times you want to Rotated : ");
    int k = scn.nextInt();
    int length=0;
    int rotatedNumber = 0;
    int temp = number;
    while(temp>0)
    {
      length++;
      temp/=10;
    }
    k = k%length;
    if(k<0)
    {
      k=k+length;
    }
    int divisible = (int)Math.pow(10,k);
    int multiply = (int)Math.pow(10,length-k);
    int lastDigits = number%divisible;
    int firstDigits = number/divisible;
    rotatedNumber= lastDigits*multiply+firstDigits;
    System.out.println("Thr Rotated Number will be : " +rotatedNumber);
    scn.close();
  }
}