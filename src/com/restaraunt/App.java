package com.restaraunt;

public class App {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("9.99","400g", "cheese with nuts" );
        if (pizza.sell(pizza.getPrice()) == true) {

            new Pizza(pizza.getPrice(), pizza.getWeight(), pizza.getTopping()).bake();
            pizza.chiefPhrase();
            pizza.setType(Types.DINNER);
            System.out.println("The price is - " + pizza.getPrice());
            System.out.println("Meal weight is - " + pizza.getWeight());
            pizza.serveMeal();
        }

        Borscht borscht = new Borscht("5.00", "500g", true);
        if (borscht.sell(borscht.getPrice()) == true){
            new Borscht(borscht.getPrice(),borscht.getWeight(),borscht.addSmetana).boil();
            borscht.chiefPhrase();
            borscht.setType(Types.LANCH);
            System.out.println("The price is - " + borscht.getPrice());
            System.out.println("Meal weight is - " + borscht.getWeight());
            borscht.serveMeal();
        }
        System.out.println(Meal.receiptCount);
    }
}
