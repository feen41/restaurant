package com.restaraunt;

public abstract class Meal {
    private String price;
    private String weight;
    private Types type;
    static int receiptCount = 0;

    //Define meal price
    Meal(String price, String weight) {
        setPrice(price);
        setWeight(weight);
    }

    //set price method
    String getPrice() {
        return price;
    }
    void setPrice(String price) {
        this.price = price;
    }
    void addPrice(String overpay){
        this.price = price + overpay;
        System.out.println(price);
    }
    //set weight method
    String getWeight(){

        return weight;
    }
    void setWeight(String weight){
        this.weight = weight;
    }

    // set meal type
    void setType(Types type){
        this.type = type;
    }

    // abstract method
    public abstract void chiefPhrase();

    void serveMeal(){
        System.out.println("Your " + type + " is served");
    }

    boolean sell(String price){
        try{
            System.out.println("You can get this meal for " + price);
            receiptCount++;
            return true;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Out of money");
            return false;
        }

    }
    public void eat(boolean isSpoiled) throws MealIsSpoiled {
        if (isSpoiled) throw new MealIsSpoiled("Sorry, your meal is spoiled");
        chiefPhrase();
    }

}
