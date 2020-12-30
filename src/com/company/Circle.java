package com.company;

public class Circle {
    private int radius;
    private static final double PI = 3.14;

    private Circle(){

    }

    public static Circle makeCircle(int radius){
        Circle circle = new Circle();
        circle.setRadius(radius);
        return circle;
    }

    public int getArea(){
        return (int) (getPI() * Math.pow(getRadius(), 2));
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }
}
