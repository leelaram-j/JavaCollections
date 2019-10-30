package com.java.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo
{
    private static void treeSetDemo()
    {
        Book1 book1 = new Book1("Harry Potter","J.K Rowling",1997);
        Book1 book2 = new Book1("Harry Potter","J.K Rowling",1997);
        Book1 book3 = new Book1("Walden","Henry",1854);
        Book1 book4 = new Book1("Effective Java","Joshua",2008);

        Set<Book1> books = new TreeSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        for(Book1 book:books)
        {
            System.out.println(book);
        }

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("abc");
        treeSet.add("111");
        treeSet.add("cyz");
        System.out.println("String TreeSet:"+treeSet);

        Set<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(3423);
        treeSet1.add(23);
        treeSet1.add(5);
        System.out.println("String TreeSet:"+treeSet1);


    }

    public static void main(String[] args)
    {
        treeSetDemo();
    }
}


class Book1 implements Comparable {

    @Override
    public String toString() {
        return "Book1{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    private String title;
    private String author;
    private int year;

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

    public Book1(String title, String author, int year) {
        super();
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public int compareTo(Object o) {
        return getTitle().compareTo(((Book1)o).getTitle());
    }
}
