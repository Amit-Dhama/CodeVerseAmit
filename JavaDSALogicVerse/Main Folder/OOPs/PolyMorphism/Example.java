class Bank{
  String Manager;

  int rateOfInterest(){
    return 5;
  }
}

class SBI extends Bank{ // inheritance

  @Override
  int rateOfInterest(){
    return 7;
  }
}

class ICICI extends Bank{ // inheritance

  @Override
  int rateOfInterest(){
    return 9;
  }
}

class HDFC extends Bank{ // inheritance

  @Override
  int rateOfInterest(){
    return 8;
  }
}

class Example{
  public static void main(String[] args){
    Bank bobj;
    bobj = new SBI(); // upcasting, run time
    bobj = new ICICI(); // upcasting, run time
    bobj = new HDFC(); //upcasting, run time
    System.out.println(bobj.rateOfInterest()); // expect -> 7 but give 8 (Check first take result or other object is found and previous discartd and last object answer is prefer as a result)
    // System.out.println(bobj.rateOfInterest()); // 9
    // System.out.println(bobj.rateOfInterest()); // 8

  }
}