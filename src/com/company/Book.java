package com.company;

import java.util.UUID;

public class Book {
    private UUID id;
    private String authorName;
    private String Name;
    private int year;

    public Book(String authorName, String name, int year) {
        this.id = UUID.randomUUID();
        this.authorName = authorName;
        Name = name;
        this.year = year;
    }


    public String getAuthorName() {
        return authorName;
    }

    @Override
    public String toString() {
        return "\nBook:\n" +
                "\nid: " + id +
                "\nauthorName: " + authorName +
                "\nName: " + Name +
                "\nyear: " + year;
    }
}
