import java.util.*;
public class Questions{
//1.) -> For Just Checking
public static void justChecking(int[][] arr){

  for(int i=0;i<arr.length;i++){
    int[] anotherArray = arr[i];
    for(int j=0;j<arr[i].length;j++){
      int ele = anotherArray[j];
      System.out.print(("i: " +i +" j: " +j +" ele value: "+ele));
    }

    System.out.println();
  }
}

//2.) -> For Find Exit Point in 2D Array (Whereas, start with (0,0) going forward then it will rotate right after getting 1 and until 2D Array is getting out)
public static void findExitPoint(int[][] arr){
  int m = arr.length;
  int n = arr[0].length;

  int dir = 0;
  int row = 0;
  int col = 0;
  while(row < m && col < n && row >= 0 && col >= 0 ){
    if(arr[row][col]==1){
      arr[row][col] = 0;
      dir = (dir+1)%4;
    }

    if(dir==0){
      col++;
    } else if(dir==1){
      row++;
    } else if(dir==2){
      col--;
    } else{
      row--;
    }
  }

  if(row < 0) row++;
  if(col < 0) col++;
  if(row == m) row--;
  if(col == n) col--;

  System.out.println("The Exit Point of an Array will be:- Row: " +row +" and Column: " +col);
}

//3.) -> wave Traversal
public static void waveTraversal(int[][] arr){
  int n = arr.length;
  int m = arr[0].length;

  for(int col=0;col<m;col++){
    if(col%2==0){
      for(int row = 0;row<n;row++){
        System.out.print(arr[row][col]+ ", ");
      }
    } else{
        for(int row = m-1;row>=0;row--){
          System.out.print(arr[row][col]+ ", ");
        }
      }
      System.out.println();
    }
}

//4.) -> Print Spiral
public static void printSpiral(int[][] arr){
  int n = arr.length;
  int m = arr[0].length;
  int sr = 0;
  int sc = 0;
  int er = n-1;
  int ec = m-1;

  while(sr<=er && sc<=ec){
  //Left Wall
  for(int col=sc,row = sr;row <= er ; row++){
    System.out.println(arr[row][col]);
  }
  System.out.println();
  sc++;
  //Bottom Wall
  for(int row = er, col = sc; col <=ec ; col++){
    System.out.println(arr[row][col]);
  }
  er--;
  //Right Wall
  for(int col = ec, row = er;row >= sr; row--){
    System.out.println(arr[row][col]);
  }
  ec--;
  //Top Wall
  for(int col = ec, row = sr ; col >= sc ; col--){
    System.out.println(arr[row][col]);
  }
  sr++;
  }
}




public static void print2DArray(int[][] arr){
  System.out.println("The return is: ");
  for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
      System.out.print(arr[i][j]+", ");
    }
    System.out.println();
  }
}

public static int[][] take2DArrayInput(){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Number of Size of an Array\nM Size * N Size:");
  int mSize = sc.nextInt();
  int nSize = sc.nextInt();
  int num = 1;
  int[][] arr = new int[mSize][nSize];

  System.out.println("Enter Row-0 Line: ");
  for(int i=0;i<mSize;i++){
    for(int j=0;j<nSize;j++){
      arr[i][j] = sc.nextInt();
    }
    System.out.println("Enter num " +num +" row Input: ");
    num++;
  }
  return arr;
}

  public static void main(String[] args){
    //For Taking 2D Array Input:
    int[][] arr = take2DArrayInput();
    //For print 2D Array Final Result:
    //printArray(arr);
    //Result1 -> Just Checking
    //justChecking(arr);
    //2.) Result2 -> Find Exit Point:
    //findExitPoint(arr);
    //3.) Result3 -> For Wave Traversal:
    //waveTraversal(arr);
    //4.) Result4 -> Print Spiral:
    printSpiral(arr);
  }
}