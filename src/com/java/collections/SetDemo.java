package com.java.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetDemo
{
    private static void hashSetDemo()
    {
        Set<String> set1= new HashSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("a");

        System.out.println("Set_1:"+set1); // here duplicate data is not inserted.

        Book book1 = new Book("Walden","Henry",1854);
        Book book2 = new Book("Walden","Henry",1854);
        Set<Book> set2 =new HashSet<>();
        set2.add(book1);
        set2.add(book2);
        System.out.println("Set 2: "+set2);
    }

    public static void main(String[] args)
    {
        hashSetDemo();
    }
}

class Book
{
    private String title;
    private String author;
    private int year;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {

        return Objects.hash(title, author, year);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    public Book(String title, String author, int year)
    {
        super();
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}