package ru.mirea.lab4;

public class Test_Nameable {
    public static void main(String[] args){
        Car c = new Car("Doge", "Kia", 5000000);
        System.out.println(c.getName());
        System.out.println(c);
    }
}
