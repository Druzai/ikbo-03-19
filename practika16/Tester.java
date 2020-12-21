package ru.mirea.practika16;


public class Tester {
    public static void main(String[] ar) {
        OrderManager om = new OrderManager();
        RestaurantOrder ro = new RestaurantOrder();
        InternetOrder io = new InternetOrder();

        try {
            // Попытка создать напиток с -1 ценой
            // Drink screwdriver = new Drink("Screwdriver", "1.5", -1);
            Drink vodka = new Drink("Vodka", "0.5", 150);
            Drink redWine = new Drink("Red wine", "0.8", 305);
            Dish florida = new Dish("Florida", "florida", 120);
            Drink coffee = new Drink("Coffee", "0.2", 30);
            Dish chicken = new Dish("Chicken", "chicken", 250);
            Dish pasta = new Dish("Pasta", "pasta", 150);
            io.add(redWine);
            io.add(florida);
            io.add(chicken);
            ro.add(vodka);
            ro.add(coffee);
            ro.add(pasta);
            ro.add(pasta);
            ro.add(chicken);
            om.add(1, ro);
            om.add(2, ro);
            // Попытка добавить ещё один заказ на столик 1
            // om.add(1, ro);
            om.add("Moscow", io);
            System.out.println(ro.CostTotal());
            System.out.println(om.RestaurantOrdersCostSummary());
            System.out.println(ro.dishQuantity());
            System.out.println(ro.dishQuantity("Pasta"));
            System.out.println(io.getSize());
            System.out.println(io.CostTotal());
            io.remove("Chicken");
            System.out.println(io.getSize());
            System.out.println(io.CostTotal());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
