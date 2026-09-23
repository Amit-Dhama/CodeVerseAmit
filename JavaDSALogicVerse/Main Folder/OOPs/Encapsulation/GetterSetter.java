class Student{
  String Name;
  protected int rollNumber;
  private int marks;
  final private String adminPassword = "password";

  public Student(String Name, int marks){
    this.Name = Name;
    this.marks = marks;
  }

  // getter function
  public int getMarks(){
    return this.marks;
  }

  // setter function
  public void setMarks(String Password, int newMarks){
    if(Password.equals(adminPassword)){
      this.marks = newMarks;
    } else{
      System.out.println("Wrong Password !!!");
    }
  }

}



class GetterSetter{
  public static void main(String[] args){
    Student s1 = new Student("Amit Dhama", 74);
    //s1.marks = 100;

    s1.setMarks("password",95);
    System.out.println(s1.getMarks());
  }
}