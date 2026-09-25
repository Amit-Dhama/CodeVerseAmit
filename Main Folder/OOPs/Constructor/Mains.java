class Student{
  String name;
  int roll_number;
  int age;

//   // calling a constructor
//   public Student(){
//     System.out.println("Constructor is called");

//     // function without any return type called when any object is created.
//     // name same as class name
//   }
// }

// calling a second constructor

public Student(){
  age = 25;
}
}

class Mains{
  public static void main(String[] args){
    Student s1 = new Student(); // object "s1" of class "Student";
    Student s2 = new Student(); // object "s2" of class "Student";
    Student s3 = new Student(); // object "s3" of class "Student";

    System.out.println(s1.age + s2.age + s3.age);
   
  }
}