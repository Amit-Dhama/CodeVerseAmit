class Car{ // class
  String engineType;
  String color;
  int horsePower;

  static String companyName = "Hyundai"; // static data

  public void horn(){ // default constructor
    makeNoise();
    System.out.println("Pressing Horn");
  }

  public static void makeNoise(){ // creating a static function

    // horn(); 
    // not call non- static method by static method 

    // this.color = "red";
    // it does not change any data in non static method by static method

    companyName = "A"; // it really changes the static data from static function
    System.out.println("Making Noise");
  }

}
// the static keyword contains the logic behind:
class Main{
  public static void main(String[] args){
    Car c1 = new Car(); // object

    Car c2 = new Car(); // object
    
    c2.horn();
    //
    c2.makeNoise();

    // for printing:
    System.out.println(c1.companyName);

    // for update any one object:
    c1.companyName = "Ford";

    System.out.println(c1.companyName);

    // update for obj. 1 but it also give same in obj. 2:
    System.out.println(c2.companyName);

    // basically it belongs to class means (it is a class property), not for particular object.
  }
}