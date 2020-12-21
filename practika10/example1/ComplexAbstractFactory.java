package ru.mirea.practika10.example1;

public interface ComplexAbstractFactory {
    Complex createComplex();
    Complex createComplex(int real, int image);
}