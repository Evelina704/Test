package com.company;

public enum Size {
    SMALL(300,600),
    MEDIUM(400, 800),
    LARGE(500, 1000);

    private int price;
    private int weight;

    Size(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }
}
