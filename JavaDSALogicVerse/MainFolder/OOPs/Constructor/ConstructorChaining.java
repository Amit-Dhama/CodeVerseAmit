class Student{
  String name;
  int roll_number;
  int age;

  // default constructor
  public Student(){
    System.out.println("Default construction is called");
  }

  public Student(String name){
    this.name = name;
    System.out.println("Construction setting name is called");
  }

  public Student(String name, int roll_number){
    this(name);
    this.roll_number = roll_number;
    System.out.println("Construction setting name, roll number is called");
  }

  public Student(String name,int roll_number,int age){
    this(name,roll_number);
    this.age = age;
    System.out.println("Construction setting name is called");
  } // here, this(name,roll_number) taken name and roll number from the upper function
  //this(name) taken name from above function

  // It mainly takening by dry -> (means) to don't repeat yourself
}




class ConstructionChaining{
  public static void main(String[] args){

    Student s3 = new Student("Amit Dhama",1,20);
  }
}