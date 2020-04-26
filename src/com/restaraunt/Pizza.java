package com.restaraunt;

public class Pizza extends Meal implements Bake{
    Pizza(String price, String weight) {
        super(price,weight);
    }
    public void chiefPrase(){
        System.out.println("Buon appetito!");
    };

    @Override

    public void bake() {
        System.out.println("glurp-glurp-glurp");
    }
}
