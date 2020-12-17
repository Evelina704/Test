package com.company;

public class Main {
    public static void main(String[] args) {
        while (true){
            Orders orders = new Orders();
            System.out.print("Выберите действие:\n\t1. Добавить пиццу\n\t2. Посмотреть список\nВведите число: ");
            int num = Utils.getNumber(1,2);
            switch (num){
                case 1:
                    add();
                    break;
                case 2:
                    orders.showAll();
                    orders.choosePizza();
                    break;
            }
        }

    }

    private static void add(){
        System.out.print("Выберите пиццу:\n\t1. Пепперони\n\t2. Маргарита\n\t3. Ла Финта\nВведите число: ");
        int number = Utils.getNumber(1,3);
        Size size = chooseSize();
        boolean topping;
        switch (number){
            case 1:
                topping = chooseTopping("Острая", "Не острая");
                Orders.addPizza(new Pepperoni(size.getPrice(), size.getWeight(), State.COOKING, topping));
                break;
            case 2:
                topping = chooseTopping("С мясом", "Без мяса");
                Orders.addPizza(new Margarita(size.getPrice(), size.getWeight(), State.COOKING, topping));
                break;
            case 3:
                topping = chooseTopping("С грибами", "Без грибов");
                Orders.addPizza(new LaFinta(size.getPrice(), size.getWeight(), State.COOKING, topping));
                break;
            default:
                add();
        }
    }

    private static boolean chooseTopping(String first, String second) {
        System.out.print(String.format("Выберите:\n\t1. %s\n\t2. %s\nВведите число: ", first, second));
        int topping = Utils.getNumber(1,2);
        if(topping == 1){
            return true;
        }else return false;
    }

    private static Size chooseSize(){
        System.out.print("Выберите размер пиццы:\n\t1. Большая\n\t2. Средняя\n\t3. Маленькая\nВведите число: ");
        int sizeNum = Utils.getNumber(1,3);

        switch (sizeNum){
            case 1:
                return Size.LARGE;
            case 2:
                return Size.MEDIUM;
            case 3:
                return Size.SMALL;
            default:
                return chooseSize();
        }
    }
}
