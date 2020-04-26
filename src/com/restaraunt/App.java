package com.restaraunt;

public class App {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("9.99$","400g", "cheese with nuts" );
        if (pizza.sell(pizza.getPrice()) == true) {

            new Pizza(pizza.getPrice(), pizza.getWeight(), pizza.getTopping());
            pizza.chiefPhrase();
            pizza.setType(Types.LANCH);
            System.out.println("The price is - " + pizza.getPrice());
            System.out.println("Meal weight is - " + pizza.getWeight());
            pizza.serveMeal();
        }
        System.out.println(Meal.receiptCount);
    }
}
