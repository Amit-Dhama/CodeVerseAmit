import java.util.*;
public class BinaryToDecimal {

  public static int convertDecimal(int binaryNumber)
  {
    int decimalnumber = 0;
    int d;
    int power = 0;
    while(binaryNumber>0)
    {
      d = binaryNumber%10;
      decimalnumber = decimalnumber+(d*(int)Math.pow(2,power));
      power++;
      binaryNumber/=10;
    }
    return decimalnumber;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int binaryNumber = scn.nextInt();
    int decimalNumber = convertDecimal(binaryNumber);
    System.out.println("The Binary Number  " + binaryNumber + "  converted into a decimal number  " +decimalNumber);
    scn.close();
  }
}