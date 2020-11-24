package ru.mirea.practika7;

import java.util.Scanner;
import java.util.Stack;

public class DrunkardGameStack {
    public static Stack<Integer> reverse(Stack<Integer> a){
        Stack<Integer> temp = new Stack<>();
        while (!a.empty()) temp.push(a.pop());
        return temp;
    }

    public static Stack<Integer> addToEnd(Stack<Integer> a, int c){
        Stack<Integer> temp = reverse(a);
        temp.push(c);
        return reverse(temp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int c1, c2;
        Stack<Integer> deck1 = new Stack<>();
        Stack<Integer> deck2 = new Stack<>();
        System.out.println("Введите 5 карт первого игрока:");
        for (int i = 0; i < 5; i++) if (sc.hasNextInt()) deck1.push(sc.nextInt());
        System.out.println("Введите 5 карт второго игрока:");
        for (int i = 0; i < 5; i++) if (sc.hasNextInt()) deck2.push(sc.nextInt());
        deck1 = reverse(deck1);
        deck2 = reverse(deck2);
        while(!deck1.empty() && !deck2.empty() && count < 106) {
            c1 = deck1.peek();
            c2 = deck2.peek();
            if (c1 == 0 && c2 == 9) {
                deck1 = addToEnd(deck1, deck1.pop());
                deck1 = addToEnd(deck1, deck2.pop());
            }
            else if (c1 == 9 && c2 == 0) {
                deck2 = addToEnd(deck2, deck2.pop());
                deck2 = addToEnd(deck2, deck1.pop());
            }
            else if (c1 < c2) {
                deck2 = addToEnd(deck2, deck2.pop());
                deck2 = addToEnd(deck2, deck1.pop());
            }
            else if (c2 < c1) {
                deck1 = addToEnd(deck1, deck1.pop());
                deck1 = addToEnd(deck1, deck2.pop());
            }
            count++;
        }
        if (deck1.empty()) System.out.println("second " + count);
        else if (deck2.empty()) System.out.println("first " + count);
        else System.out.println("botva");
    }
}
