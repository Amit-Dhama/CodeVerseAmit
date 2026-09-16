public class miscProblems{
  public static int findMaxSum(int[][] grid, int row,int col, int n, int m){

    //base condition

    if(row>=n || col>=m){
      return Integer.MIN_VALUE;
    }

    if(row == n-1 && col == m-1){
      return grid[row][col];
    }

    //main problem ans
    int rightMaxSum = findMaxSum(grid, row, col + 1, n, m);
    int downMaxSum = findMaxSum(grid, row + 1, col, n, m);

    //find max
    int maxSum = Math.max(rightMaxSum,downMaxSum) +grid[row][col];
    return maxSum;
  }

  // permutation of a string
  public static void findPermuString(String str, String asf){ //asf -> ans so far
    
    // base condition
    if(str.length() == 0){
      System.out.print(asf + ", ");
      return;
    }

    //smaller condition
    char firstChar = str.charAt(0);
    String smallerString = str.substring(1);

    //smaller ans
    findPermuString(smallerString , asf + firstChar);

  }

  
  public static void main(String[] args){
    //int[][] grid = {{3,6,1},{2,3,4,},{5,5,1}};

    //1. -> find max path sum
    //int ans = findMaxSum(grid,0,0,grid.length,grid[0].length);

    //2. -> Permutation of a String
    // by the help of arraylist

    findPermuString("abc","");
    }
}