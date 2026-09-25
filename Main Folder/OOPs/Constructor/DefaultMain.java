class Student{
  String name;
  int roll_number;
  int age;

// default constructor
public Student(){
  System.out.println("Default constructor is called"); // default constructor is used for set some default value only.
}

// parametrized constructor
public Student(String givenName, int givenRoll_Number){
  name = givenName;
  roll_number = givenRoll_Number;
  System.out.println("Parametrized constructor 2 is called");
}

// we also create more than one Parametrized constructor
public Student(String givenName, int givenRoll_Number, int givenAge){
  name = givenName;
  roll_number = givenRoll_Number;
  age = givenAge;
 }
}

//Parametrized Constructor -> used for create space for particular detail with any datatype but get any data to input in this is later.(in short -> this is occupied place for specific data but get the data later).

class DefaultMain{
  public static void main(String[] args){
    Student s1 = new Student(); // object "s1" of class "Student";
    Student s2 = new Student("Amit Dhama",24); // object "s2" of class "Student";
    Student s3 = new Student("Shubham Aman",24,50); // object "s3" of class "Student";

    System.out.println(s1.name + ", " + s2.roll_number + ", " + s3.age);
   
  }
}