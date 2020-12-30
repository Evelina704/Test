package com.company;

import java.util.Scanner;

public enum Libraries {
    FICTION("Fiction", new DynamicArray()),
    LEGAL("Legal", new DynamicArray()),
    TECHNICAL("Technical", new DynamicArray()){
        @Override
        public void showInfo(DynamicArray dynamicArray) {
            super.showInfo(dynamicArray);

            System.out.println("Properties: Computer" );
        }
    };


    protected String name;
    protected DynamicArray dynamicArray;

    Libraries(String name, DynamicArray dynamicArray) {
        this.name = name;
        this.dynamicArray = dynamicArray;
    }

    public String getName() {
        return name;
    }

    public DynamicArray getDynamicArray() {
        return dynamicArray;
    }

    public String makeName(String str){
        System.out.print(str);
        String authorName = new Scanner(System.in).nextLine();
        if(!authorName.equals("")){
            return authorName;
        } else {
            System.out.println("Что-то пошло не так!");
            return makeName(str);
        }
    }

    public int makeYear(){
        try{
            System.out.print("Enter year: ");
            int year = new Scanner(System.in).nextInt();;

            return year;
        } catch (NumberFormatException e){
            System.out.println("Что-то пошло не так!");
            return makeYear();
        }
    }

    public void addBook(DynamicArray dynamicArray){
        String authorName = makeName("Enter name of author: ");
        String name = makeName("Enter name of book: ");
        int year = makeYear();

        Book book = new Book(authorName,name,year);
        dynamicArray.addBook(book);

    }


    public String show(DynamicArray dynamicArray){
        String str = "";
        if(dynamicArray.getBooks().length == 0){
            str += " Empty";
        }else {
            str += "\n";
            for (var book : dynamicArray.getBooks()) {
                str += String.format("\t %s \n", book);
            }
        }

        return  str;
    }

    public void showAll(DynamicArray dynamicArray){
        for(var book: dynamicArray.getBooks() ){
            System.out.println(book);
        }
    }
    public void showInfo(DynamicArray dynamicArray){
        System.out.println("Текущий отдел: " + getName());
        if(dynamicArray.getBooks().length == 0){
            System.out.println("Сейчас нет книг в этом отделе!");
        }else {
            for(var book: dynamicArray.getBooks() ){
                System.out.println(book);
            }
            getCountOfBook(dynamicArray);
        }




    }
    public void searchByAuthor(DynamicArray dynamicArray, String authorName){
        for(var book: dynamicArray.getBooks() ){
            if(book.getAuthorName().toLowerCase().equals(authorName.toLowerCase())){
                System.out.println(book);
            }
        }
    }
    public void getCountOfBook(DynamicArray dynamicArray){
        int count = dynamicArray.getBooks().length;
        System.out.println(String.format("В этом отделе всего %s книг", count));
    }


    @Override
    public String toString() {
        return String.format("Libraries: %s\nBooks:" +show(dynamicArray), name);
    }


}
