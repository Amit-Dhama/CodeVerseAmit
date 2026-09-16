// import java.util.*;
//1.) Highlighted Or Non-Commenting is a HardCode To Use To Understand Easily.

public class Main{

  public static void fillRandomValue(int[][] arr){
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length;j++){
        arr[i][j] = (i+j);
        System.out.print(arr[i][j] + ", ");
      }
      System.out.println();
    }
  }

  //2.) Commented is for Initialize and Enter By User By Their Choice.

  
  // public static int[][] fillRandomValues(int[][] arr){
  //   Scanner sc = new Scanner(System.in);
  //   System.out.println("Enter the Record you want: ");
  //   for(int i=0;i<arr.length;i++){
  //     for(int j=0;j<arr.length;j++){
  //       arr[i][j] = sc.nextInt();
  //     }
  //   }
  //   return arr;
  // }



  // public static void print2DArray(int[][]result){
  //   for(int i=0;i<result.length;i++){
  //     for(int j=0;j<result.length;j++){
  //       System.out.print(result[i][j]+", ");
  //     }
  //     System.out.println();
  //   }
  // }
  public static void main(String[] args){
    int[][] arr = new int[3][3];

    fillRandomValue(arr);

    //int[][] result = fillRandomValues(arr);

    //print2DArray(result);
  }
}