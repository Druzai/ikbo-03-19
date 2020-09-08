package ru.mirea.lab2;

public class Book {
    private String author, name;
    private int year_of_publishing;
    public Book(String author, String name, int year_of_publishing){
        this.author = author;
        this.name = name;
        this.year_of_publishing = year_of_publishing;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYear_of_publishing() {
        return year_of_publishing;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear_of_publishing(int year_of_publishing) {
        this.year_of_publishing = year_of_publishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year_of_publishing=" + year_of_publishing +
                '}';
    }
}
