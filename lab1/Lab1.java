package ru.mirea.lab1;
import java.util.Scanner;
import java.lang.Math;


public class Lab1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int u = 0;
        System.out.print("Введите длинну массива: ");
        if(sc.hasNextInt()){
            u = sc.nextInt();
        }
        int[] a = new int[u];
        for(int i = 0; i < u; i++){
            if(sc.hasNextInt()){
                a[i] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i = 0; i < u; i++){
            sum += a[i];
        }
        System.out.print("for: " + sum + "\n");
        sum = 0;
        int s = 0;
        while(s < u){
            sum += a[s];
            s++;
        }
        System.out.print("while: " + sum + "\n");
        sum = 0;
        int t = 0;
        do{
            sum += a[t];
            t++;
        }while (t < u);
        System.out.print("do while: " + sum);
        System.out.print("\nАргументы коммандной строки:\n");
        if(sc.hasNext()){
            //str r = sc.next();
            System.out.print(sc.next());
        }
        System.out.print("\nГармоники:\n");
        double count = 1;
        for(int i = 0; i < 10; i++){
            System.out.print( (1 / count) + "\n");
            count++;
        }
        System.out.print("Рандомные числа\n");
        for(int i = 0; i < u; i++){
            a[i] = (int) (Math.random() * 100);
            System.out.print(a[i] + "\n");
        }
        for(int i = 0; i < u; i++){
            for(int r = 0; r < u; r++){
                if(a[i] < a[r]){
                    int temp = a[i];
                    a[i] = a[r];
                    a[r] = temp;
                }
            }
        }
        System.out.print("Сортированный массив\n");
        for(int i = 0; i < u; i++){
            System.out.print(a[i] + "\n");
        }
        System.out.print("Факториал числа\nВведите число: ");
        int y = 0;
        if(sc.hasNextInt()){
            y = sc.nextInt();
        }
        y = factorial(y);
        System.out.print(y);
    }
    public static int factorial(int fac){
        int res = 1;
        for(int i = 1; i <= fac; i++){
            res *= i;
        }
        return res;
    }
}
