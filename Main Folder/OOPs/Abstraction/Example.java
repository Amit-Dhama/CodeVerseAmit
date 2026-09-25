abstract class Shape{ // abstract data type (isme jab bhi ham abstract data type lagate hain hamm jis class mein usme data ke aage aur same class ke aage bhi abstract lagta hain)
  
  int numberOfSides;
  abstract public double area(); // pure virtual function with 0 result as ():

  public void printSides(){ // function created
    System.out.println(this.numberOfSides);
  }
}

class Rectangle extends Shape{ // (inheritance)
  int length;
  int breadth;

  public Rectangle(int length, int breadth){ // (parametrized constructor)
    this.numberOfSides = 4;
    this.length = length;
    this.breadth = breadth;
  }

  @Override
  public double area(){ // (Run-Time PolyMorphism)
    return length*breadth;
  }
}

class Circle extends Shape{
  int radius;

  public Circle(int radius){
    this.numberOfSides = 0;
    this.radius = radius;
  }

  @Override
  public double area(){ // (Run-Time PolyMorphism)
    return this.radius*this.radius*3.14;
  }
}



class Example{
  public static void main(String[] args){
    Circle c1 = new Circle(2);
    System.out.println(c1.area());

    Rectangle r1 = new Rectangle(2,3);
    System.out.println(r1.area());
  }
}

// (Abstraction is not fully 100% Abstract the Data, So it needs Interface for complete hide)
