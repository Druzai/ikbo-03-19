package ru.mirea.lab7;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTestApp {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<>();
        // добавим в список ряд элементов
        states.add("Германия");
        states.add("Франция");
        states.add("Россия");
        states.add("Великобритания");
        states.add("Испания");
        states.add(1, "Италия"); // добавляем элемент по индексу 1
        System.out.println(states.get(1));// получаем 2-й объект
        states.set(1, "Дания"); // установка нового значения для 2-го объекта
        System.out.printf("В списке %d элементов \n", states.size());
        for (String state : states) System.out.println(state);
        if (states.contains("Германия")) System.out.println("Список содержит государство Германия");
        // удалим несколько объектов
        states.remove("Германия");
        states.remove(0);
        Object[] countries = states.toArray();
        for (Object country : countries) System.out.println(country);
        // делаем срез массива с 1-го по 2-й элементы в лист
        List<String> states2 = states.subList(0, 2);
        System.out.printf("В листе %d элементов \n", states2.size());
        for (String state : states2) System.out.println(state);
    }
}