package ru.mirea.practika16;

public class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException(String e){
        super(e);
    }
}
