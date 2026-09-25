interface Vehicle{ // create a interface
  public void honk();
  int a = 45; // for interface
}

interface Car{ // create a interface
  public void honk();
  int a = 45;
}

class Mahindra implements Vehicle,Car{
  int numberOfWheels = 4;

  public void honk(){
    System.out.println("Mahindra honksssss! "); // multiple inheritance work here (because in class contains a definition) but in (inheritance more than a class contains definitin with a same function)
    
    // this.a++; error: reference to a is ambiguous
  }

  public void changeA(int newNumber){
    this.a = a;
  }

// it will not work and give as error like:




//   error: reference to a is ambiguous
//     this.a = a;
//         ^
//   both variable a in Vehicle and variable a in Car match
// MultipleInheritance.java:20: error: reference to a is ambiguous
//     this.a = a;
//              ^
//   both variable a in Vehicle and variable a in Car match

// Due to interference not access to do this here this thing here:
}


// (In java)
// Inheritance -> MultipleInheritance (not allowed or not possible)
// Interface -> MultipleInheritance (allowed and possible)
class MultipleInheritance{
  public static void main(String[] args){
    Mahindra mh = new Mahindra(); // create object
    mh.honk();
    mh.changeA(21);

  }
}

// In Inheritance mein hamara (Multiple Inheritance) possible nahi hain java mein
// But "Multiple Inheritance" possible hain interface mein in java