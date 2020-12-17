package com.company;



public enum State {
    COOKING("Cooking"){
        @Override
        void action(Pizza pizza) {
            System.out.println(String.format("Готовится пицца %s!", pizza.getName()));
        }
    },
    DELIVER("Deliver"){
        @Override
        void action(Pizza pizza) {
            System.out.println("Ваша пицца в пути!");
            System.out.println();
            System.out.println("|-----------+---------+---------+-------------|");
            System.out.println(String.format("| %-9s | %-7s | %-7s | %-12s|", "Название", "Вес" , "Цена", "Добавки"));
            System.out.println("|-----------+---------+---------+-------------|");

            System.out.println(String.format("|%s|", pizza));
            System.out.println("|-----------+---------+---------+-------------|");
        }
    };

    private String name;

    State(String name) {
        this.name = name;
    }

    abstract void action(Pizza pizza);
}
