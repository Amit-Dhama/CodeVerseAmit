class Student{
  String name;
  int roll_number;
  int age;

  public void makeNoise(){
    System.out.println("Student are not making noise");
  }
}

class Main{
  public static void main(String[] args){
    Student s1 = new Student(); // object "s1" of class "Student";
    Student s2 = new Student(); // object "s2" of class "Student";

    s1.name = "Amit Dhama by AlgoForge";
    s1.roll_number = 1;
    s1.age = 20;

    System.out.println(s1.name);
    System.out.println(s1.roll_number);
    System.out.println(s1.age);

    s1.makeNoise();
  }
}