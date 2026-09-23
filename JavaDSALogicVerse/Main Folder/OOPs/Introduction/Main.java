class Student{
  String name;
  int roll_number;
  int age;


public void makeNoise(){
  System.out.println("Student's are making noise");
}
}

public 
class Main{
  public static void main (String[] args){
    Student s1 = new Student();
    // object "s1" of class "Student";
    Student s2 = new Student();
    // object "s2" of class "Student";

    s1.name = "AlgoForge";
    s1.roll_number = 55;
    s1.age = 23;

    System.out.println(s1.name);
    System.out.println(s1.roll_number);
    System.out.println(s2.age);

    //for makeNoise

    s1.makeNoise();
  }
}