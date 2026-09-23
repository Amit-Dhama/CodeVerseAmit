class Student{
  String name;
  int roll_number;
  int age;


// parametrized constructor
public Student(String givenName, int givenRoll_Number){
  name = givenName;
  roll_number = givenRoll_Number;
  System.out.println("Parametrized constructor 2 is called");
}

// for class of sum
public int sum(){
  int roll_number = 123;
  return this.roll_number + roll_number; //this.roll_number contains 24 and roll_number = 123 here;
}

// this keyword -> to access object's own properties.
}

class Example{
  public static void main(String[] args){
    Student s2 = new Student("Amit Dhama",24); // object "s2" of class "Student";

    System.out.println(s2.sum());
   
  }
}