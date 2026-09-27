import java.util.*;
import java.util.Stack;
class Main{

    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
          char ch = s.charAt(i);

          if(ch == '(' || ch == '[' || ch =='{'){
            st.push(ch);
          }else if(ch == ')'){
            if(st.size() == 0 || st.peek() != '(') return false;

            st.pop(); // popping '('
          }else if(ch == '}'){
            if(st.size() == 0 || st.peek() != '{') return false;

            st.pop(); // popping '}'
          }else if(ch == ']'){
            if(st.size() == 0 || st.peek() != '(') return false;

            st.pop(); // popping ']'
          
          }
        }

        return st.size() == 0;
    }

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

// ======================================= Next Array Element ==========================================

// Next greater element on right (https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1)
// public ArrayList <Integer> nextGreaterElement(int[] arr){
//   ArrayList<Integer> numbers = new ArrayList<>();
//   int n = arr.length;

//   Stack <Integer> st = new Stack<>();

//   for(int i=n-1;i>=0;i--){
//     int currentEle = arr[i];
//     while(st.peek() > currentEle){
//       st.pop();
//     }
    
//   }

// }

























 
public static void main(String[] args){

  //String s = "((a+b)+((c+d)))"; // The duplicare brackets are found !!!
  //String str = "((a+b)+(c+d))"; // The duplicare brackets are not found !!!
  int[] arr = {7,5,1,6,10,4,9};

  
  // boolean isDuplicate = isDuplicateBrackets(str);
  // if(isDuplicate){
  //   System.out.println("The duplicare brackets are found !!!");
  // } else{
  //   System.out.println("The duplicare brackets are not found !!!");
  // }

// for leetcode question :
    //boolean isDuplicate = isValid(s);

}
}