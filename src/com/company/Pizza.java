package com.company;

public abstract class Pizza {
    private  String name;
    private double price;
    private double weight;
    private State state;
    private boolean topping;



    public Pizza(String name, double price, double weight, State state, boolean topping) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.state = state;
        this.topping = topping;
    }


    public void action(){
        getState().action(this);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean isTopping() {
        return topping;
    }

    public void setTopping(boolean topping) {
        this.topping = topping;
    }

}
