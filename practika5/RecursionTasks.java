package ru.mirea.practika5;

import java.util.Scanner;


public class RecursionTasks {
    public static int zero_one_sequence(int zeros, int ones){
        if (zeros > ones + 1) return 0;
        if (zeros == 0 && ones == 0) return 0;
        if (zeros == 0 || ones == 0) return 1;
        return zero_one_sequence(zeros, ones - 1) + zero_one_sequence(zeros - 1, ones - 1);
    }

    public static int reverse(int numb, int temp){
        if (numb == 0) return temp;
        return reverse(numb / 10, temp * 10 + numb % 10);
    }

    public static int count(){
        Scanner sc = new Scanner(System.in);
        String str = "";
        if (sc.hasNext()) str = sc.next();
        if (str.equals("00")) return 0;
        return (Integer.parseInt(str) == 1) ? count() + 1: count();
    }

    public static void main(String[] args){
        // Задание 9. Без двух нулей
        int a = 4;
        int b = 6;
        System.out.println(zero_one_sequence(a, b));
        // Задание 10. Разворот числа
        int n = 127394;
        System.out.println(reverse(n, 0));
        // Задание 11. Количество едениц
        System.out.println(count());
    }
}