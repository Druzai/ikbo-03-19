package ru.mirea.practika6;

import java.lang.Math;

public class TestStudent_1 {
    public static void main(String[] args){
        int count = 6;
        Student[] group1 = new Student[count];

        for (int i = 0; i < count; i++){
            group1[i] = new Student((int) (Math.random() * 100), "Ivan" + (i + 1));
        }
        System.out.println("Before");
        for (Student student : group1) System.out.println(student);
        /*
        Student[] group1 = new Student [6];
        group1[0] = new Student(0,"Ivan1");
        group1[1] = new Student(11,"Ivan2");
        group1[2] = new Student(93,"Ivan3");
        group1[3] = new Student(6,"Ivan4");
        group1[4] = new Student(9,"Ivan5");
        group1[5] = new Student(55,"Ivan6");
        System.out.println("Before");
        for (Student item : group1) System.out.println("IDNumber - " + item.getiDNumber());
        */
        for (int left = 0; left < group1.length; left++) {
            int value = group1[left].getiDNumber();
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < group1[i].getiDNumber()) group1[i + 1].setiDNumber(group1[i].getiDNumber());
                else break;
            }
            group1[i + 1].setiDNumber(value);
        }
        System.out.println("\nAfter");
        for (Student student : group1) System.out.println(student);
    }
}
