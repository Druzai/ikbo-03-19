package ru.mirea.practika1;

public class Dog {
    private final String name, breed;
    private final double weight;
    public Dog(String n, String b, double w){
        this.name = n;
        this.breed = b;
        this.weight = w;
    };
    public String call(){
        return name + "! Arf!!";
    }
    @Override
    public String toString() {
        return "Class Dog:\n" + "name= '" + name + "'\n" + "breed= '" + breed + "'\n" +
                "weight= '" + weight + "'\n";
    }
}