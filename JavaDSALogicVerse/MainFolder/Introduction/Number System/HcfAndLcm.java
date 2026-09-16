import java.util.*;
public class HcfAndLcm {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter The Value of a & b For HCF and LCM are :  ");
    int a = scn.nextInt();
    int b = scn.nextInt();
    int x = a;
    int y = b;
    while(a>0)
    {
      int rem = b%a;
      b=a;
      a=rem;
    }
    int hcf = b;
    System.out.println("The HCF will be : " + hcf);
    int lcm = x*y/hcf;
    System.out.println("The LCM of Both Number are : " + lcm);
    scn.close();
  }
}