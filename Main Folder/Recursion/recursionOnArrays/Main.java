import java.util.*;

public class Main{

  public static void printArray(int[] arr, int idx){

    if(idx == arr.length){
      return;
    }

    System.out.println(arr[idx]);
    printArray(arr,idx+1);
  }

  public static int findMax(int[] arr,int idx,int max){

    if(idx == arr.length){
      return max;
    }
    
    if(arr[idx] > max){
      max = arr[idx];
    }
    return findMax(arr,idx+1,max);
  }
  //find first index of a target element
  
  public static int findFirstIndex(int[] arr, int target, int idx){

    //base condition
    if(idx == arr.length){
      return -1;
    }

    //whole problem
    if (arr[idx] == target)
    {
      return idx;
    }

    //smaller problem
    return findFirstIndex(arr, target,idx+1);
  }

  //find last index of a target element
  public static int findLastIndex(int[] arr,int target,int idx){

    if(idx < 0){
      return -1;
    }
    //whole problem
    if(arr[idx]==target){
      return idx;
    }

    //smaller problem
    return findLastIndex(arr,target,idx-1);
  }

  //find all indices of a target number
  public static int[] findAllIndices(int[] arr, int target, int idx, int fsf){//fsf -> found so far
    
    //base condition
    if(idx == arr.length){
      int[] baseArray = new int[fsf];
      return baseArray;
    }

    int[] ans;
    //whole problem
    if(arr[idx] == target){
      ans = findAllIndices(arr,target,idx+1,fsf+1);
    }else{
      
    //smaller problem
      ans = findAllIndices(arr,target,idx+1,fsf);
    }
    if(arr[idx] == target){
      ans[fsf] = idx;
    }
    return ans;
  }


  
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    // System.out.println("Enter size of an Array: ");
    // int size = scn.nextInt();
    // int[] arr = new int[size];

    // System.out.println("Enter  element number's of an array: ");
    // for(int i=0;i<size;i++){
    //   arr[i] = scn.nextInt();
    // }

    // int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29};
    int[] arr = {4,7,12,9,8,4};

    //int max = Integer.MIN_VALUE;
    int target = scn.nextInt();

    //ans1 -> print array by recursion:
    //printArray(arr, 0);
    //ans2 -> find max in array by using recursion:
    //int ans2 = findMax(arr,0,max);
    //int ans3 = findFirstIndex(arr, target ,0);
    //int ans4 = findLastIndex(arr,target,arr.length-1);
    int[] ans5 = findAllIndices(arr,target,0,0);



    //for printing results:
    //System.out.println(result2);
    //System.out.println(result3);
    //System.out.println("last index of an Array by recursion at " + result4);
    for(int i=0;i<ans5.length;i++){
      System.out.print(ans5[i] + ", ");
    }
    scn.close();
  }
}
// <--------------------------------Recursion on Arrays ---------------------------------->