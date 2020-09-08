package ru.mirea.practika1;

public class Ball {
    private String name;
    private double weight;

    public Ball(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
