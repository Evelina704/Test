package com.company;

import java.util.Scanner;

public class Main {

    private static  Libraries library;
    private static Libraries[] libraries = {
            Libraries.FICTION,
            Libraries.LEGAL,
            Libraries.TECHNICAL
    };


    public static void main(String[] args) {
        while (true){
            System.out.print("Выбери отдел:\n\t1. Художественнная литература\n\t2. Юридическая литература\n\t3. Техническая литература\nВведите ответ: ");
            int result = new Scanner(System.in).nextInt();

            switch (result){
                case 1:
                    library = libraries[0];
                    System.out.println(libraries[0]);
                    break;
                case 2:
                    library = libraries[1];
                    System.out.println(libraries[1]);

                    break;
                case 3:
                    library = libraries[2];
                    System.out.println(libraries[2]);

                    break;
            }

            System.out.print("Выбери действие:\n\t1. Добавить книгу\n\t2. Вывести на консоль все книги отдела\n\t3. Вывести на консоль всю информацию отдела\n\t4. Поиск по автору книги\n\t5. Узнать количество книг в отделе\nВведите ответ: ");
            int choice = new Scanner(System.in).nextInt();

            switch (choice){
                case 1:
                    library.addBook(library.getDynamicArray());
                    break;
                case 2:
                    library.showAll(library.getDynamicArray());
                    break;
                case 3:
                    library.showInfo(library.getDynamicArray());
                    break;
                case 4:
                    System.out.print("Enter name of author: ");
                    String name = new Scanner(System.in).nextLine();
                    library.searchByAuthor(library.getDynamicArray(), name);
                    break;
                case 5:
                    library.getCountOfBook(library.getDynamicArray());
                    break;
            }

        }
    }

}
