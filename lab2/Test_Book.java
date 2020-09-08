package ru.mirea.lab2;

public class Test_Book {
    public static void main(String[] args){
        Book b = new Book("Ann", "Text", 2001);
        System.out.println(b.getAuthor());
        System.out.println(b.getName());
        System.out.println(b.getYear_of_publishing());
        b.setAuthor("Coll");
        b.setName("Hoi");
        System.out.println(b);
    }
}
