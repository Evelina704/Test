package com.company;

import com.company.Pizza;

public class Pepperoni extends Pizza {


    public Pepperoni(double price, double weight, State state, boolean topping) {
        super("Пепперони", price, weight, state, topping);
    }



    @Override
    public String toString() {
        return String.format(" %-9s | %-7s | %-7s | %-12s", getName(), (int) getWeight(), (int) getPrice(), (isTopping() == true ? "Острая" : "Не острая"));

    }
}
