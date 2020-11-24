package ru.mirea.practika6;

import java.lang.Math;

public class TestStudent_1 {
    public static void selectionSort(Student[] array){
        for (int left = 0; left < array.length; left++) {
            int value = array[left].getiDNumber();
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i].getiDNumber()) array[i + 1].setiDNumber(array[i].getiDNumber());
                else break;
            }
            array[i + 1].setiDNumber(value);
        }
    }

    public static void main(String[] args){
        int count = 6;
        Student[] group1 = new Student[count];

        for (int i = 0; i < count; i++){
            group1[i] = new Student((int) (Math.random() * 100), "Ivan" + (i + 1));
        }
        System.out.println("Before");
        for (Student student : group1) System.out.println(student);

        selectionSort(group1);

        System.out.println("\nAfter");
        for (Student student : group1) System.out.println(student);
    }
}
