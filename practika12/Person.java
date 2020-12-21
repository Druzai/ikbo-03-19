package ru.mirea.practika12;

public class Person {
    private String surname = null, name = null, patronymic = null;
    Person(String surname, String name, String patronymic){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }
    Person(String surname){
        this.surname = surname;
    }
    public String getFCS(){
        if(name == null)
            return surname;
        else
            return String.format("%s %.1s.%.1s.", surname, name, patronymic);
    }
}
