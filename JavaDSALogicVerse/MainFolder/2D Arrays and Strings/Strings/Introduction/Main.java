public class Main{
  public static void main(String[] args){
    String str1 = "hello";
    String str2 = "hello";
    String str3 = new String("hello");

    if(str1 == str2){
      System.out.println("s1 is equal to s2");
    }
    if(str1 == str3){
      System.out.println("s1 is equal to s3");
    }
  }
}