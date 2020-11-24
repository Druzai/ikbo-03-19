package ru.mirea.practika7;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class DrunkardGameQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int c1, c2;
        Queue<Integer> deck1 = new LinkedList<>();
        Queue<Integer> deck2 = new LinkedList<>();
        System.out.println("Введите 5 карт первого игрока:");
        for (int i = 0; i < 5; i++) if (sc.hasNextInt()) deck1.add(sc.nextInt());
        System.out.println("Введите 5 карт второго игрока:");
        for (int i = 0; i < 5; i++) if (sc.hasNextInt()) deck2.add(sc.nextInt());
        while(deck1.size() != 0 && deck2.size() != 0 && count < 106) {
            c1 = deck1.peek();
            c2 = deck2.peek();
            if (c1 == 0 && c2 == 9) {
                deck1.add(deck1.remove());
                deck1.add(deck2.remove());
            }
            else if (c1 == 9 && c2 == 0) {
                deck2.add(deck2.remove());
                deck2.add(deck1.remove());
            }
            else if (c1 < c2) {
                deck2.add(deck2.remove());
                deck2.add(deck1.remove());
            }
            else if (c2 < c1) {
                deck1.add(deck1.remove());
                deck1.add(deck2.remove());
            }
            count++;
        }
        if (deck1.size() == 0) System.out.println("second " + count);
        else if (deck2.size() == 0) System.out.println("first " + count);
        else System.out.println("botva");
    }
}
