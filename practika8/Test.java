package ru.mirea.practika8;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private static void test(IWaitList<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
        System.out.println(list);
        System.out.println("Содержит 1: " + list.contains(1));
        System.out.println("Содержит 7: " + list.contains(7));
        System.out.println("Удалить первый элемент: " + list.remove());
        System.out.println("Пуст?: " + list.isEmpty());
        List<Integer> test = new ArrayList<>();
        test.add(3);
        test.add(4);
        test.add(5);
        System.out.println("Содержит лист test?: " + list.containsAll(test));
        System.out.println();
    }

    public static void main(String[] args) {
        IWaitList<Integer> boundedWaitList = new BoundedWaitList<>(10);
        IWaitList<Integer> unfairWaitList = new UnfairWaitList<>();
        test(boundedWaitList);
        test(unfairWaitList);
    }
}
