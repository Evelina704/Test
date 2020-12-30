package com.company;



import java.util.Random;

public class Orders {
    private static Pizza[] pizzas;




    public Orders(){
        pizzas = new Pizza[20];
        makePizzas();
    }

    public static void choosePizza(){
        System.out.print("Выберите пиццу(введи номер): ");
        int num = Utils.getNumber(1, pizzas.length);

        System.out.print("Выберите действие: \n\t1. Получить доп. информацию \n\t2. Изменить состояние\nВведите значение: ");
        int result = Utils.getNumber(1, 2);
        switch (result){
            case 1:
                pizzas[num - 1].action();
                break;
            case 2:
                System.out.println("Пицца в пути!");
                pizzas[num - 1].setState(State.DELIVER);
                break;
            default:
                choosePizza();
        }
    }

    public static void addPizza(Pizza pizza){
        Pizza[] newPizza = new Pizza[pizzas.length + 1];
        System.arraycopy(pizzas, 0, newPizza, 0, pizzas.length);
        pizzas = newPizza;
        pizzas[pizzas.length - 1] = pizza;
    }

    private void makePizzas() {
        for(int i = 0; i < pizzas.length; i++){
            pizzas[i] = makePizza();
        }
    }

    private Pizza makePizza() {
        Size size = getRandomSize();
        State state = getRandomState();
        boolean toppingg = getRandomTopping();
        return getRandomPizza(size.getPrice(), size.getWeight(), state, toppingg);
    }

    private boolean getRandomTopping() {
        int rand = new Random().nextInt(2) + 1;
        if(rand == 1){
            return true;
        } else return false;
    }

    private State getRandomState() {
        int rand = new Random().nextInt(2) + 1;
        switch (rand){
            case 1:
                return State.COOKING;
            case 2:
                return State.DELIVER;
            default:
                return null;
        }
    }

    private Size getRandomSize() {
        int rand = new Random().nextInt(3) + 1;
        switch (rand){
            case 1:
                return Size.SMALL;
            case 2:
                return Size.MEDIUM;
            case 3:
                return Size.LARGE;
            default:
                return null;
        }
    }

    private Pizza getRandomPizza(double price, double weight, State state, boolean topping) {
        int rand = new Random().nextInt(3) + 1;
        switch (rand){
            case 1:

                return new Pepperoni(price, weight, state, topping);
            case 2:
                return new Margarita(price, weight, state, topping);
            case 3:
                return new LaFinta(price, weight, state, topping);
            default:
                return null;
        }
    }

    public void showAll(){
        System.out.println("|-------+-----------+---------+---------+-------------|");
        System.out.println(String.format("| %-5s | %-9s | %-7s | %-7s | %-12s|","Номер", "Название", "Вес" , "Цена", "Добавки"));
        System.out.println("|-------+-----------+---------+---------+-------------|");
        for(int i = 0, j = 1; i < pizzas.length; i++, j++){
            System.out.println(String.format("| %-5s |%s|", j, pizzas[i]));
        }
        System.out.println("|-------+-----------+---------+---------+-------------|");
    }

}
