package ru.mirea.practika11;

import java.util.Scanner;

public class Tests {
    public static void main(String[] ar) {
        ArrayQueueModule<Integer> aqm = new ArrayQueueModule<>();
        LinkedQueue<Integer> lq = new LinkedQueue<>();
        Scanner sc = new Scanner(System.in);
        int temp = 0;

        System.out.println("Введите 4 значения типа int: ");
        for (int i = 0; i < 4; i++) {
            if (sc.hasNextInt())
                temp = sc.nextInt();
            aqm.add(temp);
            lq.enqueue(temp);
        }
        ArrayQueue<Integer> aq = new ArrayQueue<>(aqm.getList());
        ArrayQueueADT<Integer> aqa = new ArrayQueueADT<>();
        System.out.println("Вывод 1-го элемента aq, размера aqa и печать aqm");
        System.out.println(aq.element());
        System.out.println(aqa.size(aqm.getList()));
        System.out.println(aqm);
        System.out.println("Вывод lq, удаление 1-го элемента и снова вывод lq");
        System.out.println(lq);
        lq.dequeue();
        System.out.println(lq);
        System.out.println("Добавление в aq элемента 13 и вывод очереди");
        aq.enqueue (13);
        System.out.println(aq);
        System.out.println("Добавление в aqm элемента через экземпляр класса ArrayQueueADT 'aqa' и вывод aqm");
        aqa.enqueue(aqm.getList(), 15);
        System.out.println(aqm);
    }
}
