import java.util.Scanner;
public class Billing
{
  public static void main (String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the price of three products : ");
    float product1 = scn.nextFloat();
    float product2= scn.nextFloat();
    float product3 = scn.nextFloat();
    float total = product1+product2+product3;
    System.out.println("The Total amount of three product's are : " + total);
    float gst = total*18/100;
    System.out.println("The GST are : \n9% is C.G.P.A.\n9% S.G.P.A. is : " +gst);
    float totalprice = total+gst;
    System.out.println("The Total Price is : " + totalprice);
    float discount = totalprice*10/100;
    System.out.println("The total Discount : " +discount);
    float payable = totalprice-discount;
    System.out.println("The Payable Amount : " +payable);
    System.out.println("Thankyou! Come again");
    scn.close();
  }
}