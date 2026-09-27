class Bike{
  String engineType;
  int horsePower;

  private static int totalBikeInstances = 0;
  // for invoking use constructor

  public Bike(){ // constructor called for increase counting
    totalBikeInstances++;
  }

  public static int getNumberOfBikes(){
    return totalBikeInstances;
  }
}



class StaticQuestion{
  public static void main(String[] args){

    // creating an objects :
    Bike b1 = new Bike();
    Bike b2 = new Bike();
    Bike b3 = new Bike();
    Bike b4 = new Bike();
    Bike b5 = new Bike();
    Bike b6 = new Bike();
    Bike b7 = new Bike();
    Bike b8 = new Bike();
    Bike b9 = new Bike();
    Bike b10 = new Bike();

    // b10.totalBikeInstances = 10;
    // b1.totalBikeInstances = 24; -> error: totalBikeInstances has private access in Bike.

    System.out.println(Bike.getNumberOfBikes());

  }
}