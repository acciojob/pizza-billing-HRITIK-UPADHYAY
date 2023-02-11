package com.driver;

public class DeluxePizza extends Pizza {
    public DeluxePizza(Boolean isVeg) {
        super(isVeg); //parent(Pizza) constructor is called by super.
        // your code goes here
        addExtraCheese();
        addExtraToppings();
    }
}
