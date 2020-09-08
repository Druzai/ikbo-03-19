package ru.mirea.practika3;

public class Square extends Rectangle{
    public Square(){
        this.color = "red";
        this.filled = false;
        this.length = 4.0;
        this.width = length;
    }

    public Square(double side){
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color, boolean filled){
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side=" + width +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
