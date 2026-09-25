import java.util.*;
public class ArrayInput
{

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("The the Element's of Java for array you want : ");
    int number = scn.nextInt();

    int[] arr;
    arr = new int[number];

    for(int i=0;i<arr.length;i++)
    {
      arr[i] = scn.nextInt();
    }

    for(int i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]);
    }
    scn.close();
  } 
}