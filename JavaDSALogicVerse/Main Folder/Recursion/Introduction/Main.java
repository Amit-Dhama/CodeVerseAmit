import java.util.*;
public class Main{

  // print nums from N to 1:
  public static void printDecreasing(int num){
    if(num == 0){
      return;
    }
    System.out.println(num);
    printDecreasing(num-1);

  }

  // Print nums from 1 to N:
  public static void printIncreasing(int num){
    if(num == 0){
      return;
    }
    printIncreasing(num-1);
    System.out.println(num);
  }

  //Print num's From (N to 1) and (1 to N):
  public static void printDecInc(int num){
    if(num == 1){
      System.out.println(num);
      return;
    }
    System.out.println(num);
    printDecInc(num-1);
    System.out.println(num);
  }

  //Find Factorial of a num:
  public static int fact(int num){
    if(num == 0){
      return 1;
    }

    int smallerAns = fact(num-1);
    int ans = num * smallerAns;

    return ans;
  }

  //Find x raised to Power Y:
  public static int pow(int x,int y){
    
    if(y == 0){
      return 1;
    }

    int smallerAns = pow(x , y-1);
    int ans = x * smallerAns;
    return ans;

  }

   //Find x raised to Power Y:
  public static int pow_log(int x,int y){
    
    if(y == 0){
      return 1;
    }

    int smallerAns = pow_log(x , y-1);
    int ans = smallerAns * smallerAns;

    if(y%2!=0){
      ans = x * ans;
    }
    
    return ans;

  }

  //Print Zig-Zag:
  public static void printZigZag(int num){
    if(num == 0){
      return;
    }

    System.out.println(num + " pre-area");
    printZigZag(num-1);
    System.out.println(num + " in-area");
    printZigZag(num-1);
    System.out.println(num + " post-area");
  }

  //Time Complexity : (number of calls) raised to power height of tree :-

  //tower of hanoi:
  public static void TOH(int n, int A,int C,int B){

    if(n==0){
      return;
    }
    TOH(n-1,A,B,C);
    System.out.println("Moving Disc : " + n + " from " + A + " -> " + C);
    TOH(n-1,B,C,A);
  }


  public static void main(String[] args){

    Scanner scn = new Scanner(System.in);

    //System.out.println("Enter a Number: ");
    //int num = scn.nextInt();

    //Used For Specific Result->5:
    //int x = scn.nextInt();
    //int y = scn.nextInt();
    //Result->1: For Print num's From N to 1:
    //printDecreasing(num);
    //Result->2: For Print num's From 1 To N:
    //printIncreasing(num);
    //Result->3: For Print num's From (N to 1) and (1 to N):
    //printDecInc(num);
    //Result->4: Find Factorial of a num:
    //int result4 = fact(num);
    //Result->5: Find x Raised to Power Y:
    //int result5 = pow(x,y);
    //Result->6: Find x Raised to Power Y:
    //int result6 = pow(x,y);
    //Result->7: Print Zig-Zag:
    //printZigZag(num);
    //Result->8: Print Tower Of Hanoi:
    //TOH(3,10,30,20);

    //Printing:
    //Result->4:
    //System.out.println(result4);
    //Result->5:
    //System.out.println(result5);
    //Result->6:
    //System.out.println(result6);
  }
}
// <-------------------------------* Recursion -> Introduction* --------------------------------->