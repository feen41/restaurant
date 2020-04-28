package com;

public class Pizza extends Meal implements Bake{

    private final String topping;

    Pizza(String price, String weight, String topping) {
        super(price,weight);
        this.topping = topping;

    }
    String getTopping(){
        return topping;
    }
    public void chiefPhrase(){
        System.out.println("Buon appetito!");
    };

    public void bake() {
        System.out.println("glurp-glurp-glurp");
    }
}
