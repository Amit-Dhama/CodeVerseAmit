class DeluxePizza extends Pizza{ // extends keyword represent inheritance
  public DeluxePizza(boolean isVeg){
super(isVeg);
  super.addExtraCheese();
  super.addExtraToppings();
  }
}