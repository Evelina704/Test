package com.company;

public class Main {
    public static void main(String[] args) {
        int[] radiuses = new int[10];

        for(int i = 0, j = 1; i < radiuses.length; i++, j++){
            radiuses[i] = j;
        }

        int count = 0;
        for(int i = 0; i < radiuses.length; i++){
            Circle circle = Circle.makeCircle(radiuses[i]);
            if(circle.getArea() % 3 == 0){
                count++;
                System.out.println(String.format("При радиусе %s площадь равна %s и оно кратно трём!", radiuses[i],circle.getArea()));
            }
        }

        System.out.println(String.format("Всего %s кругов кратны трём!", count));
    }
}
