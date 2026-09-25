import java.util.*;
public class Questions{
  //Compress String by Omitting Dublicate
  //Result->1:
  public static String compressString(String str){
    String res = "";
    res += str.charAt(0);

    for(int i=1; i<str.length(); i++){
      if(str.charAt(i) != str.charAt(i-1)){
        res += str.charAt(i);
      }
    }
    return res;
  }

  //Compress String by Imitting Dublicate 2
  //Result->2:
  public static String compressString2(String str){
    String res = "";
    int count = 1;
    res += str.charAt(0);
    for(int idx=1;idx<str.length();idx++){

      if(str.charAt(idx)==str.charAt(idx-1)){
        count++;
      } else {
        if(count > 1){
          res += count;
        }

        res += str.charAt(idx);
        count = 1;
      }
    }

    if(count>1)
    {
      res += count;
    }
    return res;
  }
  
  //Toggle Case Converting Small Case into Big Alphabetical Letter
  //Result->3:
  public static String toggleCase(String str){
    StringBuilder sb = new StringBuilder();
    for(int idx = 0;idx<str.length();idx++){
      char ch = str.charAt(idx);

      if('a' <= ch && ch <= 'z'){
        char upperCase = (char)(ch - ('a' - 'A'));
        sb.append(upperCase);
      } else if('A' <= ch && ch <= 'Z'){
        char lowerCase = (char)(ch + ('a' - 'A'));
        sb.append(lowerCase);
      } else {
        sb.append (ch);
      }
    }
    return sb.toString();
  }


  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);

    String str = scn.next();
    //String result1 = compressString(str);
    //System.out.println(result1);

    //String result2 = compressString2(str);
    //System.out.println(result2);
    
    String result3 = toggleCase(str);
    System.out.println(result3);
  }
  
}