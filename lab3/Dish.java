package ru.mirea.lab3;

public abstract class Dish {
    protected String name, color;
    protected boolean full;

    public Dish(){
        this.name = "plate";
        this.color = "white";
        this.full = false;
    }

    public Dish(String name, String color, boolean full){
        this.name = name;
        this.color = color;
        this.full = full;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public abstract String getFill();

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", full=" + full +
                '}';
    }
}
