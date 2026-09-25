class Main{
  public static void main(String[] args){
    Pizza p = new Pizza(true);
    p.createBaseOfPizze();
    p.addExtraCheese();
    p.addExtraToppings();

    System.out.println("The total price of Pizza : " +p.getBill());
    System.out.println("");

    DeluxePizza dp = new DeluxePizza(true);
    dp.addExtraCheese();
    dp.addExtraCheese();
    dp.addExtraToppings();
    dp.getBill();
    System.out.println("The total Price of Deluxe Pizza : "+dp.getBill());
  }
}