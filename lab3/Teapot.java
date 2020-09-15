package ru.mirea.lab3;

public class Teapot extends Dish {
    protected double volume, liquidVolume;

    public Teapot(){
        super();
        this.volume = 14.0;
        this.liquidVolume = 4.0;
    }

    public Teapot(String name, String color, boolean full, double volume, double liquidVolume){
        super(name, color, full);
        this.volume = volume;
        this.liquidVolume = liquidVolume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getLiquidVolume() {
        return liquidVolume;
    }

    public void setLiquidVolume(double liquidVolume) {
        this.liquidVolume = liquidVolume;
    }

    @Override
    public String getFill() {
        return Double.toString(Math.round(liquidVolume / volume * 100.0) / 100.0);
    }

    @Override
    public String toString() {
        return "Teapot{" +
                "volume=" + volume +
                ", liquidVolume=" + liquidVolume +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", full=" + full +
                '}';
    }
}
