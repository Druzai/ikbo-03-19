package ru.mirea.lab4;

public class Car implements Nameable {
    protected String name, model;
    protected int price;

    public Car(){
        this.name = "Nma";
        this.model = "KIA";
        this.price = 32000;
    }

    public Car(String name, String model, int price){
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
