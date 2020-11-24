package ru.mirea.practika6;

import java.lang.Math;

public class TestMergeSort {
    public static Student[] mergeSort(Student[] list) {
        if (list.length <= 1) return list;
        // Разделяем массив на два
        Student[] first = new Student[list.length / 2];
        Student[] second = new Student[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);

        mergeSort(first);
        mergeSort(second);

        merge(first, second, list);
        return list;
    }

    private static void merge(Student[] first, Student[] second, Student[] result) {
        int iFirst = 0;
        int iSecond = 0;
        int iMerged = 0;
        // Сравниваем элементы по индексам iFirst и iSecond и перемещаем меньший элемент по индексу iMerged
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst].compareTo(second[iSecond]) < 0) {
                result[iMerged] = first[iFirst];
                iFirst++;
            }
            else {
                result[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }
        // Копирование из first и second в result
        System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
        System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
    }

    private static Student[] unify(Student[] array1, Student[] array2){
        Student[] unified = new Student[array1.length+array2.length];
        for(int i = 0; i < unified.length; i++){
            if (i<array1.length) unified[i] = array1[i];
            else unified[i] = array2[i - array1.length];
        }
        return unified;
    }

    public static void main(String[] args) {
        int count = 6;
        Student[] group1 = new Student[count];
        Student[] group2 = new Student[count];

        for (int i = 0; i < count; i++){
            group1[i] = new Student("Ivan" + (i + 1), (int) (Math.random() * 100));
            group2[i] = new Student("Pavel" + (i + 1), (int) (Math.random() * 100));
        }
        System.out.println("Before");
        for (Student student : group1) System.out.println(student);
        for (Student student : group2) System.out.println(student);

        Student[] s = mergeSort(unify(group1, group2));

        System.out.println("\nAfter");
        for (Student student : s) System.out.println(student);
    }
}