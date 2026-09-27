class Car{
  String engineType;
  String color;
  int horsepower;

  // calling a construction
  public Car(String engineType){
    this.engineType = engineType;
  }

  // calling a parameterized construction
  public Car(String engineType, String color){
    this(engineType);
    this.color = color;
  }

  // calling a parameterized construction
  public Car(String engineType , String color, int horsepower){
    this(engineType, color);
    this.horsepower = horsepower;
  }

  // double horse power
  public void doubleHorsePower(){
    this.horsepower *= 2;
  }

  // for chasnging the color
  public void changeColor(String newColor){
    this.color = newColor;
  }
}

class CarQuestion{
  public static void main(String[] args){
    Car c1 = new Car("V8", "Blue", 800);

    System.out.println(c1.color + ", " + c1.engineType + ", " + c1.horsepower);

    c1.doubleHorsePower();
    c1.changeColor("Black or StarDust");

    System.out.println(c1.color + ", " + c1.engineType + ", " + c1.horsepower);
    c1.doubleHorsePower();
    System.out.println(c1.color + ", " + c1.engineType + ", " + c1.horsepower);
    c1.doubleHorsePower();
    System.out.println(c1.color + ", " + c1.engineType + ", " + c1.horsepower);
    c1.doubleHorsePower();
    System.out.println(c1.color + ", " + c1.engineType + ", " + c1.horsepower);
    c1.doubleHorsePower();
    System.out.println(c1.color + ", " + c1.engineType + ", " + c1.horsepower);
    System.out.println(c1.color + ", " + c1.engineType + ", " + c1.horsepower);
    c1.doubleHorsePower();
  }
}