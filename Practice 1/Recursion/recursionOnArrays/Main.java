public class Main{


public static void printArray(int[] arr, int idx){

  // int n = arr.length();

  if(idx==arr.length){

    return;
  }

    System.out.print(arr[idx] + ", ");
    printArray(arr ,idx+1);
}




  public static void main(String[] args){
  
    int[] arr = {2,5,7,1,9};

    printArray(arr,0);


  }
}