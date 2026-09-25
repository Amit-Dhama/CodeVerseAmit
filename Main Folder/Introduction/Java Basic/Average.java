import java.util.Scanner;
public class Average
{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter Three Number's : ");
    int num1 = scn.nextInt();
    int num2 = scn.nextInt();
    int num3 = scn.nextInt();
    int total = num1+num2+num3;
    float average = total/3;
    System.out.println("The average is : " +average);
    scn.close();
  }
}