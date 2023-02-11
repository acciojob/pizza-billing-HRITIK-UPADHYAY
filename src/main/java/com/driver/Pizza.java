package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private  int toppings;

    boolean isExtraCheeseAdded;
    boolean isExtraToppingsAdded;
    boolean isBillCreated;
    boolean isTakeAway;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            this.price = 300;
           this.toppings = 70;
        }
        else {
            price = 400;
            toppings = 120;
        }

        this.bill = "Base Price Of The Pizza: " + price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            price += 80;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdded) {
            this.price += this.toppings;
            isExtraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway) {
            this.price += 20;
            isTakeAway = true;
        }
    }
    
    public String getBill(){
        // your code goes here
        if(!isBillCreated) {
            if (isExtraCheeseAdded) this.bill += "Extra Cheese Added: 80" + "\n";
            if (isExtraToppingsAdded) this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            if (isTakeAway) this.bill += "Paperbag Added: 20" + "\n";
            this.bill += "Total Price: " + this.price;
            this.isBillCreated = true;
        }
        return bill;
    }
}
