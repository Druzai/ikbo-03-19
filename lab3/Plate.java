package ru.mirea.lab3;

import java.lang.Math;

public class Plate extends Dish {
    protected double radius, foodVolume;

    public Plate(){
        super();
        this.radius = 9.0;
        this.foodVolume = 4.0;
    }

    public Plate(String name, String color, boolean full, double radius, double foodVolume){
        super(name, color, full);
        this.radius = radius;
        this.foodVolume = foodVolume;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getFoodVolume() {
        return foodVolume;
    }

    public void setFoodVolume(double foodVolume) {
        this.foodVolume = foodVolume;
    }

    @Override
    public String getFill() {
        return Double.toString(Math.round(foodVolume / radius * 100.0) / 100.0);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "radius=" + radius +
                ", foodVolume=" + foodVolume +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", full=" + full +
                '}';
    }
}
