package ru.mirea.practika9;

public class EmptyStringException extends Throwable {
    public EmptyStringException(String s) {
        super(s);
    }
}