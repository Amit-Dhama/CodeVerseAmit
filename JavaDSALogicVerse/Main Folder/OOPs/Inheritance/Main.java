class Vehicle{
  String EngineCC;
  String color;
  int horsePower;

  public void pressHorn(){
    System.out.println("Pressing Horn");
  }
}

class Car extends Vehicle{
  int handbrakeCapacity;

  public void carFunction(){
    System.out.println("Car Function");
  }
}

class Bike extends Vehicle{
  int legBrakeCapacity;

  public void bikeFunction(String color){
    super.color = "red";
    System.out.println(color + ", " + super.color);
    System.out.println("Bike Function");
  }
}

class Main{
  public static void main(String[] args){
    Bike b = new Bike();

    //b.horsePower = 23;
    //b.legBrakeCapacity = 400;
    b.bikeFunction("Blue");
    //b.pressHorn();
  }
}