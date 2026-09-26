import java.util.Stack; // stack package
class Introduction{
  public static void main(String[] args){
    Stack <Integer> st = new Stack<>(); // create stack / stack forming syntax

    // for adding stack element by push:
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);

    // for checking the peek element in stack:
    System.out.println(st.peek());

    // for removing element until it gets 0 as answer:
    while(st.peek()>0){
      st.pop();

      // for continous checking the top element number which removes is what:
      System.out.println(st.peek());
    }

  }
}