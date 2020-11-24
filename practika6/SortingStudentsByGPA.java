package ru.mirea.practika6;

import java.lang.Math;

public class SortingStudentsByGPA {
    private static int partition(Student[] array, int low, int high) {
        Student pivot = array[high];
        int i = (low-1); // Индекс меньшего элемента
        for (int j=low; j<high; j++) {
            if (array[j].compareTo(pivot) < 0) { // Текущий элемент меньше опорного
                i++;
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        Student temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return i+1;
    }

    public static void quickSort(Student[] array, int low, int high) {
        if (array.length == 0) return;
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi-1);
            quickSort(array, pi+1, high);
        }
    }

    public static void main(String[] args) {
        int count = 6;
        Student[] group1 = new Student[count];

        for (int i = 0; i < count; i++){
            group1[i] = new Student("Ivan" + (i + 1), (int) (Math.random() * 100));
        }
        System.out.println("Before");
        for (Student student : group1) System.out.println(student);

        quickSort(group1, 0, group1.length - 1);
        System.out.println("\nAfter");
        for (Student student : group1) System.out.println(student);
    }
}