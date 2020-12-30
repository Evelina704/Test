package com.company;

public class DynamicArray {
    private static Book[] books = new Book[0];

    public void addBook(Book book){

            Book[] newBooks = new Book[books.length + 1];
            System.arraycopy(books, 0, newBooks, 0, books.length);
            books = newBooks;
            books[books.length - 1] = book;

    }


    public static Book[] getBooks() {
        return books;
    }
}
