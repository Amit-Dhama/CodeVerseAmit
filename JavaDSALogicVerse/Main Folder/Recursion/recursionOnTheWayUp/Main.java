import java.util.*;
public class Main{

  //1 -> print subsequences
  public static void printSubSequences(String str, String asf){ //asf -> ans so far

    //base condition
    if(str.length() == 0){
      System.out.print(asf + ", ");
      return;
    }

    // first char
    char firstChar = str.charAt(0);

    // smaller string
    String smallerString = str.substring(1);

    // smaller ans
    printSubSequences(smallerString,asf+firstChar);// firstChar said yes
    printSubSequences(smallerString,asf);// firstChar said no
  }

  //2 -> print keypad comination
  static String[] keys = {";#,","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
  public static void printKPC(String str, String asf){ //asf -> ans so far
    
    // base condition
    if(str.length() == 0){
      System.out.print(asf + ", ");
      return;
    }
    
    // first char
    char firstChar = str.charAt(0);
   
    // smaller string
    String smallerString = str.substring(1);


    int firstNum = firstChar -'0';
    String key = keys[firstNum];

    // smaller ans
    for(int i=0;i<key.length();i++){
      char keyChar = key.charAt(i);

      printKPC(smallerString,asf +keyChar);
    }
  }

  //3. -> print stair paths
  public static void printStairPaths(int n, String psf){
    
    //return condition
    if(n<0){ //no path to take negative steps
      return;
    }

    if(n == 0){
      System.out.print(psf + ", ");
    }
    
    printStairPaths(n-1,psf + "1");
    printStairPaths(n-2,psf + "2");
    printStairPaths(n-3,psf + "3");
  }

  //4. -> print maze paths
  public static void printMazePaths(int sr,int sc,int dr, int dc, String psf){ //psf: path so far
     //base condition
     if(sr>dr || sc>dc){
      return;
     }

     if(sr==dr && sc==dc){
      System.out.print(psf + ", ");
      return;
     }

    //suitable function
    printMazePaths(sr + 1, sc, dr, dc, psf + "v");
    printMazePaths(sr, sc + 1, dr, dc, psf + "h");

  }

  //5. -> print encodings
  public static void printEncodings(String str,String asf){ //asf -> ans so far
     //base condition
     if(str.length() == 0){
      System.out.print(asf);
      return;
     }

     //main understanding
     //we can take one character at a time:

     int firstNum = str.charAt(0) - '0';

     if(firstNum == 0){  // no possible solutions
      return;
     }

     char convertedLetter = (char) ('a' + (firstNum - 1));
     String smallerString = str.substring(1);

     //whole ans
     printEncodings(smallerString, asf + convertedLetter);

     //we can take two character at a time

     //base condition
     if(str.length() >= 2){
      String first2Letter = str.substring(0,2);
      int first2Num = Integer.parseInt(first2Letter);
      
      if(first2Num <= 26){
        convertedLetter = (char)('a' + first2Num - 1);
        smallerString = str.substring(2);

        printEncodings(smallerString, asf + convertedLetter);
      }
     }
  }
   
  public static void main(String[] args){
    // user given
    Scanner scn = new Scanner(System.in);
    // hard code

    
    //1.
    // print subsequences
    //printSubSequences("abc","");

    //2.
    //print keypad combination
    //printKPC("789","");

    //3.
    //print stair paths
    // printStairPaths(4,"");
    // scn.close();

    //4.
    //print maze paths
    //printMazePaths(0,0,7,11,"");

    //5.
    //print Encodings
    printEncodings("1234","");
    scn.close();
  }
}