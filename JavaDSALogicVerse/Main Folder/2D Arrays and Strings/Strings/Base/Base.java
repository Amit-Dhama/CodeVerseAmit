public class Base {
  public static void main(String[] args) {
    //Get the String character:
    String str = "hello";
    //char ch = str.charAt(idx);
    char ch = str.charAt(4);
    System.out.println(ch);

    //Add the String:
    String s1 = "abc";
    String s2 = "def";
    String s3 = s1+s2;
    System.out.println(s3);

    //Know The length of String:
    String str1 = "Hello";
    //str1.length();
    System.out.println(str1.length());

    //Add value after String:
    String string = "Hello";
    string = string + 2;
    System.out.println(string);
    string = string+4;
    System.out.println(string);
    string = string +"def";
    System.out.println(string);
  }
}
