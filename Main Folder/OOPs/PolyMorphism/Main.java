class Vehicle{ // parent / super class
  int number_of_wheels;

  public void honk(int a){ // method 1 : (overloading PolyMorphism)
   System.out.println("Honking from Vehicle class");
  }

  public void dipper(int a){ // 1 parameter : (overloading PolyMorphism)
    System.out.println("Vehicle class gives Dipper");
  }

  public void run(String a){ // FOR (Override PolyMorphism)
    System.out.println("Running from Vehicle class");
  }

}

class Car extends Vehicle{ // child class / sub class
  int handBrakeCapacity;

  public void honk(String a){ // method 2 : changing the method (overloading PolyMorphism)
    System.out.println("Honking from Car class");
  }

  public void dipper(int a, int b){ // two parameter's : (overloading PolyMorphism)
    System.out.println("Car class gives Dipper");
  }

  @Override
  public void run(String a){
    System.out.println("Running from Car class");
  }

}

class Bike extends Vehicle{
  int legBrakeCapacity;

  public void dipper(int a, int b, int c, int d){ // many parameter's : (overloading PolyMorphism)
    System.out.println("Bike Class gives Dipper");
  }

  @Override
  public void run(String a){
    System.out.println("Running from Bike Vehicle");
  }

}

class Main{
  public static void main(String[] args){
    // Vehicle v = new Vehicle(); // call a class by object
    // v.honk(2); // it print vehicle class function
    // // v.honk("Amit Dhama"); // it will give error not print Car Function as because :
    // // (parent class does not call Child class)
    // // (child class will definitely call Parent class)

    // v.dipper(2); // it gives vehicle class function
    // // v.dipper(1,5); // error
    // // v.dipper(1,5,21,42); // error


    // Car c = new Car(); // call a class by object
    // c.honk(2); // call function from Vehicle class (it carry integer data)
    // c.honk("Amit Dhama"); // call function from Car class (it carry "String Data") 
    // c.dipper(2); // it gives vehicle class function
    // c.dipper(1,5); // error
    // // c.dipper(1,12,3,21); // error not working because it prefers "extends" parent class as Vehicle

    // Bike b = new Bike();
    // b.dipper(2); // it gives vehicle class function
    // // b.dipper(1,4); // error not working because it prefers "extends" parent class as Vehicle
    // b.dipper(1,5,21,42);


    // // for checking the @Override PolyMorphism Work:
    // v.run("Amit Dhama");

    // c.run("Amit Dhama");

    // b.run("Amit Dhama");

    Vehicle v;
    v = new Bike();

    v.run("Amit Dhama"); // bike function is accessible because it creates a OBJECT of Bike class (it does not print another class same function as result or output) "@Override or Run Time PolyMorphism"
  }
}
// 1.) changing the number of parameter or change method (Overloading or Compile time PolyMorphism)
// 2.) if "Compulsory" in function method and parameter remains same then it applicable the function from a particular call object (@Override or Run Time PolyMorphism)