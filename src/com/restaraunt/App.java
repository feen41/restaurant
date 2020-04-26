package com.restaraunt;

public class App {
    public static void main(String[] args) {

        Meal pizza = new Pizza("9.99$","400g" );
        pizza.chiefPrase();
        pizza.setType(Types.LANCH);
        System.out.println("The price is - " + pizza.getPrice());
        System.out.println("Meal weight is - " + pizza.getWeight());
        pizza.serveMeal();
    }
}
