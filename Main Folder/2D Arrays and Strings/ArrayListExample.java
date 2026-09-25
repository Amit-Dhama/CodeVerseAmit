//import java.util.ArrayList;
import java.util.*;
public class ArrayListExample{
  public static void main(String[] args){
    System.out.println("ArrayList -> Dynamic Array -> no size");

    //ArrayList Use:
    ArrayList <Integer> al = new ArrayList<>();

    //For Add:
    al.add(1);
    al.add(12);
    al.add(34);
    al.add(23);
    System.out.println(al);

    //For Set:
    System.out.println("The Format for set:\n//al.set(index,element);");
    al.set(2,21);
    System.out.println(al);

    //For Get:
    System.out.println("The Format for get:\n//al.get(index);");
    System.out.println(al.get(3));

    //For Remove:
    System.out.println("The Format for remove:\n//al.remove(index);");
    al.remove(1);
    System.out.println(al);

    //For Add:
    System.out.println("The Format for remove:\n//al.remove(index);");
    al.add(44);
    al.add(46);
    System.out.println(al);
  }
}