package com.company;

public class Margarita extends Pizza {


    public Margarita(double price, double weight, State state, boolean topping) {
        super("Маргарита", price, weight, state, topping);
    }

    @Override
    public String toString() {

        return String.format(" %-9s | %-7s | %-7s | %-12s", getName(), (int) getWeight(), (int) getPrice(), (isTopping() == true ? "С мясом" : "Без мяса"));
    }
}
