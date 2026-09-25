interface Shape{ // for interface we use (interface) front of shape in place of class  (Ex: class Shape -> abstract Shape -> interface Shape)
 abstract public double area(); // pure virtual function with 0 result as ()
}

class Rectangle implements Shape{ // for using full hide implements by using interface in class we use ("implements" keyword) in place of extends (whereas extends -> Inheritance, implements -> interface)
  int length;
  int breadth;

  public Rectangle(int length, int breadth){
    this.length = length;
    this.breadth = breadth;

    
  }

  @Override
  public double area(){
    return this.length*this.breadth;
  }
}

class Circle implements Shape{ // for interface using ("implement keyword for extends to main")
  int radius;

  public Circle(int radius){
    this.radius = radius;
  }

  @Override
  public double area(){
    return this.radius*this.radius*3.14;
  }
}




class InterfaceExample{
  public static void main(String[] args){
    Circle c1 = new Circle(2);
     System.out.println(c1.area());

    Rectangle r1 = new Rectangle(2,3);
    System.out.println(r1.area());

  }
}