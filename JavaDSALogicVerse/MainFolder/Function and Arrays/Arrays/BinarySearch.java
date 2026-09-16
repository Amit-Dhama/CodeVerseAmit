import java.util.*;
public class BinarySearch {

   //1.) Find index of a Target Number 
  public static int findTarget(int[] arr, int target){
    int n = arr.length;
    int left = 0;
    int right = n-1;

    while(left<=right){
      int mid = (left+right)/2;

      if(arr[mid]==target){
        return mid;
      } else if(arr[mid]<target){
        left = mid+1;
      } else{
        right = mid-1;  //move to left region
      }
    }
    return -1;
    }

    //2.) Find Floor and Ceil
    public static void findFloorandCeil(int[] arr, int target){
      int floor = Integer.MIN_VALUE;  //The floor -> Nearest Lower Number Of Target.
      int ceil = Integer.MAX_VALUE;   //The ceil -> Nearest Largest Number of Target.

      int left = 0;
      int right = arr.length-1;

      while(left<= right){

      int mid = (left+right)/2;

      if(arr[mid]==target){
        floor = arr[mid];
        ceil = arr[mid];
      }else if(arr[mid]<target){
        floor = arr[mid];
        left += 1;
      }else{
        ceil = arr[mid];
        right -= 1;
      }
    }
      System.out.println("The Floor for the target is " +floor);
      System.out.println("The ceil for the target is " +ceil);
    }

    //3.)a.) For Finding First Occurence:
    public static int findFirstOccurence(int[] arr,int target){
      int left = 0;
      int right = arr.length-1;

      int firstOccurence = -1;
      while(left<=right){

        int mid = (left+right)/2;

        if(arr[mid]==target){
          firstOccurence = mid;
          right = mid-1;
        }else if(arr[mid]<target){
          left = mid+1;
        }else{
          right = mid-1;
        }
      }

      return firstOccurence;

    }

    //3.)b.) For Finding Last Occurence:
    public static int findLastOccurence(int[] arr, int target){
      int left = 0;
      int right = arr.length-1;

      int lastOccurence = -1;

      while(left<=right){

        int mid = (left+right)/2;

        if(arr[mid]==target){
          lastOccurence = mid;
          left = mid+1;
        }else if(arr[mid]<target){
          left = mid+1;
        }else{
          right = mid-1;
        }
      }
      return lastOccurence;
    }

    //3.) Find First Occurence Or Last Occurence of a Target Number
    public static int[] searchRange(int[] arr,int target){
      int firstOcc = findFirstOccurence(arr,target);
      int lastOcc = findLastOccurence(arr,target);
      return new int[] {firstOcc,lastOcc};
    }










    //1.For taking the Input of an Array
    public static int[] takeArrayInput(){
      Scanner scn = new Scanner(System.in);
      System.out.println("Enter The size of an Array : ");
      int size = scn.nextInt();

      System.out.println("Enter an variable of an Array Here");
      //Initializing the Array

      int[] arr = new int[size];

      for(int i=0;i<size;i++){
        arr[i] = scn.nextInt();
      }

      return arr;
    }

    //2.)For Return array Solutions read in main Solutions:
    public static void printArray(int[] result){
      for(int i=0;i<result.length;i++){
        System.out.print(result[i] + ", ");
      }
    }




  public static void main(String[] args){

    //1.) For Declared Value :-
    //int[] arr = {3,5,8,9,10,11,14};
    //int target = 10;

    int[] arr = takeArrayInput();

     //For taking Input of a few variables.

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number of Target");
    int target = sc.nextInt();

    //1.) -> For Find Target
    //int idx = findTarget(arr,target);
    //2.) -> For Find Floor and Ceil Value
    //findFloorandCeil(arr,target);
    //3.) -> For Finding First and Last Occurence
    int[] result3 = searchRange(arr,target);

    //1. -> For Find target Index.
    //System.out.println("The target is exist in that index which is " +idx);
    printArray(result3);
    sc.close();
}
}