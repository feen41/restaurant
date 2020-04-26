package com.restaraunt;

public class Borscht extends Meal implements Boil{
    boolean addSmetana;
    Borscht(String price, String weight, boolean addSmetana){
        super(price,weight);
        this.addSmetana = addSmetana;

    }
    public void chiefPhrase(){
        System.out.println("Smachnogo!");
    }
    public Object boil(){
        if (addSmetana) {
            System.out.println("Ohhh my lovely 'smetana'");
        }
        System.out.println("Yammy");
        return null;
    }
}
