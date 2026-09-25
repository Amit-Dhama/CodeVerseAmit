class Pizza{
  private int vegPizzaPrice = 250;
  private int nonVegPizzaPrice = 400;
  private int vegCheesePrice = 70;
  private int nonVegCheesePrice = 100;
  private int vegExtraToppingsCheesePrice = 50;
  private int nonVegExtraToppingsCheesePrice = 80;
  boolean isCheeseAdded;
  boolean isExtraToppings;
  
  boolean isVeg; // boolean taken because boolean consists (true or false)
  int totalPrice = 0;

  public Pizza(boolean isVeg){
    this.isVeg = isVeg;
    //createBaseOfPizze(); // pure virtual function with 0 result ();
  }

  public void createBaseOfPizze(){ // for asking pizza -> (isVeg or isNonVeg)
    if(this.isVeg){
      this.totalPrice = +this.vegPizzaPrice;
    } else{
      this.totalPrice = +this.nonVegPizzaPrice;
    }

    int basePrice = this.isVeg ? vegPizzaPrice : nonVegPizzaPrice; // for getting the base price of selected pizza
    System.out.println("The base price is : " +basePrice);
    this.totalPrice = +basePrice;
    System.out.println("The totalPrice for checking : " +totalPrice);
    
  }

  public void addExtraCheese(){ // for asking and the add of extra cheese price
    if(this.isCheeseAdded == true){
      return;
    }

    int cheesePrice = 0;
    if(this.isVeg){ // confirm (Veg or non-Veg)
      totalPrice += vegCheesePrice;
    } else{
      totalPrice += nonVegCheesePrice;
    }
    
    this.isCheeseAdded = true; // confirm if added

    cheesePrice = isVeg ? vegCheesePrice : nonVegCheesePrice; // calculate cheese price
    System.out.println("Price extra cheese are : " +cheesePrice); // show how much price we include
    //System.out.println("The totalPrice for checking : " +totalPrice);
  }

  public void addExtraToppings(){ // for asking and the add of extra toppings price
    if(this.isExtraToppings == true){
      return;
    }

    int toppingsPrice = 0;
    if(this.isVeg){ // confirm and specific (veg or non-veg) and add on total price:
      toppingsPrice = vegExtraToppingsCheesePrice;
    } else{
      toppingsPrice = totalPrice+nonVegExtraToppingsCheesePrice;
    }

    totalPrice += toppingsPrice;

    this.isExtraToppings = true; // confirm if added
    toppingsPrice = isVeg ? vegExtraToppingsCheesePrice : nonVegExtraToppingsCheesePrice;
    System.out.println("Price of Extra Toppings are : " +toppingsPrice); // show how much price we include
    //System.out.println("The totalPrice for checking : " +totalPrice);

  }

  public double getBill(){
    double gst = totalPrice*0.18;
    System.out.println("The G.S.T. amount : " +gst);
    double totalPayableAmount = totalPrice + gst;
    return totalPayableAmount;
  }
}