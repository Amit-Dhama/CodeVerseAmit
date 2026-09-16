import java.util.*;
public class Weekday
{
  public static void main(String[] args)
  {
    System.out.println("Enter the number of a weak");
    Scanner scn = new Scanner(System.in);
    int number = scn.nextInt();
    switch (number)
    {
      case 1 :
        System.out.println(number + " is a Monday");
        break;
      case 2 :
        System.out.println(number + " is a Tuesday");
        break;
      case 3 :
        System.out.println(number + " is a Wednesday");
        break;
      case 4 :
        System.out.println(number + " is a Thursday");
        break;
      case 5 :
        System.out.println(number + " is a Friday");
        break;
      case 6 :
        System.out.println(number + " is a Saturday");
        break;
      case 7 :
        System.out.println(number + " is a Sunday");
        break;
      default :
        System.out.println(number + " is a Invalid Input");
        break;
    }
    scn.close();
  }
}