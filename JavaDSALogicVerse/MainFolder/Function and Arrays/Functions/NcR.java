import java.util.*;
public class NcR {

public static int findFactorial(int number)
{
  int factorial = 1;
  for(int multiply=1;multiply<=number;multiply++)
  {
    factorial = factorial*multiply;
  }
  return factorial;
}

public static int findNcR(int n, int r)
{
  int nFact = findFactorial(n);
  int rFact = findFactorial(r);
  int NmRFact = findFactorial(n-r);
  int ncrResult = nFact/(rFact*NmRFact);
  return ncrResult;
}

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Give an number of N and R for NcR : ");
    int n = scn.nextInt();
    int r = scn.nextInt();
    int res = findNcR(n,r);
    System.out.println("The number of n and r gives NcR will be : " +res);
    scn.close();
  }
}