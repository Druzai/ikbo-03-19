package ru.mirea.practika16;

public final class Dish implements Item {
    private final String name, description;
    private final double cost;

    public Dish(String name, String description, double cost) throws IllegalArgumentException {
        if (name.equals("")) throw new IllegalArgumentException("Название должно быть не пустой строкой!");
        if (description.equals("")) throw new IllegalArgumentException("Описание должно быть не пустой строкой!");
        if (cost < 0) throw new IllegalArgumentException("Цена не может быть меньше нуля!");
        this.name = name;
        this.description = description;
        this.cost = cost;

    }
    public Dish(String name, String description) throws IllegalArgumentException {
        if (name.equals("")) throw new IllegalArgumentException("Название должно быть не пустой строкой!");
        if (description.equals("")) throw new IllegalArgumentException("Описание должно быть не пустой строкой!");
        this.name = name;
        this.description = description;
        this.cost = 0;
    }

    public double getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Цена: " + cost + ", название блюда: " + name;
    }
}
