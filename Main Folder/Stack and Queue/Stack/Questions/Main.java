import java.util.Stack;
class Main{

  public static boolean isDuplicateBrackets(String str){
     Stack <Character> st = new Stack<>();
     for(int i=0;i<str.length();i++){
      char ch = str.charAt(i);

      if(ch == ')'){
        // if open bracket at top it's dupliacte:
        if(st.peek() == '('){
          return true;
        }

        // if not, remove all elements until we get open bracket:
        while(st.peek() != '('){
          st.pop();
        }
        st.pop(); // removing opening bracket:
      }else{
        st.push(ch);
      }
     }

     return false;
  }
 
public static void main(String[] args){

  String str = "((a+b)+((c+d)))"; // The duplicare brackets are found !!!
  String str = "((a+b)+(c+d))"; // The duplicare brackets are not found !!!

  
  boolean isDuplicate = isDuplicateBrackets(str);
  if(isDuplicate){
    System.out.println("The duplicare brackets are found !!!");
  } else{
    System.out.println("The duplicare brackets are not found !!!");
  }

}
}