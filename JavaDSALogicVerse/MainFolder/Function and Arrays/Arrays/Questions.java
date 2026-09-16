import java.util.*;
public class Questions {

  //1.) Find all elements Greater Than X 
  // -----------------------------------------------------------------------------------------------------
  public static int countElementsGreaterThanX(int[] arr){
Scanner scn1 = new Scanner(System.in);
System.out.println("Enter the value of X");
int x = scn1.nextInt();
int count = 0;


for(int i=0;i<arr.length;i++){
  int ele = arr[i];

  if(ele>x)
  {
    count++;
  }

}
return count;
}

  //2.) Find Span Of Arrays
//-------------------------------------------------------------------------------------------------------
  public static int findSpan(int[] arr){
  int max = Integer.MIN_VALUE;
  int min = Integer.MAX_VALUE;
  for(int i=0;i<arr.length;i++){
    int ele = arr[i];
    if(ele>max){
      max = ele;
    }
    if(ele<min){
      min = ele;
    }
  }
  int span = max-min;
  return span;
}

  //3.) Find index of Target Element
//-------------------------------------------------------------------------------------------------------
  public static int search(int[] arr){
  Scanner scn3 = new Scanner(System.in);
  System.out.println("Enter Target Number! Please");
  int target = scn3.nextInt();

  for(int i=0;i<arr.length;i++){
    int ele = arr[i];

    if(ele==target){
      return i;
    }
    }
    return 0;
  }

  //4.) Make Buildings from array Elements
  //-----------------------------------------------------------------------------------------------------
  public static void printBuildings(int[] heights){
    int n = heights.length;
    int maxHeight = Integer.MIN_VALUE;

    for(int i=0;i<n;i++){
      int currentBuildingHeight = heights[i];
      maxHeight = Math.max(maxHeight,currentBuildingHeight);
    }

    int totalFloor = maxHeight;
    int currentFloor = maxHeight;

    while(currentFloor>0){
      //go to every building and check if currB uilding is exists or not

      for(int i=0;i<n;i++){
        int currentBuildingHeight = heights[i];

        if(currentFloor<=currentBuildingHeight){
          System.out.print("* ");
        } else{
          System.out.print("  ");
        }
      }

      //prepare for next line

    System.out.println();
    currentFloor--;
    }
  }

  //5.) Sum of Two Arrays
  //-----------------------------------------------------------------------------------------------------
  public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
    int n1 = arr1.length;
    int n2 = arr2.length;

    int resSize = Math.max(n1,n2)+1;

    int[] res = new int[resSize];

    int i = arr1.length-1;
    int j = arr2.length-1;
    int k = res.length-1;

    int carry = 0;

    while(k>=0){
      int csum = 0;

      if(i>=0){
        csum += arr1[i];
      }

      if(j>=0){
        csum += arr2[j];
      }

        csum+=carry;

        carry = csum/10;
        int d = csum%10;
        res[k] = d;

      i--;
      j--;
      k--;
    }
    return res;
  }

  //6.) Sum of Three Arrays
  //-----------------------------------------------------------------------------------------------------
  public static int[] sumOfThreeArrays(int[] arr1, int[] arr2, int[] arr3){
    int n1 = arr1.length;
    int n2 = arr2.length;
    int n3 = arr3.length;

    int resSize = Math.max(n1,n2)+1;
    resSize = Math.max(resSize,n3)+1;

    int[] res = new int[resSize];

    int i = arr1.length-1;
    int j = arr2.length-1;
    int l = arr3.length-1;
    int k = res.length-1;

    int carry = 0;

    while(k>=0){
      int csum = 0;

      if(i>=0){
        csum += arr1[i];
      }

      if(j>=0){
        csum += arr2[j];
      }

      if(l>=0){
        csum += arr3[l];
      }

        csum+=carry;

        carry = csum/10;
        int d = csum%10;
        res[k] = d;

      i--;
      j--;
      l--;
      k--;
    }
    return res;
  }


  //7.) Find all SubArrays
  //-----------------------------------------------------------------------------------------------------
  public static void findAllSubArrays(int[] arr){
    int size = arr.length;

      for(int si=0;si<size;si++){
        for(int ei=si;ei<size;ei++){
          
          for(int k=si;k<=ei;k++){
            System.out.print(arr[k] + " ");
          }

          System.out.println();

        }
        System.out.println();
      }
  }

  //8.) Print all Subsets of an Array
  //-----------------------------------------------------------------------------------------------------
  public static void printSubsetOfArray(int[] nums){
    int n = nums.length;
    int sub_set=(int)Math.pow(2,n);
    int count = 0;
    for(int i=0;i<sub_set;i++){
      String sub = "";
      int current_number=i;
      
      for(int idx=n-1;idx>=0;idx--){
        int rem = current_number%2;
        if(rem==0){
          sub= "_,"+sub;
        } else{
          sub = nums[idx]+","+sub;
        }
        current_number/=2;
      }
      System.out.println(sub);
      count++;
    }
    System.out.println("Total Number of Lines is : " +count);
  }

  //9.) Reverse an Array
  //-----------------------------------------------------------------------------------------------------
  public static int[] reverseArray(int[] arr){
    int n = arr.length;
    int left = 0;
    int right = n-1;

    for(left = 0,right = n-1;left<right;left++,right--){
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      
    }
    return arr;
  }

  //10.) Reverse an Array Optimization
  //-----------------------------------------------------------------------------------------------------
  public static int[] swap(int[] arr,int left,int right){
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
    return arr;
  }

  public static int[] reverseArray1(int[] arr){
    int n = arr.length;
    int left = 0;
    int right = n-1;

    while(left<right){

      int[] result = swap(arr,left,right);

      //Updation part :- 
      left++;
      right--;
    }
    return arr;
  }

  //10.) Reverse an Array Optimization 2
  //-----------------------------------------------------------------------------------------------------
  public static int[] reverseArray2(int[] arr){
    int n = arr.length;

    for(int i=00;i<n;i++){
      int temp = arr[i];
      arr[i] = arr[n-1-i];
     arr[n-1-i] = temp;
    }
    return arr;
  }

  //11.) B.) For reverse an array
  //-----------------------------------------------------------------------------------------------------
  public static void reverse(int[] arr, int left, int right){
    while(left<right){
      int temp = arr[right];
      arr[right] = arr[left];
      arr[left] = temp;
      //Updation
      left++;
      right--;
      
    }
  }

  //11.) Rotate an Array
  //-------------------------------------------------------------------------------------------------------------------------------------------

  //Rotate an array (Leetcode 189)
  public static int[] rotateArray(int [] arr){

    Scanner scn11 = new Scanner(System.in);
    int n = arr.length;
    System.out.println("Enter the value till ehere you wanted to rotate is : ");
    int k = scn11.nextInt();
    
    k = k%n;
    if(k<0){
      k = k+n;
    }

    reverse(arr,0,n-1);
    reverse(arr,0,k-1);
    reverse(arr,k,n-1);

    return arr;
  }

  //12.) Find maximum sum of SubArray
  //-----------------------------------------------------------------------------------------------------
  public static int maxSubArray(int[] arr){
    int n = arr.length;

    int maxSum = Integer.MIN_VALUE;

    for(int si=0;si<n;si++){
      for(int ei=si;ei<n;ei++){
        int currSum=0;
        for(int k=si;k<=ei;k++){
          currSum+=arr[k];
        }
        maxSum = Math.max(maxSum,currSum);
      }
    }
    return maxSum;
  }

  //13.) Find maximum sum of SubArray
  //-------------------------------------------------------------------------------------------------------------------------------------------
  public static int maximumSubArray(int[] arr){

    int n = arr.length;
    int maximum_subArray=0;

    for(int si=0;si<n;si++){
      int csum=0;
      for(int ei=si;ei<n;ei++){
        csum+=arr[ei];
      }

      maximum_subArray = Math.max(maximum_subArray,csum);
    }
    return maximum_subArray;
  }

  //14.) Find maximum sum of SubArray by Kadane's Algorithm :-
  //-------------------------------------------------------------------------------------------------------------------------------------------
  
  //O(N) Kadane's Algorithm (Leetcode 53)
  public static int maximumsubArray(int[] arr){
    
    int meh = 0; //meh -> Maximum Ending Here
    int n = arr.length;
    int maximumNumber = Integer.MIN_VALUE;

    for(int i=0;i<n;i++){
      meh += arr[i];

          maximumNumber = Math.max(maximumNumber,meh);

      if(meh<0){
        meh=0;
      }
    }
    return meh;
  }




  //Array Input taking function
  //*****************************************************************************************************
  public static int[] takeArrayInput(){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter size of an array : ");
    
    int size = scn.nextInt();
    System.out.println("The size of an array is : " +size);
    int[] arr = new int[size];

    System.out.println("Enter values of an Array: ");

    for(int i=0;i<arr.length;i++){
      arr[i] = scn.nextInt();
    }

    return arr;
  }


//  Return Result print Array in Return Result
//*******************************************************************************************************
  public static void printArray(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i] + ", ");
    }
  }


  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int[] arr = takeArrayInput();
    //  int[] arr1 = takeArrayInput();
    //  int[] arr2 = takeArrayInput();
    //  int[] arr3 = takeArrayInput();
   
    //  int result1 = countElementsGreaterThanX(arr);
    //  int result2 = findSpan(arr);
    //  int result3 = search(arr);
    //  printBuildings(arr); //result4
    //  int[] result5 = sumOfTwoArrays(arr1,arr2);
    //  int[] result6 = sumOfThreeArrays(arr1,arr2,arr3);
    //  findAllSubArrays(arr); //result7
    //  printSubsetOfArray(arr); //result8
    //  int[] result9 = reverseArray1(arr);
    //  int[] result10 = reverseArray2(arr);
    //  int[] result11 = rotateArray(arr);
    //  int result12 = maxSubArray(arr);
    //  int result13 = maximumSubArray(arr);
        int result14 = maximumsubArray(arr);




    //  System.out.println("The Total Elements greater than X : " +result1);
    //  System.out.println("The Sppan of an array : "+result2);
    //  if(result3==0){
    //  System.out.println("Target, Not Found");
    //  }
    //  else{
    //  System.out.println("The element of Target Number is lying in : " +indexOfTargetElement);
    //  printArray(result5);
    //  printArray(result6);
    //  printArray(result9);
    //  printArray(result10);
    //  printArray(result11);
    //  System.out.println("The Maximum Sum of Sub Array will be " +result12);
    //  System.out.println("The Maximum Sum of Sub Array will be " +result13);
        System.out.println(" The Maximum sum of SubArray by kadane's Algorithm : " + result14);
        scn.close();
}
}