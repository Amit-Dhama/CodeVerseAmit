public class Main{

  // print nums from N to 1:
  public static void printDecreasing(int num){

    // base Condition:
    if(num==0){
      return;
    }

    // full ans:
    System.out.println(num);
    // smaller work:
    printDecreasing(num-1);
  }

  // print nums from 1 to N:
  public static void printIncreasing(int num){

    // base condition
    if(num == 0){
      return;
    }

    // smallerAns
    printIncreasing(num-1);

    // fullAns
    System.out.println(num);
  }

  // print numbers from 1 To N first Decreasing, then Increasing
  public static void printDecreIncre(int num){

    // base candition:
    if(num == 1){
      System.out.println(num);
      return;
    }

    System.out.println(num);

    printDecreIncre(num-1);

    System.out.println(num);

  }

  // find factorial of a number:
  public static int fact(int num){

  if(num == 0){
    return 1;
  }

  int smallerAns = fact(num-1);
  int ans = num*smallerAns;

  return ans;
 }

  // Find x raised to Power Y:
  public static int xRaisedY(int x, int y){
    if(y == 0){
      return 1;
    }

    int smallerAns = xRaisedY (x,y-1);
    int ans = smallerAns*x;

    return ans;

  }









  public static void main(String[] args){
    // printDecreasing(5);
    // printIncreasing(5);
    // printDecreIncre(3);
    // int result1 = fact(5);
    // int result2 = xRaisedY(2,5);



    // System.out.println(result1);
    // System.out.println(result2);
  }
}