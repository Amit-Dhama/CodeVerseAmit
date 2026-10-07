import java.util.LinkedList;

class LinkedList{
  Node head;
  Node tail;
  int size;


  public LinkedList(){
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  public void addLast(int val){
    Node newNode = new Node(val);

    if(head == null){
      head = newNode;
      tail = newNode;
    } else{
      tail.next = newNode;
      tail = newNode;
    }

    this.size++;
  }
}



class Main{
  public static void main(String[] args){
    LinkedList ll = new LinkedList();

    ll.addLast(5);
    ll.addLast(10);
    ll.addLast(15);
    ll.addLast(20);

    ll.displayList();
  }
}