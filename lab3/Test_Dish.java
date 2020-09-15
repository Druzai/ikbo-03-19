package ru.mirea.lab3;

public class Test_Dish {
    public static void main(String[] args){
        Plate pl = new Plate();
        System.out.println(pl.toString());
        System.out.println(pl.getFill());
        pl.setRadius(15.0);
        System.out.println(pl.getRadius());
        System.out.println(pl.getFill());
        Teapot t = new Teapot("N-1", "black", false, 20.0, 5.0);
        System.out.println(t.toString());
        System.out.println(t.getFill());
    }
}
