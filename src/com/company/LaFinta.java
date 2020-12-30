package com.company;

public class LaFinta extends Pizza{

    public LaFinta(double price, double weight, State state, boolean topping) {
        super("Ла Финта", price, weight, state, topping);
    }

    @Override
    public String toString() {

        return String.format(" %-9s | %-7s | %-7s | %-12s", getName(), (int) getWeight(), (int) getPrice(), (isTopping() == true ? "С грибами" : "Без грибов"));


    }
}
