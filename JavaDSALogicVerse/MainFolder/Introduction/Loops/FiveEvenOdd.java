import java.util.Scanner; 
public class FiveEvenOdd
{
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int count=5;
    while(count>0)
    {
      System.out.println("Enter five Number's : ");
      int num = scn.nextInt();
      if(num%2==0)
      {
        System.out.println(num + " is Even");
      }
      else{
        System.out.println(num + " is Odd");
      }
      count--;
    }
    scn.close();
  }
}